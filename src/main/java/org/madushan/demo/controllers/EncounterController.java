
package org.madushan.demo.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.madushan.demo.domain.Encounter;
import org.madushan.demo.domain.FormSubmission;
import org.madushan.demo.domain.HTMLForm;
import org.madushan.demo.domain.HTMLPage;
import org.madushan.demo.services.EncounterServiceImpl;
import org.madushan.demo.services.HTMLFormServiceImpl;
import org.madushan.demo.services.HTMLPageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "HTML HTMLForm Entry Rest Module", description = "Operations pertaining Encounters")
public class EncounterController {
	
	private EncounterServiceImpl encounterService;
	
	@Autowired
	public void setEncounterService(EncounterServiceImpl encounterService) {
		this.encounterService = encounterService;
	}
	
	
	@ApiOperation(value = "Search  encounters with a Patient ID", response = Encounter.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	
	@RequestMapping(value = "/encounters/{patientId}", method = RequestMethod.GET, produces = "application/json")
	public List<Encounter> list(@PathVariable Integer patientId,Model model) {
		List<Encounter> encounterList = (List<Encounter>) encounterService.getEncounterById(patientId);
		return encounterList;
		
	}
	
	@ApiOperation(value = "Update an encounter")
	@RequestMapping(value = "/encounters/{patientId}", method = RequestMethod.PUT, produces = "application/json")
	public void updateEncounter(@PathVariable Integer patientId, @RequestBody FormSubmission formSubmission) {
		Encounter storedEncounter = encounterService.getEncounterById(patientId);
		
		encounterService.saveEncounter(formSubmission);
		
	}
	
	@ApiOperation(value = "Delete an encounter")
	@RequestMapping(value = "/encounters/{patientId}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer patientId) {
		encounterService.deleteEncounter(patientId);
		
	}
	
}

