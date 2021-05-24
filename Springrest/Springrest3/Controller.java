package springrest_3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springrest_3.models.State;
import springrest_3.StateServiceImpl;

@RestController
public class StateInfroController {

	@Autowired
	StateServiceImpl stateService;
	
	@RequestMapping("/state/{zipcode}")
	public State getState(@PathVariable("zipcode") String zipcode) {
		return stateService.getStateByZipCode(zipcode);
	}
	
}