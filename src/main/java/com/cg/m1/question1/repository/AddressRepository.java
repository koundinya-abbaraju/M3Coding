package com.cg.m1.question1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.m1.question1.entity.Address;

public interface AddressRepository extends JpaRepository<Address,Integer>
{

}
