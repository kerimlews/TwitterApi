package com.javalanguagezone.interviewtwitter.mappers;

import com.javalanguagezone.interviewtwitter.domain.User;
import com.javalanguagezone.interviewtwitter.models.UserRegistrationRequestModel;

public class UserMapper {
	
	public static User map(UserRegistrationRequestModel model) {
		return new User(
			model.getUsername(),
			model.getPassword(),
			model.getFirstName(),
			model.getLastName()
		);
	}

}
