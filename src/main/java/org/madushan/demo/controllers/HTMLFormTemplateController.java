
package org.madushan.demo.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.madushan.demo.domain.FormTemplate;
import org.madushan.demo.domain.HTMLForm;
import org.madushan.demo.services.FormTemplateServiceImpl;
import org.madushan.demo.services.HTMLFormServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.codehaus.groovy.tools.shell.util.Logger.io;

@RestController
@Api(value="HTML HTMLForm Entry Rest Module", description="Operations pertaining for getting HTML Form Templates")
public class HTMLFormTemplateController {

    private FormTemplateServiceImpl formTemplateService;

    @Autowired 
	    public void setHTMLFormTemplateService (FormTemplateServiceImpl formTemplateService){
		    this.formTemplateService = formTemplateService;
	    }
	
  @ApiOperation(value = "Get all html form templates ",
		  response = FormTemplate.class,
		  responseContainer = "List")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )

  
  @RequestMapping(value = "/htmlformtemplates", method= RequestMethod.GET, produces = "application/json")
    public List<FormTemplate> showFormTemplates(Model model){
        List<FormTemplate> htmlFormTemplateList = (List<FormTemplate>) formTemplateService.listAllFormInfo();
        return htmlFormTemplateList;
    }

    @ApiOperation(value = "Search for a HTML Form Template with an ID ",response = FormTemplate.class)
    @RequestMapping(value = "/htmlformtemplates/{id}", method= RequestMethod.GET, produces = "application/json")
    public FormTemplate showHTMLForm(@PathVariable Integer id, Model model){
       FormTemplate htmlFormTemplate = formTemplateService.getFormInfoById(id);
	   return htmlFormTemplate;
    }
	

}

