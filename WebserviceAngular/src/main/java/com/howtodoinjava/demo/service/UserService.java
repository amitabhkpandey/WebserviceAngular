package com.howtodoinjava.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.howtodoinjava.demo.exception.RecordNotFoundException;
import com.howtodoinjava.demo.model.UserEntity;
import com.howtodoinjava.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;	

	public UserEntity saveEmployee(UserEntity entity) throws RecordNotFoundException {

		UserEntity newEntity = new UserEntity();
		newEntity.setMobnum(entity.getMobnum());
		newEntity.setFirstName(entity.getFirstName());
		newEntity.setLastName(entity.getLastName());
		newEntity.setEmail(entity.getEmail());
		newEntity.setPassword(entity.getPassword());
		newEntity.setReferralcode(entity.getReferralcode());
		repository.save(newEntity);

		return newEntity;
	}
}