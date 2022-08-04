//IActorRepository.java
package com.nt.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Actor;
import com.nt.entity.ResultView;

public interface IActorRepository extends JpaRepository<Actor, Integer> {
	   //select * from  data_jpa_actor where aname=?
      public  List<Actor>  findByAnameEquals(String name);
      
      //select * from  data_jpa_actor where aname = ?
      public  Iterable<Actor> findByAnameIs(String name);
      
      //select * from  data_jpa_actor where aname = ?
      public  Iterable<Actor> findByAname(String name);
      
      //select * from  data_jpa_actor where aid between  ? and ?
      public  Iterable<Actor>  findByAidBetween(int start, int end);
      
      //select * from  data_jpa_actor where upper(category)=upper(?)
      //public  Iterable<Actor> findByCategoryEqualsIgnoreCase(String  category);
      
      //select * from  data_jpa_actor where  aname like  %?
    //select * from  data_jpa_actor where  aname like  ?%
      //select * from  data_jpa_actor where  aname like  %?%
      public   Iterable<Actor>  findByAnameLike(String chars);

      //select * from  data_jpa_actor where  aname like  ?%
      public  Iterable<Actor>  findByAnameStartingWith(String  startChars);
      //select * from  data_jpa_actor where  aname like  %?%
      public Iterable<Actor>  findByAnameContainingIgnoreCase(String chars);
      //select * from  data_jpa_actor where  upper(category) in(?,?,?...) order by  aname asc
      public   Iterable<Actor>  findByCategoryInIgnoreCaseOrderByAnameAsc(List<String> categories);
      //select * from  data_jpa_actor where  aid>=start and aid<=end
      public  Iterable<Actor>  findByAidGreaterThanEqualAndAidLessThanEqual(int start,int end);
      //select * from  data_jpa_actor where  status=1 e or category=?
      public   Iterable<Actor>  findByStatusTrueOrCategoryEquals(String category);
      //select * from  data_jpa_actor where (aid>? and aid<?) or upper(category) not in(?,?,?,....) 
      public    Iterable<Actor>  findByAidGreaterThanAndAidLessThanOrCategoryNotInIgnoreCase(int start,int end,String ...cateroties);
  
        //select  aid ,aname from  data_jpa_actor where upper(category)=? 
      public  Iterable<ResultView> findByCategoryEqualsIgnoreCase(String category);
      
      //select  aid ,aname from  data_jpa_actor where mobileNo=? 
      public   ResultView   findByMobileNo(long mobileNo);
      
      //select  * from  data_jpa_actor where mobileNo=?
      public  Actor   findByMobileNoIs(long mobileNo);
}
