package com.cts.mentorsearch.controller;

import java.sql.Time;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.mentorsearch.model.MentorCalendar;
import com.cts.mentorsearch.model.MentorSkills;
import com.cts.mentorsearch.service.MentorSearchService;


@RestController
public class MentorSearchController {
	
	@Autowired MentorSearchService mentorSearchService;
	@Autowired RestTemplate restTemplate;
	
	@CrossOrigin("*")
	@GetMapping("/{name}/{start}/{end}")
	public Object getMentorIds(@PathVariable String name,@PathVariable String start,@PathVariable String end){
		List<Long> mentorids =  mentorSearchService.getMentorIds(name, start, end);
		
		      HttpHeaders headers = new HttpHeaders();
		      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		      headers.setContentType(MediaType.APPLICATION_JSON);
		      HttpEntity<List<Long>> entity = new HttpEntity<List<Long>>(mentorids,headers);
		      
		      return restTemplate.exchange(
		         "http://localhost:8082/search", HttpMethod.POST, entity, String.class);   
		
	}
	

}
