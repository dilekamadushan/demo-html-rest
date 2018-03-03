package org.madushan.demo.domain;

import javax.persistence.*;
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
	private String formLabel;
	
	//@ApiModelProperty(notes = "The form description")
	private String description;
	
	//@ApiModelProperty(notes = "The set of observations")
	@ElementCollection(targetClass=Observation.class)
	private List<Observation> observations;
	
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void addObservation(Observation observation) {
		this.observations.add(observation);
	}
	
	public List<Observation> getObservations() {
		return observations;
	}
	
}
