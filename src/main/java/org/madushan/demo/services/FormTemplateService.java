package org.madushan.demo.services;


import org.madushan.demo.domain.Concept;
import org.madushan.demo.domain.FormTemplate;

import java.util.List;

public interface FormTemplateService {
    List<FormTemplate> listAllFormInfo();

    FormTemplate getFormInfoById(Integer id);
	
}

