package com.javalanguagezone.interviewtwitter.controller;

import com.javalanguagezone.interviewtwitter.models.UserRegistrationRequestModel;
import com.javalanguagezone.interviewtwitter.service.UserService;
import com.javalanguagezone.interviewtwitter.service.dto.UserDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Collection;

import javax.validation.Valid;

@RestController
public class UserController {

  private UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping("/registration")
  public void registration(@Valid @RequestBody UserRegistrationRequestModel user) {
    userService.registerUser(user);
  }
 
  @GetMapping("/followers")
  public Collection<UserDTO> followers(Principal principal) {
    return userService.getUsersFollowers(principal);
  }
  @GetMapping("/following")
  public Collection<UserDTO> following(Principal principal) {
    return userService.getUsersFollowing(principal);
  }
  
  @GetMapping("/count-followers")
  public int numberOfFollowers(Principal principal) {
    return userService.getNumberOfFollowers(principal);
  }
  @GetMapping("/count-following")
  public int numberOfFollowing(Principal principal) {
    return userService.getNumberOfFollowing(principal);
  }
}
