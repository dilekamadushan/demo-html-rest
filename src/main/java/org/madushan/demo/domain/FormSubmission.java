package org.madushan.demo.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class FormSubmission {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@ApiModelProperty(notes = "The database generated concept ID")
	private Integer id;
	
	
	//@ApiModelProperty(notes = "The product description")
	
	//@ApiModelProperty(notes = "The image URL of the product")
	private Date encounterDate;
	
	private Integer formId;
	
	//@ApiModelProperty(notes = "The price of the product", required = true)
	private String observation;
	
    private Integer patientId;
	
	private Integer providerId;
	
	public void setProviderId(Integer providerId) {
		this.providerId = providerId;
	}
	
	
	public void setPatientId(Integer patientId) {
		this.patientId= patientId;
	}
	
	public Integer getPatientId() {
		return patientId;
	}
	
	
	public void setEncounterDate(Date encounterDate) {
		this.encounterDate = encounterDate;
	}
	
	public Date getEncounterDate() {
		return encounterDate;
	}
	
	public void setFormId(Integer id) {
		this.formId = formId;
	}
	public Integer getFormId() {
		return formId;
	}
	
	public Integer getProviderId() {
		return providerId;
	}
	
	public String getObservation() {
		return observation;
	}
	
	public void setObservation(String observation) {
		this.observation = observation;
	}
	
}
