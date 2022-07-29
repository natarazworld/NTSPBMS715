//ActorMgmtServiceImpl.java
package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepository;

@Service("ActorService")
public class ActorMgmtServiceImpl implements IActorMgmtService {
	@Autowired  //Injects   InMemory Proxy class obj  that implementing   our custom Repository(I)
	private IActorRepository  actorRepo;  

	@Override
	public Iterable<Actor> showActorsByOrder(boolean asc, String... properties) {
		//prepare Sort object
	     Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC, properties);
	     // get records  by applying sorting
	     Iterable<Actor> it=actorRepo.findAll(sort);
		return it;
	}
	
	@Override
	public Page<Actor> showPageRecords(int pageNo, int pageSize) {
		// create Pageable object
		Pageable pageable=PageRequest.of(pageNo, pageSize);
		// get given Page records
		Page<Actor> page=actorRepo.findAll(pageable);
		return page;
	}
	
	@Override
	public void showActorsByPage(int pageSize) {
	  long  recordsCount=actorRepo.count();
	  long pagesCount=recordsCount/pageSize;
	  pagesCount=(recordsCount%pageSize==0)?pagesCount:++pagesCount;
	  
	  for(int i=0;i<pagesCount;++i) {
		  Pageable pageable=PageRequest.of(i, pageSize);
		  Page<Actor> page=actorRepo.findAll(pageable);
		  System.out.println((i+1)+" page records ::");
		  page.getContent().forEach(System.out::println);
	  }
	}
	
	
}//class