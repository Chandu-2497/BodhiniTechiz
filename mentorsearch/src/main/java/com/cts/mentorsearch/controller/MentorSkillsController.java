package com.cts.mentorsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.mentorsearch.model.MentorSkills;
import com.cts.mentorsearch.service.MentorSearchService;

@RestController
@RequestMapping("/skills")
public class MentorSkillsController {
	
	@Autowired MentorSearchService mentorSearchService;
	
	@GetMapping("/getSkill/{mentorid}")
	public MentorSkills getSkillById(@PathVariable Long mentorid) {
		return mentorSearchService.getSkillByID(mentorid);
	}
	
	@PutMapping("/updateSkill")
	public MentorSkills updateSkill(@RequestBody MentorSkills skill) {
		return mentorSearchService.upadteSkill(skill);
	}
	
	@PostMapping("/addSkills")
	public MentorSkills addSkills(@RequestBody MentorSkills skill) {
	 return mentorSearchService.addSkills(skill);
	}

}
