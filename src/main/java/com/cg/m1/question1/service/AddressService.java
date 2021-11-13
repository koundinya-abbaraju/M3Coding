package com.cg.m1.question1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.m1.question1.repository.AddressRepository;

@Service
public class AddressService 
{
	@Autowired
	AddressRepository addressRepository;
	
}
