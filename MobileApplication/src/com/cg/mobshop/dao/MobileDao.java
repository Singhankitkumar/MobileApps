package com.cg.mobshop.dao;

import java.util.List;


import com.cg.mobshop.dto.Mobiles;


public interface MobileDao {
	
	
	public List<Mobiles> getAllMobiles();
	public int addmobile(Mobiles mob);
	//public void deletemobile(int mobId);
	public int updateMobile(Mobiles mob);
	public Mobiles getMobileDetails(int mobId);
	public List<Mobiles> deleteMobile(int mobId);

}