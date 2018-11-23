package com.cg.mobshop.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mobshop.dao.MobileDao;
import com.cg.mobshop.dto.Mobiles;

@Service("mobileservice")
@Transactional
public class MobileServiceImpl implements MobileService {
	@Autowired
	MobileDao mobiledao;

	@Override
	public List<Mobiles> getAllMobiles() {
		
		return mobiledao.getAllMobiles();
	}

	@Override
	public int addmobile(Mobiles mob) {
		return mobiledao.addmobile(mob);
	}
/*
	@Override
	public void deletemobile(int mobId) {
		
			 mobiledao.deletemobile(mobId);
		
	}*/

	/*@Override
	public void updatemobile(Mobiles mobId) {
		mobiledao.updatemobile(mobId);
		
	}*/
/*
	@Override
	public Mobiles fetch(int mobId) {
		return mobiledao.fetch(mobId);
	}*/

	@Override
	public Mobiles getMobileDetails(int mobId) {
		
		return mobiledao.getMobileDetails(mobId);
	}

	@Override
	public int updateMobile(Mobiles mob) {
		return mobiledao.updateMobile(mob);
	}

	@Override
	public List<Mobiles> deleteMobile(int mobId) {
		
		return mobiledao.deleteMobile(mobId);
	}

}
