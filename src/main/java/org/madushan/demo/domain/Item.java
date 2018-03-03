package org.madushan.demo.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Item {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@ApiModelProperty(notes = "The database generated item ID")
	private Integer id;
	
	@Version
	//@ApiModelProperty(notes = "The auto-generated version of the item")
	private Integer version;
	
	//@ApiModelProperty(notes = "The application-specific item ID")
	private String itemId;
	
	//@ApiModelProperty(notes = "The item description")
	private String description;
	
	//@ApiModelProperty(notes = "The image URL of the item")
	private String imageUrl;
	
	//@ApiModelProperty(notes = "The price of the item", required = true)
	private Double price;
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getVersion() {
		return version;
	}
	
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getItemId() {
		return itemId;
	}
	
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
}
