package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.PersonInfo;

public interface IPersonInfoRepostiroy extends JpaRepository<PersonInfo,Integer> {

}
