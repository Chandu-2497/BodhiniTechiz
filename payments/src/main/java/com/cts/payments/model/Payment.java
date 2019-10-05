package com.cts.payments.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String txntype;
	private float amount;
	private String remarks;
	private Long mentorId;
	private String mentorname;
	private Long trainingId;
	private String skillname;
	private float totalAmountToMentor;
	public Payment(Long payment_id, String txntype, float amount, String remarks, Long mentor_id, String mentorname,
			Long training_id, String skillname, float totalAmountToMentor) {
		super();
		this.id = payment_id;
		this.txntype = txntype;
		this.amount = amount;
		this.remarks = remarks;
		this.mentorId = mentor_id;
		this.mentorname = mentorname;
		this.trainingId = training_id;
		this.skillname = skillname;
		this.totalAmountToMentor = totalAmountToMentor;
	}
	
	public Payment()
	{
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long payment_id) {
		this.id = payment_id;
	}

	public String getTxntype() {
		return txntype;
	}

	public void setTxntype(String txntype) {
		this.txntype = txntype;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Long getMentor_id() {
		return mentorId;
	}

	public void setMentor_id(Long mentor_id) {
		this.mentorId = mentor_id;
	}

	public String getMentorname() {
		return mentorname;
	}

	public void setMentorname(String mentorname) {
		this.mentorname = mentorname;
	}

	public Long getTraining_id() {
		return trainingId;
	}

	public void setTraining_id(Long training_id) {
		this.trainingId = training_id;
	}

	public String getSkillname() {
		return skillname;
	}

	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}

	public float getTotalAmountToMentor() {
		return totalAmountToMentor;
	}

	public void setTotalAmountToMentor(float totalAmountToMentor) {
		this.totalAmountToMentor = totalAmountToMentor;
	}
	
}