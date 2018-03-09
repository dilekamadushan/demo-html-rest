package org.madushan.demo.bootstrap;

import org.madushan.demo.domain.*;
import org.madushan.demo.repositories.FormTemplateRepository;
import org.madushan.demo.repositories.HTMLFormRepository;
import org.madushan.demo.repositories.HTMLPageRepository;
import org.madushan.demo.repositories.ProductRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@Component
public class SpringJpaBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private ProductRepository productRepository;
	private HTMLFormRepository htmlFormRepository;
	private HTMLPageRepository htmlPageRepository;
	private FormTemplateRepository formTemplateRepository;


    private Logger log = Logger.getLogger(SpringJpaBootstrap.class);

    @Autowired
    public void setRepository(ProductRepository productRepository, HTMLFormRepository htmlFormRepository, HTMLPageRepository htmlPageRepository, FormTemplateRepository formTemplateRepository) {
        
    	this.productRepository = productRepository;
    	this.htmlFormRepository = htmlFormRepository;
    	this.htmlPageRepository = htmlPageRepository;
    	this.formTemplateRepository = formTemplateRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        loadProducts();
        loadHTMLForms();
        loadHTMLPages();
        loadFormTemplates();
    }

    private void loadProducts() {
        Product shirt = new Product();
        shirt.setDescription("HTML FORM Entry Demo");
        shirt.setPrice(new BigDecimal("18.95"));
        shirt.setImageUrl("https://springframework.guru/wp-content/uploads/2015/04/spring_framework_guru_shirt-rf412049699c14ba5b68bb1c09182bfa2_8nax2_512.jpg");
        shirt.setProductId("235268845711068308");
        productRepository.save(shirt);

        log.info("Saved Shirt - id: " + shirt.getId());

        Product mug = new Product();
        mug.setDescription("Spring Framework");
        mug.setImageUrl("https://springframework.guru/wp-content/uploads/2015/04/spring_framework_guru_coffee_mug-r11e7694903c348e1a667dfd2f1474d95_x7j54_8byvr_512.jpg");
        mug.setProductId("168639393495335947");
        mug.setPrice(new BigDecimal("11.95"));
        productRepository.save(mug);

        log.info("Saved Mug - id:" + mug.getId());
    }
    private  void loadHTMLForms(){
	
	    HTMLForm htmlForm = new HTMLForm();
	    htmlForm.setId(1);
	    htmlForm.setDescription("Sample Admission Form");
	    htmlForm.setCreatedBy("user1");
	    htmlForm.setCreatedDate(new Date());
	    htmlForm.setFormXml("<htmlform formUuid= c75f120a-04ec-11e3-8780-2b40bef9a44b formNameVisit Note formEncounterType= d7151f82-c1f3-4152-a605-2f9ea7414a79  formVersion= style type= text  css");
	    this.htmlFormRepository.save(htmlForm);
	
	    HTMLForm htmlForm2 = new HTMLForm();
	    htmlForm2.setId(2);
	    htmlForm2.setDescription("Sample Visit Form");
	    htmlForm2.setCreatedBy("user2");
	    htmlForm2.setCreatedDate(new Date());
	    htmlForm2.setFormXml(" <ifMode mode= VIEWinclude=false >n");
	    this.htmlFormRepository.save(htmlForm2);
    }
    
    private void loadHTMLPages(){
	    HTMLPage htmlPageFormList = new HTMLPage();
	    htmlPageFormList.setId(1);
	    htmlPageFormList.setTitle("HTML Form List");
	    htmlPageFormList.setBody("HTML Form List body");
	    htmlPageFormList.setMessage("200");
	
	    this.htmlPageRepository.save(htmlPageFormList);
	
	    HTMLPage htmlPageSingleForm = new HTMLPage();
	    htmlPageSingleForm.setId(2);
	    htmlPageSingleForm.setTitle("Single HTML Form");
	    htmlPageSingleForm.setBody("Single HTML Form  body");
	    htmlPageSingleForm.setMessage("200");
	
	    this.htmlPageRepository.save(htmlPageSingleForm);
	
	    HTMLPage htmlPageNewForm = new HTMLPage();
	    htmlPageNewForm.setId(3);
	    htmlPageNewForm.setTitle("New HTML Form");
	    htmlPageNewForm.setBody("New HTML Form  body");
	    htmlPageNewForm.setMessage("200");
	
	    this.htmlPageRepository.save(htmlPageNewForm);
	
	    HTMLPage htmlPageUpdateForm = new HTMLPage();
	    htmlPageUpdateForm.setId(4);
	    htmlPageUpdateForm.setTitle("Update HTML Form");
	    htmlPageUpdateForm.setBody("Update HTML Form  body");
	    htmlPageUpdateForm.setMessage("200");
	
	    this.htmlPageRepository.save(htmlPageUpdateForm);
	
	    HTMLPage htmlPageDeleteForm = new HTMLPage();
	    htmlPageDeleteForm.setId(5);
	    htmlPageDeleteForm.setTitle("Delete HTML Form");
	    htmlPageDeleteForm.setBody("Delete HTML Form  body");
	    htmlPageDeleteForm.setMessage("200");
	
	    this.htmlPageRepository.save(htmlPageDeleteForm);
    }
    
    private void loadFormTemplates(){
	    FormTemplate formTemplate1 = new FormTemplate();
	    formTemplate1.setId(1);
	    formTemplate1.addField("1: Enter Date");
	    formTemplate1.addField("2: Enter Hospital Name");
	    formTemplate1.addField("3: Enter Clinic Name ");
	    this.formTemplateRepository.save(formTemplate1);
    	
    }


    }



