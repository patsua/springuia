package com.ga.uia.app.ManageFiles.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ga.uia.app.ManageFiles.Message.ResponseMessage;
import com.ga.uia.app.ManageFiles.Model.FileData;
import com.ga.uia.app.ManageFiles.Message.ResponseFileData;
import com.ga.uia.app.ManageFiles.Services.FileDataService;

@RestController
public class FileDataController {
	
	@Autowired
	private FileDataService fileDataService;
	
	
	@RequestMapping(method=RequestMethod.POST, value ="/upload")
	
	  public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("section") String section) {
	    String message = "";
	    try {
	    	
	    	fileDataService.store(file, section);

	      message = "Uploaded the file successfully: " + file.getOriginalFilename();
	      return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
	    } catch (Exception e) {
	      message = "Could not upload the file: " + file.getOriginalFilename() + "!";
	      return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
	    }
	  }
	
	@RequestMapping(method=RequestMethod.GET, value ="/files")
	   public ResponseEntity<List<ResponseFileData>> getListFiles() {
	    List<ResponseFileData> files = fileDataService.getAllFiles().map(dbFile -> {
	      String sectionname = dbFile.getSection().toString();
	      String fileDownloadUri = ServletUriComponentsBuilder
	          .fromCurrentContextPath()
	          .path("/files/")
	          .path(dbFile.getId())
	           . toUriString();
	    	  
	          
	         

	      return new ResponseFileData(
	          
	          dbFile.getNamefile(),
	          fileDownloadUri,
	          dbFile.getTypefile(),
	          dbFile.getData().length,
	          sectionname
	          );
	    	
	    	 
	         
	    }).collect(Collectors.toList());
        
	    return ResponseEntity.status(HttpStatus.OK).body(files);
	  }
	
	@RequestMapping(method=RequestMethod.GET, value ="/files/{id}")
	  public ResponseEntity<byte[]> getFile(@PathVariable String id ) {
	    FileData fileDB = fileDataService.getFile(id);
	 

	    return ResponseEntity.ok()
	        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileDB.getNamefile() + "\"")
	        .body(fileDB.getData());
	        
	        		
	       
	        
	         
	  }

}
