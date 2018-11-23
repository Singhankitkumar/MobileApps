package com.cg.mobshop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;




import com.cg.mobshop.dto.Mobiles;


@Repository("mobiledao")
public class MobileDaoImpl implements MobileDao {
	
	@PersistenceContext
	EntityManager entitymanager;

	@Override
	public List<Mobiles> getAllMobiles() {
		
		Query queryOne=entitymanager.createQuery("FROM Mobiles");
		List<Mobiles> myList=queryOne.getResultList();
		return myList;
	}
	@Override
	public int addmobile(Mobiles mob){
	entitymanager.persist(mob);
	entitymanager.flush();
	return mob.getMobileId();
}
	
    /*@Override  
	public Mobiles fetch(int mobId) {
		Mobiles trainee = entitymanager.find(Mobiles.class, mobId);
		return trainee;
	
      }
	*/
	/*@Override
	public void deletemobile(int mobId) {
		Query queryTwo=entitymanager.createQuery("DELETE FROM Mobiles WHERE mobileId=:eid");
		queryTwo.setParameter("eid",mobId);
		queryTwo.executeUpdate();
		
	}*/
	/*@Override
	public void updatemobile(Mobiles mobId) {
		Mobiles result = entitymanager.merge(mobId);
		entitymanager.flush();
	}*/
	
	
	@Override
	public Mobiles getMobileDetails(int mobId) {
		Mobiles mobile=entitymanager.find(Mobiles.class,mobId);
		return mobile;
	}
	@Override
	public int updateMobile(Mobiles mob) {
		
		entitymanager.merge(mob);
		return mob.getMobileId();
	}
	@Override
	public List<Mobiles> deleteMobile(int mobId) {
		Mobiles mobile=getMobileDetails(mobId);
		entitymanager.remove(mobile);
		return getAllMobiles();
	}
	
		
	}
	
