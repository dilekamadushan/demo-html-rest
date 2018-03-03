
package org.madushan.demo.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.madushan.demo.domain.HTMLForm;
import org.madushan.demo.services.HTMLFormService;
import org.madushan.demo.services.HTMLFormService;
import org.madushan.demo.services.HTMLFormServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value="HTML HTMLForm Entry Rest Module", description="Operations pertaining HTML Forms")
public class HTMLFormController {

    private HTMLFormService htmlFormService;

    @Autowired
    public void setHTMLFormService(HTMLFormService htmlFormService) {
        this.htmlFormService = htmlFormService;
    }

  
  @ApiOperation(value = "View a list of available htmlForms",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )

  
  @RequestMapping(value = "/htmlforms", method= RequestMethod.GET, produces = "application/json")
    public Iterable<HTMLForm> list(Model model){
        Iterable<HTMLForm> htmlFormList = htmlFormService.listAllHTMLForms();
        return htmlFormList;
    }

    @ApiOperation(value = "Search a htmlForm with an ID",response = HTMLForm.class)
    @RequestMapping(value = "/htmlforms/{id}", method= RequestMethod.GET, produces = "application/json")
    public HTMLForm showHTMLForm(@PathVariable Integer id, Model model){
       HTMLForm htmlForm = htmlFormService.getHTMLFormById(id);
        return htmlForm;
    }

    @ApiOperation(value = "Add a htmlForm")
    @RequestMapping(value = "/htmlforms", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity saveHTMLForm(@RequestBody HTMLForm htmlForm){
        htmlFormService.saveHTMLForm(htmlForm);
        return new ResponseEntity("HTMLForm saved successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Update a htmlForm")
    @RequestMapping(value = "/htmlforms/{id}", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity updateHTMLForm(@PathVariable Integer id, @RequestBody HTMLForm htmlForm){
        HTMLForm storedHTMLForm = htmlFormService.getHTMLFormById(id);
        storedHTMLForm.setDescription(htmlForm.getDescription());
     
        htmlFormService.saveHTMLForm(storedHTMLForm);
        return new ResponseEntity("HTMLForm updated successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Delete a htmlForm")
    @RequestMapping(value="/htmlforms/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity delete(@PathVariable Integer id){
        htmlFormService.deleteHTMLForm(id);
        return new ResponseEntity("HTMLForm deleted successfully", HttpStatus.OK);

    }

}

