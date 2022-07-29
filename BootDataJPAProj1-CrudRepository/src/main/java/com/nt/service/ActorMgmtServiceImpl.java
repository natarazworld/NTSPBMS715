//ActorMgmtServiceImpl.java
package com.nt.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepository;

@Service("ActorService")
public class ActorMgmtServiceImpl implements IActorMgmtService {
	@Autowired  //Injects   InMemory Proxy class obj  that implementing   our custom Repository(I)
	private IActorRepository  actorRepo;  

	@Override
	public String registerActor(Actor actor) {
		System.out.println(  "InMemory Proxy class name::"+actorRepo.getClass()+"----- list of implemented interfaces "+Arrays.toString(actorRepo.getClass().getInterfaces()));
		Actor  sactor=actorRepo.save(actor);
		return "actor is registered  with id value :"+sactor.getAid();
	}

/*@Override
public String registerActorsGroup(List<Actor> list) {
    if(list!=null) {
    	Iterable<Actor> sEntities=actorRepo.saveAll(list);
    	List<Integer> ids=new ArrayList();
    	for(Actor  actor:sEntities) {
    		ids.add(actor.getAid());
    	}//for
    	return  ids.size()+" Objects are saved having id values ::"+ids;
    }//if
	return " Problem is batch insertion" ;
}//method */

	
	
	@Override
	public String registerActorsGroup(Iterable<Actor> list) {
	    if(list!=null) {
	    	List<Actor> sEntities=(List<Actor>) actorRepo.saveAll(list);
	         List<Integer> ids=sEntities.stream().map(actor->actor.getAid()).collect(Collectors.toList());
	     	return  ids.size()+" Objects are saved having id values ::"+ids;
	    }//if
		return " Problem is batch insertion" ;
	}//method
	
	

	@Override
	public long fetchRecordsCount() {
		return actorRepo.count();
	}
	
	@Override
	public Iterable<Actor> fetchAllActors() {
		return actorRepo.findAll();
	}
	
	@Override
	public boolean isActorAvaiable(int aid) {
		return actorRepo.existsById(aid);
	}
	
	@Override
	public Iterable<Actor> fetchActorsByIds(Iterable<Integer> ids) {
		return actorRepo.findAllById(ids);
	}
	
	@Override
	public Optional<Actor> fetchActorById(int aid) {
		Optional<Actor> opt=actorRepo.findById(aid);
		  return opt;
	}
	
	/*@Override
	public Actor showActorById(int aid) {
		Optional<Actor> opt=actorRepo.findById(aid);
		if(opt.isPresent())
			return  opt.get();
		else
			throw  new IllegalArgumentException("Actor not found");
	}
	
	@Override
	public Actor showActorById(int aid) {
		Optional<Actor> opt=actorRepo.findById(aid);
		return opt.orElseThrow(()->new IllegalArgumentException("Actor not found"));
	}*/
	
	@Override
	public Actor showActorById(int aid) {
		return  actorRepo.findById(aid).orElseThrow(()->new IllegalArgumentException("Actor not found"));
	}
	
	@Override
	public String updateActorMobileNo(int aid, long newMobileNo) {
		   Optional<Actor> opt=actorRepo.findById(aid);
		    if(opt.isPresent()) {
		    	Actor  actor=opt.get();
		    	actor.setMobileNo(newMobileNo);
		    	actorRepo.save(actor);
		    	return aid+" is updated with new Mobile No::"+newMobileNo;
		    }
		    else
			return  aid+" Actor not found for updation";
	}
	
	@Override
	public String updateActor(Actor actor) {
		boolean  flag=actorRepo.existsById(actor.getAid());
		if(flag) {
			actorRepo.save(actor);
			return actor.getAid()+" actor  information is updated";
		}
		else
			return  actor.getAid()+" Actor is not found for updation";
	}
	
	
	@Override
	public String registerOrUpdateActor(Actor actor) {
	     Actor  mActor=actorRepo.save(actor);
		return mActor.getAid()+" is saved or updated successfully";
	}
	
	@Override
	public String removeActorById(int aid) {
		Optional<Actor> opt=actorRepo.findById(aid);
		if(opt.isPresent()) {
		    actorRepo.deleteById(aid);
		    return aid+ "Actor is deleted";
		}
		else
		  return aid+" Actor is not found for deletion";
	}
	
	
	@Override
	public String removeActor(Actor actor) {
		  boolean flag=actorRepo.existsById(actor.getAid());
		  if(flag) {
			  actorRepo.delete(actor);
			  return actor.getAid()+ "Actor is deleted";
		  }
		  else
			  return actor.getAid()+" Actor is not found for deletion";
	}
	
	@Override
	public String removeActorByAId(int aid) {
		actorRepo.deleteById(aid);
		return aid+" actor is deleted";
	}
	
	@Override
	public String removeAllActors() {
	    long count=actorRepo.count();
	    actorRepo.deleteAll();
		return count+" no.of records are deleted";
	}
	
	
	@Override
	public String removeActorsByIds(List<Integer> ids) {
	      actorRepo.deleteAllById(ids);
		return ids.size()+" no.of records are deleted";
	}
	
}//class