package com.javalanguagezone.interviewtwitter.models;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegistrationRequestModel {

	@NotEmpty(message = "Username is required")
	private String username;
	@NotEmpty(message = "Lastname is required")
	private String lastName;
	@NotEmpty(message = "Firstname is required")
	private String firstName;
	@NotEmpty(message = "Password is required")
	private String password;
	
}
