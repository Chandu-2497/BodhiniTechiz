package com.cts.MicroService.client.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="technology")
public class Technology {
	@Id 	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private float fee;
public Technology() {
	super();
	// TODO Auto-generated constructor stub
}
public Technology(Long id, String name, float fee) {
	super();
	this.id = id;
	this.name = name;
	this.fee = fee;
	
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getFee() {
	return fee;
}
public void setFee(float fee) {
	this.fee = fee;
}



}
