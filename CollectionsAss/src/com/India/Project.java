package com.India;
import java.util.*;
public class Project {
	private String name;
	private String details;
	private Set<String> teammembers;
	
	public Project(String name,String details) {
		this.name =name;
		this.details=details;
		this.teammembers=new HashSet<>();
	}
	public void addteammember(String member) {
		teammembers.add(member);
	}

	@Override
	public String toString() {
		return "Project [name=" + name + ", details=" + details + ", teammembers=" + teammembers + "]";
	}

	

	
	

}
