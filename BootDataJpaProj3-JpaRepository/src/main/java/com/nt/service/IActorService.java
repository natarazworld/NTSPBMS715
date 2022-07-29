//IActorService.java
package com.nt.service;

import java.util.List;

import com.nt.entity.Actor;

public interface IActorService {
    public String  removeActorsByIdsInBatch(List<Integer> ids);
    public   Actor   searchActorById(int aid);
    public  List<Actor> searchActorsByActor(Actor actor, boolean order, String ... properties);
}
