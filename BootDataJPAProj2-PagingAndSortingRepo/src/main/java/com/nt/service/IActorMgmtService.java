//IActorMgmtService.java
package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.nt.entity.Actor;

public interface IActorMgmtService {
      public  Iterable<Actor>   showActorsByOrder(boolean asc,String ...properties);
      public  Page<Actor>  showPageRecords(int pageNo,int pageSize);
      public   void   showActorsByPage(int pageSize);
     
}
