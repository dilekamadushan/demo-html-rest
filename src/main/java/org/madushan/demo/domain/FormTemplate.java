package org.madushan.demo.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dileka on 3/3/18.
 */
@Entity
public class FormTemplate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@ApiModelProperty(notes = "The database generated concept ID")
	private Integer id;
	
	//@ApiModelProperty(notes = "The concept label")
	@ElementCollection
	List<String> fields = new ArrayList<>();
	
	//@ApiModelProperty(notes = "The concept description")
	
	
	public List<String> getFields() {
		return fields;
	}
	
	public void addField(String field) {
		this.fields.add(field);
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	
	public Integer getId(){
		return this.id;
	}
	
}
