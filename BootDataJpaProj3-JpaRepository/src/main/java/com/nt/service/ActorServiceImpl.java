// ActorServiceImpl.java
package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepository;



@Service("actorService")
public class ActorServiceImpl implements IActorService {
	@Autowired
	private  IActorRepository actorRepo;

	@Override
	public String removeActorsByIdsInBatch(List<Integer> ids) {
		 List<Actor> list= actorRepo.findAllById(ids);  //JpaRepository method
		 int count=list.size();
		 actorRepo.deleteAllByIdInBatch(ids);
		return count+" no.of records are deleted in batch";
	}
	
	@Override
	public Actor searchActorById(int aid) {
		//return actorRepo.getById(id);
		return actorRepo.getReferenceById(aid);
	}
	
	@Override
	public List<Actor> searchActorsByActor(Actor actor, boolean order, String... properties) {
		//Example object having  Entity obj
	   Example example=Example.of(actor);
	   //Sort object
	   Sort sort=Sort.by(order?Direction.ASC:Direction.DESC,properties);
	   List<Actor>  list=actorRepo.findAll(example, sort);
		return list;
	}

}
