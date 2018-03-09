
package org.madushan.demo.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.madushan.demo.domain.HTMLForm;
import org.madushan.demo.domain.HTMLPage;
import org.madushan.demo.services.HTMLFormServiceImpl;
import org.madushan.demo.services.HTMLPageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value="HTML HTMLForm Entry Rest Module", description="Operations pertaining HTML Forms")
public class HTMLFormController {

    private HTMLFormServiceImpl htmlFormService;

    @Autowired 
	    public void setHTMLFormService (HTMLFormServiceImpl htmlFormService){
		    this.htmlFormService = htmlFormService;
	    }
	
  @ApiOperation(value = "Get all html forms created by this user",
		  response = HTMLForm.class,
		  responseContainer = "List")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )

  
  @RequestMapping(value = "/htmlforms", method= RequestMethod.GET, produces = "application/json")
    public List<HTMLForm> showHTMLForms(Model model){
        List<HTMLForm> htmlFormList = (List<HTMLForm>) htmlFormService.listAllHTMLForms();
        return htmlFormList;
    }

    @ApiOperation(value = "Search for a HTML Form with an ID ",response = HTMLForm.class)
    @RequestMapping(value = "/htmlforms/{id}", method= RequestMethod.GET, produces = "application/json")
    public HTMLForm showHTMLForm(@PathVariable Integer id, Model model){
       HTMLForm htmlForm = htmlFormService.getHTMLFormById(id);
	   return htmlForm;
    }

    @ApiOperation(value = "Add a htmlForm")
    @RequestMapping(value = "/htmlforms", method = RequestMethod.POST)
    public void saveHTMLForm(@RequestBody HTMLForm htmlForm){
    	
        htmlFormService.saveHTMLForm(htmlForm);
    }

    @ApiOperation(value = "Update a htmlForm")
    @RequestMapping(value = "/htmlforms/{id}", method = RequestMethod.PUT)
    public void updateHTMLForm(@PathVariable Integer id, @RequestBody HTMLForm htmlForm){
        HTMLForm storedHTMLForm = htmlFormService.getHTMLFormById(id);
        storedHTMLForm.setDescription(htmlForm.getDescription());
	    storedHTMLForm.setFormXml(htmlForm.getFormXml());
	    storedHTMLForm.setCreatedDate(htmlForm.getCreatedDate());
	    storedHTMLForm.setCreatedBy(htmlForm.getCreatedBy());
     
        htmlFormService.saveHTMLForm(storedHTMLForm);
    }

    @ApiOperation(value = "Delete a htmlForm")
    @RequestMapping(value="/htmlforms/{id}", method = RequestMethod.DELETE)
    public void deleteHTMLForm(@PathVariable Integer id){
        htmlFormService.deleteHTMLForm(id);

    }

}

