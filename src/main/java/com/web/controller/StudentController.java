package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.model.StudentModel;
import com.web.repository.StudentRepo;

@Controller
public class StudentController {
	
	@Autowired
	private StudentRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@ResponseBody
	@RequestMapping("/savemarks")
	public String saveMarks(@RequestParam String name,@RequestParam Integer sub1,@RequestParam Integer sub2,@RequestParam Integer sub3,StudentModel u,Model m ) {
		int total=sub1+sub2+sub3;
		double avearage=total/3;
		
		char grade;
		if(avearage>=85)
			grade='A';
		
		else if(avearage>=50&&avearage<85)
			grade='B';
		else
			grade='C';
		
		u.setTotal(total);
		u.setAvearage(avearage);
		u.setGrade(grade);
		StudentModel mm=repo.save(u);
		
		return "marks saved.....";
	}
	
	@RequestMapping("/showresults")
	public String showResult(Model model) {
		 model.addAttribute("StudentModels",repo.findAll());
		return"index";
	}
	
	@RequestMapping(value="/deletestudent/{studentid}",method = RequestMethod.GET)
	  public String delete(@PathVariable int studentid) {

		repo.deleteById(studentid);     
		  
	  return "index";
	  
	  }
	 
  @RequestMapping(value="/editstudent/{studentid}")
	public String edit(@PathVariable int studentid, Model m) {
	  StudentModel mm1=repo.findById(studentid).get();
	  m.addAttribute("command",mm1);
	  return "edit";
	}
  @RequestMapping(value="/editsave",method = RequestMethod.POST)
  public String editSave(@RequestParam Integer sub1,@RequestParam Integer sub2,@RequestParam Integer sub3,StudentModel mr,Model model) {
	  int total=sub1+sub2+sub3;
		double avearage=total/3;
		
		char grade;
		if(avearage>=85)
			grade='A';
		
		else if(avearage>=50&&avearage<85)
			grade='B';
		else
			grade='C';
		
		mr.setTotal(total);
		mr.setAvearage(avearage);
		mr.setGrade(grade);
	  repo.save(mr);
	  return "index";
  }
}
