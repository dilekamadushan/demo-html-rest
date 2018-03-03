package org.madushan.demo.services;


import org.madushan.demo.domain.HTMLForm;

import java.util.List;

public interface HTMLFormService {
    Iterable<HTMLForm> listAllHTMLForms();

    HTMLForm getHTMLFormById(Integer id);

    HTMLForm saveHTMLForm(HTMLForm HTMLForm);

    void deleteHTMLForm(Integer id);
}
