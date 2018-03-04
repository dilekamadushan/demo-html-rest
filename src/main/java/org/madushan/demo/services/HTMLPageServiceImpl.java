package org.madushan.demo.services;

import org.madushan.demo.domain.HTMLPage;
import org.madushan.demo.repositories.HTMLPageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HTMLPageServiceImpl implements HTMLPageService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private HTMLPageRepository htmlPageRepository;

    @Autowired
    public void setHTMLPageRepository(HTMLPageRepository htmlPageRepository) {
        
    	this.htmlPageRepository = htmlPageRepository;
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

    @Override
    public Iterable<HTMLPage> listAllHTMLPages() {
        logger.debug("listAllPages called");
        return htmlPageRepository.findAll();
    }

    @Override
    public HTMLPage getHTMLPageById(Integer id) {
        logger.debug("getPageById called");
        return htmlPageRepository.findOne(id);
    }

    @Override
    public HTMLPage saveHTMLPage(HTMLPage HTMLPage) {
        logger.debug("savePage called");
        return htmlPageRepository.save(HTMLPage);
    }

    @Override
    public void deleteHTMLPage(Integer id) {
        logger.debug("deletePage called");
        htmlPageRepository.delete(id);
    }
}
