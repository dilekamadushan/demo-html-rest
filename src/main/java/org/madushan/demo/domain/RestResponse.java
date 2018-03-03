/*
package org.madushan.demo.domain;

import javax.persistence.*;
import java.util.List;

*/
/**
 * Created by dileka on 3/3/18.
 *//*

@Entity
public class RestResponse {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@ApiModelProperty(notes = "The database generated product ID")
	private Integer id;

	//@ApiModelProperty(notes = "The HTMLPage description")
	private String description;
	
	
	//@ApiModelProperty(notes = "The HTMLPage")
	@ElementCollection(targetClass=HTMLPage.class)
	private List<HTMLPage> htmlPages;
	
	//@ApiModelProperty(notes = "The Response code")
	private Integer responseCode;
	
	public Integer getId(){
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public List<HTMLPage> getHTMLPages() {
		return htmlPages;
	}
	
	public void setHTML(HTMLPage htmlPage) {
		this.htmlPages.add(htmlPage);
	}
	
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}
	
	public Integer getResponseCode() {
		return responseCode;
	}
	
	
	
}
*/
