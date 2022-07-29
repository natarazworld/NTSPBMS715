//IActorMgmtService.java
package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.entity.Actor;

public interface IActorMgmtService {
     public  String   registerActor(Actor actor);
     public  String   registerActorsGroup(Iterable<Actor> list);
     public   long     fetchRecordsCount();
     public Iterable<Actor>  fetchAllActors();  
     public   boolean   isActorAvaiable(int aid);
     public  Iterable<Actor>  fetchActorsByIds(Iterable<Integer> ids);
     public    Optional<Actor>  fetchActorById(int aid);
     public   Actor  showActorById(int aid);
     public   String   updateActorMobileNo(int aid, long newMobileNo);
     public  String  updateActor(Actor actor);
     public   String  registerOrUpdateActor(Actor actor);
     public   String   removeActorById(int aid);
     public  String   removeActor(Actor  actor);
     public   String   removeActorByAId(int aid);
     public   String   removeAllActors();
     public  String   removeActorsByIds(List<Integer> ids);
     
}
