package com.cts.security.bean;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String userName;
	private String password;
	private String role;
	private String firstName;
	private String lastName;
	private boolean active = true;
	private int yearsOfExperience;
	private boolean confirmedSignUp;
	private String regCode;
	private Long contactNumber;
	private boolean resetPassword;
	private Date resetPasswordDate;
	private String linkedInUrl;
	public User(Long id, String userName, String password, String role, String firstName, String lastName,
			boolean isActive, int yearsOfExperience, boolean confirmedSignUp, String regCode, Long contactNumber,
			boolean resetPassword, Date resetPasswordDate, String linkedInUrl) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.firstName = firstName;
		this.lastName = lastName;
		this.active = isActive;
		this.yearsOfExperience = yearsOfExperience;
		this.confirmedSignUp = confirmedSignUp;
		this.regCode = regCode;
		this.contactNumber = contactNumber;
		this.resetPassword = resetPassword;
		this.resetPasswordDate = resetPasswordDate;
		this.linkedInUrl = linkedInUrl;
	}
	public User() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean isActive) {
		this.active = isActive;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public boolean isConfirmedSignUp() {
		return confirmedSignUp;
	}
	public void setConfirmedSignUp(boolean confirmedSignUp) {
		this.confirmedSignUp = confirmedSignUp;
	}
	public String getRegCode() {
		return regCode;
	}
	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public boolean isResetPassword() {
		return resetPassword;
	}
	public void setResetPassword(boolean resetPassword) {
		this.resetPassword = resetPassword;
	}
	public Date getResetPasswordDate() {
		return resetPasswordDate;
	}
	public void setResetPasswordDate(Date resetPasswordDate) {
		this.resetPasswordDate = resetPasswordDate;
	}
	public String getLinkedInUrl() {
		return linkedInUrl;
	}
	public void setLinkedInUrl(String linkedInUrl) {
		this.linkedInUrl = linkedInUrl;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", role=" + role
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", active=" + active + ", yearsOfExperience="
				+ yearsOfExperience + ", confirmedSignUp=" + confirmedSignUp + ", regCode=" + regCode
				+ ", contactNumber=" + contactNumber + ", resetPassword=" + resetPassword + ", resetPasswordDate="
				+ resetPasswordDate + ", linkedInUrl=" + linkedInUrl + "]";
	}
	
	
	
}
