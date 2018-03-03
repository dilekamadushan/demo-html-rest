/*
package org.madushan.demo.domain;

import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

*/
/**
 * Created by dileka on 3/3/18.
 *//*

public class HTMLPage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@ApiModelProperty(notes = "The database generated HTMLPage ID")
	private Integer id;
	
	//@ApiModelProperty(notes = "The HTMLPage title")
	private String title;
	
	//@ApiModelProperty(notes = "The HTMLPage header")
	private String header;
	
	//@ApiModelProperty(notes = "The HTMLPage body")
	private String body;
	
	//@ApiModelProperty(notes = "The HTMLPage footer")
	private String footer;
	
	//@ApiModelProperty(notes = "The list of HTMLForms")
	@ElementCollection(targetClass=HTMLForm.class)
	private List<HTMLForm> htmlForms;
	
	//@ApiModelProperty(notes = "The HTMLPage message")
	private String message;
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	
	public void setBody(String body) {
		this.body = body;
	}
	
	public void setFooter(String header) {
		this.footer = footer;
	}
	
	public String getFooter() {
		return  footer;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String  getMessage() {
		return  message;
	}
	
	public void addForm(HTMLForm htmlForm){
		htmlForms.add(htmlForm);
	}
	
	public List<HTMLForm> getHTMLForms(){
		return htmlForms;
	}
	
}
*/
