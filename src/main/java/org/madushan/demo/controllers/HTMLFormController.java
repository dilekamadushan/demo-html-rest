
package org.madushan.demo.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.madushan.demo.domain.HTMLForm;
import org.madushan.demo.domain.HTMLPage;
import org.madushan.demo.services.HTMLFormService;
import org.madushan.demo.services.HTMLFormService;
import org.madushan.demo.services.HTMLFormServiceImpl;
import org.madushan.demo.services.HTMLPageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value="HTML HTMLForm Entry Rest Module", description="Operations pertaining HTML Forms")
public class HTMLFormController {

    private HTMLFormServiceImpl htmlFormService;
	private HTMLPageServiceImpl htmlPageService;

    @Autowired 
	    public void setHTMLFormService (HTMLFormServiceImpl htmlFormService){
		    this.htmlFormService = htmlFormService;
	    }
	
	@Autowired
	public void setHTMLPageService(HTMLPageServiceImpl htmlPageService) {
		this.htmlPageService = htmlPageService;
	}
	

  @ApiOperation(value = "View a list of available htmlForms",response = HTMLPage.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )

  
  @RequestMapping(value = "/htmlforms", method= RequestMethod.GET, produces = "application/json")
    public HTMLPage list(Model model){
        List<HTMLForm> htmlFormList = (List<HTMLForm>) htmlFormService.listAllHTMLForms();
        HTMLPage htmlPage = htmlPageService.getHTMLPageById(1);
       htmlPage.addForm(htmlFormList);
        
        return htmlPage;
    }

    @ApiOperation(value = "Search a htmlForm with an ID",response = HTMLForm.class)
    @RequestMapping(value = "/htmlforms/{id}", method= RequestMethod.GET, produces = "application/json")
    public HTMLPage showHTMLForm(@PathVariable Integer id, Model model){
       HTMLForm htmlForm = htmlFormService.getHTMLFormById(id);
	    HTMLPage htmlPage = htmlPageService.getHTMLPageById(2);
	    htmlPage.addForm(htmlForm);
	
	    return htmlPage;
    }

    @ApiOperation(value = "Add a htmlForm")
    @RequestMapping(value = "/htmlforms", method = RequestMethod.POST, produces = "application/json")
    public HTMLPage saveHTMLForm(@RequestBody HTMLForm htmlForm){
    	
        htmlFormService.saveHTMLForm(htmlForm);
	    HTMLPage htmlPage = htmlPageService.getHTMLPageById(3);
	
	    return htmlPage;
    }

    @ApiOperation(value = "Update a htmlForm")
    @RequestMapping(value = "/htmlforms/{id}", method = RequestMethod.PUT, produces = "application/json")
    public HTMLPage updateHTMLForm(@PathVariable Integer id, @RequestBody HTMLForm htmlForm){
        HTMLForm storedHTMLForm = htmlFormService.getHTMLFormById(id);
        storedHTMLForm.setDescription(htmlForm.getDescription());
     
        htmlFormService.saveHTMLForm(storedHTMLForm);
	    HTMLPage htmlPage = htmlPageService.getHTMLPageById(4);
	
	    return htmlPage;
    }

    @ApiOperation(value = "Delete a htmlForm")
    @RequestMapping(value="/htmlforms/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public HTMLPage delete(@PathVariable Integer id){
        htmlFormService.deleteHTMLForm(id);
	    HTMLPage htmlPage = htmlPageService.getHTMLPageById(5);
	
	    return htmlPage;

    }

}

