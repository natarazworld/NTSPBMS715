//IActorRepository.java
package com.nt.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nt.entity.Actor;

public interface IActorRepository extends JpaRepository<Actor, Integer> {

}
