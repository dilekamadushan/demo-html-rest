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
	
	//@ApiModelProperty(notes = "The patient of the Observation")
	//private Observation observation;
	
	//@ApiModelProperty(notes = "The provider of the Observation")
	@ElementCollection(targetClass=Provider.class)
	private List<Provider> provider;
	
	//@ApiModelProperty(notes = "The created dateTime")
	private Date date;
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
/*	
	public void setObservation(Observation observation) {
		this.observation = observation;
	}
	
	public Observation getObservation() {
		return observation;
	}*/
	
	
	
	
	public void setProvider(Provider provider) {
		this.provider.add(provider);
	}
	
}
