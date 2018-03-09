package org.madushan.demo.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by dileka on 3/3/18.
 */
@Entity
public class HTMLForm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@ApiModelProperty(notes = "The database generated form ID")
	private Integer id;
	
	//@ApiModelProperty(notes = "The form label")
	private String formXml;
	
	private Date createdDate;
	
	//@ApiModelProperty(notes = "The form description")
	private String description;
	
	//@ApiModelProperty(notes = "The set of observations")
	
	private String createdBy;
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setFormXml(String formXml) {
		this.formXml = formXml;
	}
	
	public String getFormXml() {
		return formXml;
	}
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public String getCreatedBy() {
		return createdBy;
	}
	
}
