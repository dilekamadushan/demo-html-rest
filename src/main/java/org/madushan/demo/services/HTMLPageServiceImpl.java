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
