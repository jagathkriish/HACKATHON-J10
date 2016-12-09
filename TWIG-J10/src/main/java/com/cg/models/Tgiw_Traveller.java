package com.cg.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Tgiw_Traveller {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	private String Adress;
	private String tour_from;
	private String tour_to;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "Trvl_Start")
	private Date Trvl_Start;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "Trvl_Return")
	private Date Trvl_Return;
	
	
	public Tgiw_Traveller(long id, String name, String adress, String tour_from, String tour_to, Date trvl_Start,
			Date trvl_Return) {
		super();
		this.id = id;
		this.name = name;
		Adress = adress;
		this.tour_from = tour_from;
		this.tour_to = tour_to;
		Trvl_Start = trvl_Start;
		Trvl_Return = trvl_Return;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public String getTour_from() {
		return tour_from;
	}

	public void setTour_from(String tour_from) {
		this.tour_from = tour_from;
	}

	public String getTour_to() {
		return tour_to;
	}

	public void setTour_to(String tour_to) {
		this.tour_to = tour_to;
	}

	public Date getTrvl_Start() {
		return Trvl_Start;
	}

	public void setTrvl_Start(Date trvl_Start) {
		Trvl_Start = trvl_Start;
	}

	public Date getTrvl_Return() {
		return Trvl_Return;
	}

	public void setTrvl_Return(Date trvl_Return) {
		Trvl_Return = trvl_Return;
	}
	
	
	
	
}
