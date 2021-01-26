package com.ga.uia.app.ManageFiles.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "filedata")
public class FileData implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4912850443159424715L;

	/**
	 * 
	 */
	

	  @Id
	  @GeneratedValue(generator = "uuid")
	  @GenericGenerator(name = "uuid", strategy = "uuid2")
	  private String id;

	  @Column(name="namefile" , length = 200)
	  private String namefile;

	  @Column(name="typefile" , length = 100)
	  private String typefile;

	  @Lob
	  private byte[] data;
	  
	  @Column(name="section" , length = 100)
	  private String section;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNamefile() {
		return namefile;
	}

	public void setNamefile(String namefile) {
		this.namefile = namefile;
	}

	public String getTypefile() {
		return typefile;
	}

	public void setTypefile(String typefile) {
		this.typefile = typefile;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public FileData(String namefile, String typefile, byte[] data, String section) {
		super();
		this.namefile = namefile;
		this.typefile = typefile;
		this.data = data;
		this.section = section;
	}
	  
	public FileData() {
	  }

}
