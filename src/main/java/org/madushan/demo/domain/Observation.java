package org.madushan.demo.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by dileka on 3/3/18.
 */
@Entity
public class Observation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@ApiModelProperty(notes = "The database generated observation ID")
	private Integer id;
	
	//@ApiModelProperty(notes = "The conceptId of the Observation")
	private String concept;
	
	//@ApiModelProperty(notes = "The observation description")
	private String description;
	
	//@ApiModelProperty(notes = "The Encounter of the observation")
	@ElementCollection(targetClass=String.class)
	private List<String> encounters;
	
	//@ApiModelProperty(notes = "The created dateTime")
	private Date date;
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setEncounter(String encounter) {
		this.encounters.add(encounter);
	}
	
	public List<String> getEncounter() {
		return encounters;
	}
	
	
	public String getConcept() {
		return this.concept;
	}
}
