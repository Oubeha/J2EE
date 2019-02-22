package com.example.demo.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Article implements Serializable   {
	
	@Id @GeneratedValue
	private Long ID;
	private String nom;
	private int Qte;
	private double prix;
	private Date date;
	private String photo;
	
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getnom() {
		return nom;
	}
	public void setDesignation(String nom) {
		this.nom = nom;
	}
	public int getQte() {
		return Qte;
	}
	public void setQte(int qte) {
		Qte = qte;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Article(String nom, int qte, double prix, Date date, String photo) {
		super();
		this.nom = nom;
		Qte = qte;
		this.prix = prix;
		this.date = date;
		this.photo = photo;
	}
	public Article() {
		super();
	}
	
	
	
	

}
