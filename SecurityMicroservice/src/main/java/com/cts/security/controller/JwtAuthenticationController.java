package com.cts.security.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cts.security.service.JwtUserDetailsService;


import com.cts.security.config.JwtTokenUtil;
import com.cts.security.repository.UserRepository;
//import com.cts.security.repository.PasswordResetTokenRepository;
import com.cts.security.bean.JwtRequest;
import com.cts.security.bean.JwtResponse;
//import com.cts.security.bean.PasswordResetToken;
import com.cts.security.bean.User;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class JwtAuthenticationController {

	@Autowired
	private JavaMailSender sender;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
//	@Autowired
//	private  PasswordResetTokenRepository pass;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private JwtUserDetailsService userDetailsService;
	
	@Autowired UserRepository userRepo;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {

		authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());

		final UserDetails userDetails = userDetailsService
				.loadUserByUsername(authenticationRequest.getUsername());
		

		final String token = jwtTokenUtil.generateToken(userDetails);
		

		return ResponseEntity.ok(new JwtResponse(token,userRepo.findByUserName(authenticationRequest.getUsername())));
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<?> saveUser(@RequestBody User user) throws Exception {
		return ResponseEntity.ok(userDetailsService.save(user));
	}

	private void authenticate(String username, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
	
	
}