package com.cts.MicroService.client.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.MicroService.client.model.Notification;

@Repository
public interface NotificationRepository extends CrudRepository<Notification,Long>{
	
	List<Notification> findByMentorId(Long mentorid);
	
	
	List<Notification> findByUserId(Long userid);

}
