package com.cg.controller;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cg.models.Avbl_Repository;
import com.cg.models.Planner_Repository;
import com.cg.models.Tgiw_Availability;
import com.cg.models.Tgiw_Planner;
import com.cg.models.Tgiw_Traveller;
import com.cg.models.Traveller_Repository;
import com.cg.service.TGIWService;


@Controller
public class TgiwController {
	
	@Autowired
	TGIWService tgiwService;
	
	
	private Traveller_Repository travel_repository;
	private Planner_Repository planner_repository;
	private Avbl_Repository avbl_repository;
	

	public TgiwController(Traveller_Repository travel_repository,Planner_Repository planner_repository,Avbl_Repository avbl_repository) {
		this.planner_repository = planner_repository;
		this.travel_repository = travel_repository;
		this.avbl_repository = avbl_repository;
	}

	@GetMapping("/")
    public String viewHomePage(Model model) throws IOException {
        return "main";
    }
	
	@GetMapping("/pgRegister")
    public String registerGP(Model model) throws IOException {
        return "planner";
    }
	
	@GetMapping("/traveller")
    public String viewTravellerPage(Model model) throws IOException {
        return "traveller";
    }
	
	@GetMapping("/getTraveler")
	@ResponseBody
	public List<Tgiw_Traveller> getTravelerDetails(){
		return this.travel_repository.findAll();
		
	}
	
	@GetMapping("/getPlanner")
	@ResponseBody
	public List<Tgiw_Planner> getPlannerDetails(){
		return this.planner_repository.findAll();
		
	}
	
	@GetMapping("/getAvbl")
	@ResponseBody
	public List<Tgiw_Availability> getAvblDetails(){
		return this.avbl_repository.findAll(sortByIdAsc());
		
	}
	
	 private Sort sortByIdAsc() {
	        return new Sort(Sort.Direction.DESC, "rating");
	    }
	
	@PostMapping("/saveGPDetails")
	@ResponseBody
	public String saveDetails(@RequestParam("gpname") String name,@RequestParam("Place") String place,@RequestParam("type") String category){
		
		Tgiw_Planner   planner = new Tgiw_Planner();
		planner.setCategory(category);
		planner.setName(name);
		planner.setLocation(place);
		planner.setRating("5");
		Stream<Tgiw_Planner> planners =  Stream.of(planner);
		planners.forEach(planner_repository::save);
		return "Registered Successfully";
	}
	
	/*@GetMapping("/planner")
    public String viewHomePage(Model model) throws IOException {
        return "main";
    }
	
	@GetMapping("/guide")
    public String viewHomePage(Model model) throws IOException {
        return "main";
    }*/
	
}
