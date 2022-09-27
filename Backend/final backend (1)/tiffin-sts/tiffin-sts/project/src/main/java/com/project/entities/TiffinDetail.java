package com.project.entities;

import java.sql.Blob;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tiffin_details")
public class TiffinDetail 
{
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "tiffin_id")
	private int tiffinId;
	
	@Column(name = "tiffin_name")
	private String tiffinName;
	
	@Lob
	@Column(name = "tiffin_image")
	private String tiffinImage;
	
	@Column(name = "tiffin_price")
	private int tiffinPrice;
	
	@Column(name = "description")
	private String description;
	
	@OneToMany(mappedBy = "tiffinDetails")
	private List<Order> order;
	
	public TiffinDetail() {
		// TODO Auto-generated constructor stub
	}

	public TiffinDetail(int tiffinId, String tiffinName, String tiffinImage, int tiffinPrice, String description,
			List<Order> order) {
		super();
		this.tiffinId = tiffinId;
		this.tiffinName = tiffinName;
		this.tiffinImage = tiffinImage;
		this.tiffinPrice = tiffinPrice;
		this.description = description;
		this.order = order;
	}
public TiffinDetail(int tiffinId) {
	this.tiffinId=tiffinId;
}
	public int getTiffinId() {
		return tiffinId;
	}

	public void setTiffinId(int tiffinId) {
		this.tiffinId = tiffinId;
	}

	public String getTiffinName() {
		return tiffinName;
	}

	public void setTiffinName(String tiffinName) {
		this.tiffinName = tiffinName;
	}

	public String getTiffinImage() {
		return tiffinImage;
	}

	public void setTiffinImage(String tiffinImage) {
		this.tiffinImage = tiffinImage;
	}

	public int getTiffinPrice() {
		return tiffinPrice;
	}

	public void setTiffinPrice(int tiffinPrice) {
		this.tiffinPrice = tiffinPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "TiffinDetails [tiffinId=" + tiffinId + ", tiffinName=" + tiffinName + ", tiffinImage=" + tiffinImage
				+ ", tiffinPrice=" + tiffinPrice + ", description=" + description + "]";
	}
}
