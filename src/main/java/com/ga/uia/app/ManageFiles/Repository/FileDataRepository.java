package com.ga.uia.app.ManageFiles.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ga.uia.app.ManageFiles.Model.FileData;

@Repository
public interface FileDataRepository extends JpaRepository<FileData,String>{
	
	
	

}
