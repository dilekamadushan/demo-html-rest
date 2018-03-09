
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
@Api(value="HTML HTMLForm Entry Rest Module", description="Operations pertaining Viewing HTML Pages")
public class HTMLPageController {

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
	

  @ApiOperation(value = "View a list of available htmlForms in a HTML",response = HTMLPage.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )

  
  @RequestMapping(value = "/htmlformpages", method= RequestMethod.GET, produces = "application/json")
    public HTMLPage showHTMLFormListPage(Model model){
        List<HTMLForm> htmlFormList = (List<HTMLForm>) htmlFormService.listAllHTMLForms();
        HTMLPage htmlPage = htmlPageService.getHTMLPageById(1);
       htmlPage.addForm(htmlFormList);
        
        return htmlPage;
    }

    @ApiOperation(value = "Search for a HTML Form with an ID and get it in a HTML Page ",response = HTMLForm.class)
    @RequestMapping(value = "/htmlformpages/{id}", method= RequestMethod.GET, produces = "application/json")
    public HTMLPage showHTMLFormPage(@PathVariable Integer id, Model model){
       HTMLForm htmlForm = htmlFormService.getHTMLFormById(id);
	    HTMLPage htmlPage = htmlPageService.getHTMLPageById(2);
	    htmlPage.addForm(htmlForm);
	
	    return htmlPage;
    }


}

