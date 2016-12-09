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
public class Tgiw_Availability {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "Avl_Date")
	private Date avlDate;
	
	private String pList;
	private String gList;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getAvlDate() {
		return avlDate;
	}
	public void setAvlDate(Date avlDate) {
		this.avlDate = avlDate;
	}
	public String getpList() {
		return pList;
	}
	public void setpList(String pList) {
		this.pList = pList;
	}
	public String getgList() {
		return gList;
	}
	public void setgList(String gList) {
		this.gList = gList;
	}
	
	public Tgiw_Availability(long id, Date avlDate, String pList, String gList) {
		super();
		this.id = id;
		this.avlDate = avlDate;
		this.pList = pList;
		this.gList = gList;
	}
	
	
	
}
