package com.cts.mentorsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.mentorsearch.model.MentorCalendar;
import com.cts.mentorsearch.service.MentorSearchService;

@RestController
@RequestMapping("/calendar")
public class MentorCalendarController {
	
	@Autowired MentorSearchService mentorSearchService;
	
	@PostMapping("/addCal")
	public MentorCalendar addCalendar(@RequestBody MentorCalendar calendar) {
		return mentorSearchService.addCalendar(calendar);
	}
	
	@PutMapping("/updateCal")
	public MentorCalendar updateCalendar(@RequestBody MentorCalendar cal) {
		return mentorSearchService.updateCalendar(cal);
	}
	
	@GetMapping("/getCal/{mentorid}")
	public MentorCalendar getCalendarByMentorId(@PathVariable Long mentorid) {
		return mentorSearchService.getCalendarById(mentorid);
	}
	

}
