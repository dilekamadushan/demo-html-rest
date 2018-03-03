package org.madushan.demo.services;

import org.madushan.demo.domain.HTMLForm;
import org.madushan.demo.repositories.HTMLFormRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HTMLFormServiceImpl implements HTMLFormService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private HTMLFormRepository formRepository;

    @Autowired
    public void setFormRepository(HTMLFormRepository formRepository) {
        this.formRepository = formRepository;
    }

    @Override
    public Iterable<HTMLForm> listAllHTMLForms() {
        logger.debug("listAllForms called");
        return formRepository.findAll();
    }

    @Override
    public HTMLForm getHTMLFormById(Integer id) {
        logger.debug("getFormById called");
        return formRepository.findOne(id);
    }

    @Override
    public HTMLForm saveHTMLForm(HTMLForm HTMLForm) {
        logger.debug("saveForm called");
        return formRepository.save(HTMLForm);
    }

    @Override
    public void deleteHTMLForm(Integer id) {
        logger.debug("deleteForm called");
        formRepository.delete(id);
    }
}
