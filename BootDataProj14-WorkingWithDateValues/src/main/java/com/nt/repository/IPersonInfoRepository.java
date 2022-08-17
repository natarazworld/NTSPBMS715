//PersonInfo.java
package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.PersonInfo;

public interface IPersonInfoRepository extends JpaRepository<PersonInfo, Integer> {

}
