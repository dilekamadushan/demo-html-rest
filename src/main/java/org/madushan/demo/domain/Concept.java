package org.madushan.demo.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by dileka on 3/3/18.
 */
@Entity
public class Concept {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@ApiModelProperty(notes = "The database generated concept ID")
	private Integer id;
	
	//@ApiModelProperty(notes = "The concept label")
	private String conceptLabel;
	
	//@ApiModelProperty(notes = "The concept description")
	
	private String description;
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getConceptLabel(String conceptLabel) {
		return  this.conceptLabel;
	}
	
	public void setConceptLabel(String conceptLabel) {
		this.conceptLabel = conceptLabel;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}
