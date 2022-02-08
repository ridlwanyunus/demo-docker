package com.sample.demodocker.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM")
public class Item implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ITEM")
	private Integer idItem;
	
	@Column(name = "NAMA_ITEM")
	private String namaItem;
	
	public Integer getIdItem() {
		return idItem;
	}
	
	public Item() {
		
	}
	
	public Item(Integer idItem, String namaItem) {
		super();
		this.idItem = idItem;
		this.namaItem = namaItem;
	}


	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}
	public String getNamaItem() {
		return namaItem;
	}
	public void setNamaItem(String namaItem) {
		this.namaItem = namaItem;
	}
	
	@Override
	public String toString() {
		return "Item [idItem=" + idItem + ", namaItem=" + namaItem + "]";
	}
	
	
}
