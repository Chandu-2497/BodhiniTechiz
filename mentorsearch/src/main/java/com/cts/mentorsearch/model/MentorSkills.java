package com.cts.mentorsearch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mentorskills")
public class MentorSkills {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String toc;
	private String prerequisites;
	private Long mentorid;
	public MentorSkills() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MentorSkills(Long id, String name, String toc, String prerequisites,Long mentorid) {
		super();
		this.id = id;
		this.name = name;
		this.toc = toc;
		this.prerequisites = prerequisites;
		this.mentorid = mentorid;
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
	public String getToc() {
		return toc;
	}
	public void setToc(String toc) {
		this.toc = toc;
	}
	public String getPrerequisites() {
		return prerequisites;
	}
	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}
	public Long getMentorid() {
		return mentorid;
	}
	public void setMentorid(Long mentorid) {
		this.mentorid = mentorid;
	}
	
	
	

}
