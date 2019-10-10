package com.cts.MicroService.client.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.MicroService.client.model.Notification;
import com.cts.MicroService.client.repository.NotificationRepository;

@Service
public class NotificationService {
	
	@Autowired
	NotificationRepository notirepo;
	
	public List<Notification> findByMentorID(Long mentorId) {
		return notirepo.findByMentorId(mentorId);
	}
	
	public List<Notification> findByUserId(Long userid){
		return notirepo.findByUserId(userid);
	}
	
	public List<Notification> getAll(){
		return (List<Notification>) notirepo.findAll();
	}
	
	public Optional<Notification> getById(Long id){
		return notirepo.findById(id);
	}
	
	public Notification update(Notification noti) {
		return notirepo.save(noti);
	}
	
	public Notification add(Notification noti) {
		return notirepo.save(noti);
	}

}
