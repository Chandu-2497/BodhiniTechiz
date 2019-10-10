package com.cts.MicroService.client.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="notification")
public class Notification {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long mentorId;
	private String mentorName;
//	@JsonFormat(pattern="yyyy-MM-dd")
	@CreatedDate
	private String requestDate;
	private Long userId;
	private String userName;
	private Long skillId;
	private String skillName;
	private Float fees=0.0f;
	private  boolean active = true;
	private boolean isAccepted = false;
	public Notification() {
		super();
	}
	public Notification(Long id, Long mentorId, String mentorName, String requestDate, Long userId, String userName,
			Long skillId, String skillName, Float fees, boolean active, boolean isAccepted) {
		super();
		this.id = id;
		this.mentorId = mentorId;
		this.mentorName = mentorName;
		this.requestDate = requestDate;
		this.userId = userId;
		this.userName = userName;
		this.skillId = skillId;
		this.skillName = skillName;
		this.fees = fees;
		this.active = active;
		this.isAccepted = isAccepted;
	}
	@Override
	public String toString() {
		return "Notification [id=" + id + ", mentorId=" + mentorId + ", mentorName=" + mentorName + ", requestDate="
				+ requestDate + ", userId=" + userId + ", userName=" + userName + ", skillId=" + skillId
				+ ", skillName=" + skillName + ", fees=" + fees + ", active=" + active + ", isAccepted=" + isAccepted
				+ "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getMentorId() {
		return mentorId;
	}
	public void setMentorId(Long mentorId) {
		this.mentorId = mentorId;
	}
	public String getMentorName() {
		return mentorName;
	}
	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}
	public String getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Long getSkillId() {
		return skillId;
	}
	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public Float getFees() {
		return fees;
	}
	public void setFees(Float fees) {
		this.fees = fees;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isAccepted() {
		return isAccepted;
	}
	public void setAccepted(boolean isAccepted) {
		this.isAccepted = isAccepted;
	}
	
	
	
	
	
	

}
