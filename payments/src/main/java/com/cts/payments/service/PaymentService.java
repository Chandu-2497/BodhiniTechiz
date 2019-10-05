package com.cts.payments.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.payments.model.Payment;
import com.cts.payments.repository.PaymentsRepository;

@Service
@Transactional
public class PaymentService {
	
	@Autowired
	PaymentsRepository payRepo;
	
	
	public List<Payment> getAllpayments(){
		return (List<Payment>) payRepo.findAll();
	}
	
	
	public Optional<Payment> getpaymentById(Long id) {
		return payRepo.findById(id);
	}
	
	
	public Payment addpayment(Payment user) {
		return payRepo.save(user);
	}
	
	
	public Payment updatepayment(Payment user) {
		return payRepo.save(user);
	}
	
	
	public void deletepayment(Long id) {
		payRepo.deleteById(id);
	}
	
	public  List<Payment> getByMentorId(Long mentorid) {
		return payRepo.findByMentorId(mentorid);
	}
	
	public  List<Payment> getByTrainingId(Long trainingid) {
		return payRepo.findByMentorId(trainingid);
	}

}