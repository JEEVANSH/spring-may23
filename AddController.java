package com.jeesh;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddController {
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response ) {
		int i= Integer.parseInt(request.getParameter("t1"));
		int j= Integer.parseInt(request.getParameter("t2"));
		int k=i+j;
		//AddService as=new AddSerivce();
		ModelAndView mv= new ModelAndView();
		mv.addObject(result,k);
		
		return
		
	}
}
