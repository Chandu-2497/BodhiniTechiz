package com.cts.MicroService.client.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.MicroService.client.model.Notification;
import com.cts.MicroService.client.service.NotificationService;

@RestController
@RequestMapping("/notification")
@CrossOrigin(origins="*")
public class NotificationController {

	@Autowired
	NotificationService notificationservice;
	
	
	@PostMapping
	public Notification add(@RequestBody Notification noti ) {
		return notificationservice.add(noti);
	}
	
	@PutMapping
	public Notification update(@RequestBody Notification noti) {
		return notificationservice.update(noti);
	}
	
	@GetMapping
	public List<Notification> getAll(){
		return notificationservice.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Notification> getById(@PathVariable Long id) {
		return notificationservice.getById(id);
	}
	
	@GetMapping("/mentorId/{mentorId}")
	public List<Notification> getByMentorId(@PathVariable Long mentorId){
		return notificationservice.findByMentorID(mentorId);
	}
	
	@GetMapping("/userId/{userId}")
	public List<Notification> getByUserId(@PathVariable Long userId){
		return notificationservice.findByUserId(userId);
	}
	
}
