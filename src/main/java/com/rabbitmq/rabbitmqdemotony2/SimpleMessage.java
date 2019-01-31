package com.rabbitmq.rabbitmqdemotony2;

import java.io.Serializable;

public class SimpleMessage implements Serializable {
	private String name;
	private String description;
	
	
	
	public SimpleMessage() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String toString(){
		return "SimpleMessage("+
				"name="+name+  '\'' +
				", description='"+description + '\''+
				'}';
				
	}
	
}
