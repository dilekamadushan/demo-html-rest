package org.madushan.demo.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by dileka on 3/4/18.
 */
@Entity
public class HTMLPage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String title;
	
	
	private String body;
	
	@ElementCollection(targetClass=HTMLForm.class)
	private List<HTMLForm> htmlForms;
	
	@ElementCollection(targetClass=Encounter.class)
	private List<Encounter> encounters;
	
	private String responseCode;
	
	
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
	
	public void setBody(String body) {
		this.body = body;
	}
	
	public String getBody() {
		return body;
	}
	
	
	public void setMessage(String responseCode) {
		this.responseCode = responseCode;
	}
	
	public String  getResponseCode() {
		return  responseCode;
	}
	
	public void   setResponseCode(String responseCode) {
		this.responseCode =  responseCode;
	}
	
	public void addForm(HTMLForm htmlForm){
		htmlForms.add(htmlForm);
	}
	
	public void addForm(List<HTMLForm> htmlForms){
		htmlForms.addAll(htmlForms);
	}
	
	public List<HTMLForm> getHTMLForms(){
		return htmlForms;
	}
	
	public void addEncounter(Encounter encounter){
		encounters.add(encounter);
	}
	
	public void addEncounter(List<Encounter> encounters){
		encounters.addAll(encounters);
	}
	
	public List<Encounter> getEncounters(){
		return encounters;
	}
	
}
