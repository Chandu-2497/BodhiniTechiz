package com.cts.security.service;

import java.util.ArrayList;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cts.security.bean.User;
import com.cts.security.repository.UserRepository;



@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userDao;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Autowired
	private JavaMailSender sender;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDao.findByUserName(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
				new ArrayList<>());
	}
	
	public User save(User user) {
//		User newUser = new User();
//		newUser.setUserName(user.getUserName());
		user.setPassword(bcryptEncoder.encode(user.getPassword()));
//		System.out.println(newUser);
		
		MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        try {
            helper.setTo(user.getUserName());
            helper.setCc("chandrika241997@gmail.com");
            helper.setText("Login link : https://localhost:4200/login");
            helper.setSubject("Welcome to Bodhini");
        } catch (MessagingException e) {
           e.printStackTrace();
           
        }
        sender.send(message);
        return userDao.save(user);
     
	}
	
	public void updatePassword(String password, Long userId) {
        userDao.updatePassword(password, userId);
    }

	public User findByUserName(String email) {
		// TODO Auto-generated method stub
		return userDao.findByUserName(email);
	}
}