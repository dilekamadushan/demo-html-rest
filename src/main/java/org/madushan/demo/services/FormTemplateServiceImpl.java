package org.madushan.demo.services;

import org.madushan.demo.domain.FormTemplate;
import org.madushan.demo.repositories.FormTemplateRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormTemplateServiceImpl implements FormTemplateService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private FormTemplateRepository formInfoRepository;

    @Autowired
    public void setFormInfoRepository(FormTemplateRepository formInfoRepository) {
        this.formInfoRepository = formInfoRepository;
    }

    @Override
    public List<FormTemplate> listAllFormInfo() {
        logger.debug("listAllFormInfos called");
        return (List<FormTemplate>) formInfoRepository.findAll();
    }

    @Override
    public FormTemplate getFormInfoById(Integer id) {
        logger.debug("getFormInfoById called");
        return formInfoRepository.findOne(id);
    }

}
