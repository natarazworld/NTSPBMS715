//IActorMgmtService.java
package com.nt.service;

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
     
}
