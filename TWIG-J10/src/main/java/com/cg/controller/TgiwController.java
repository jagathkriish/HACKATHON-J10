package com.cg.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cg.models.Master_Repository;
import com.cg.models.Traveller_Repository;

@Controller
public class TgiwController {
	
	
	/*private Traveller_Repository travel_repository;
	private Master_Repository master_repository;*/

	/*public TgiwController(Traveller_Repository travel_repository,Master_Repository master_repository) {
		this.master_repository = master_repository;
		this.travel_repository = travel_repository;
	}*/

	@GetMapping("/")
    public String viewHomePage(Model model) throws IOException {
        return "main";
    }
	
	@GetMapping("/traveller")
    public String viewTravellerPage(Model model) throws IOException {
        return "traveller";
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
