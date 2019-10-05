package com.cts.payments.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cts.payments.model.Payment;

public interface PaymentsRepository extends CrudRepository<Payment,Long> {
	
	public List<Payment> findByMentorId(Long mentorid);
	
	public List<Payment> findByTrainingId(Long trainingid);

}