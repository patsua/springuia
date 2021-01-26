package com.ga.uia.app.ManageFiles.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.ga.uia.app.ManageFiles.Model.FileData;
import com.ga.uia.app.ManageFiles.Repository.FileDataRepository;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
@Service
public class FileDataService {
	
	@Autowired
	private FileDataRepository fileDataRepository;
	
	
	public FileData store(MultipartFile file, String section) throws IOException {
	    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		   
		FileData FileData = new FileData(fileName, file.getContentType(), file.getBytes(), section );

	    return fileDataRepository.save(FileData);
	  }

	  public FileData getFile(String id) {
	    return fileDataRepository.findById(id).get();
	  }
	  
	  	  
	  public Stream<FileData> getAllFiles() {
		     
	    return fileDataRepository.findAll().stream();
	  }

}
