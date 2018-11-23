package com.cg.mobshop.controller;

import java.util.List;
import java.util.Map;







import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;






import com.cg.mobshop.dto.Mobiles;
import com.cg.mobshop.service.MobileService;




@Controller
public class MobileController {
	@Autowired
	MobileService mobileservice;
	
	@RequestMapping(value="getmoblist")
	public ModelAndView showMobileList(){
		List<Mobiles> myAllData=mobileservice.getAllMobiles();
		return new ModelAndView("showall","temp",myAllData);
	}

	
	@RequestMapping(value="addmobile")
	public String insertmobile(@ModelAttribute("my") Mobiles mob){
//	return new ModelAndView ("addmobiledata");
		return "addmobiledata";



}
	@RequestMapping(value="insertmobile",method=RequestMethod.POST)
	public ModelAndView addmobile(@ModelAttribute("my") Mobiles mob){
		int id=0;
		id=mobileservice.addmobile(mob);
	return new ModelAndView("success","deg",id);
	
}
/*	
	@RequestMapping(value="delete")
	public String deletemobile(int mobId ,Model model){
		model.addAttribute("msg","Mobile Record Deleted");
		mobileservice.deletemobile(mobId);
		return "successdelete";}
	
	
	
	
@RequestMapping(value="dodelete",method=RequestMethod.GET)
	public String mobileDelete(@RequestParam("mobileId") int mobId){
		mobileservice.deletemobile(mobId);
		return "successdelete";
	}*/
	
	@RequestMapping(value="updatemobile")
	public String updatemobile(@RequestParam("mobid") int mobId,Model model) {
		
		Mobiles mobile=mobileservice.getMobileDetails(mobId);
		model.addAttribute("mobile",mobile);
		return "updatemobile";
		
	}

	@RequestMapping(value="updateaction")
	public ModelAndView updateMobile(@ModelAttribute("mobile") Mobiles mobile,Model model){
		mobileservice.updateMobile(mobile);
		List<Mobiles> myAllData=mobileservice.getAllMobiles();
		return new ModelAndView("showall","temp",myAllData);
		
		
	}
	
	@RequestMapping(value="delete")
public ModelAndView deletemobile(@RequestParam("mobid") int mobId,Model model) {
		
		Mobiles mobile=mobileservice.getMobileDetails(mobId);
		List<Mobiles> list=mobileservice.deleteMobile(mobId);
		return new ModelAndView("showall","temp",list);
		
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

