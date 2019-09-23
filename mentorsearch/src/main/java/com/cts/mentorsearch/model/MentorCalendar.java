package com.cts.mentorsearch.model;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mentorcalendar")
public class MentorCalendar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String start_time;
	private String end_time;
	private Long mentorid;
	public MentorCalendar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MentorCalendar(Long id, String start_time, String end_time,Long mentorid) {
		super();
		this.id = id;
		this.start_time = start_time;
		this.end_time = end_time;
		this.mentorid = mentorid;
		
	}
	public Long getMentorid() {
		return mentorid;
	}
	public void setMentorid(Long mentorid) {
		this.mentorid = mentorid;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	
}
