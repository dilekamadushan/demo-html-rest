package org.madushan.demo.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by dileka on 3/3/18.
 */
@Entity
public class Encounter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@ApiModelProperty(notes = "The database generated encounter ID")
	private Integer id;
	
	private Integer patientId;

	private Integer providerId;
	
	private Date date;
	
	private String observation;
	
	private Integer formId;
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}
	
	public String getObservation() {
		return observation;
	}
	
	public void setProviderId(Integer providerId) {
		this.providerId = providerId;
	}
	
	public Integer getProvider() {
		return providerId;
	}
	
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	
	public Integer getPatientId() {
		return patientId;
	}
	public void setFormId(Integer formId) {
		this.formId = formId;
	}
	
	
}
