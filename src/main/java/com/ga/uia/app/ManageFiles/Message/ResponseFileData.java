package com.ga.uia.app.ManageFiles.Message;

public class ResponseFileData {
	
	 private String name;
	  private String url;
	  private String type;
	  private long size;
	  private String section;

	  public ResponseFileData(String name, String url, String type, long size) {
	    this.name = name;
	    this.url = url;
	    this.type = type;
	    this.size = size;
	   
	  }
	  
	  public ResponseFileData(String name, String url, String type, long size,String section) {
		    this.name = name;
		    this.url = url;
		    this.type = type;
		    this.size = size;
		    this.section = section;
		  }

	  public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getUrl() {
	    return url;
	  }

	  public void setUrl(String url) {
	    this.url = url;
	  }

	  public String getType() {
	    return type;
	  }

	  public void setType(String type) {
	    this.type = type;
	  }

	  public long getSize() {
	    return size;
	  }

	  public void setSize(long size) {
	    this.size = size;
	  }
	

}
