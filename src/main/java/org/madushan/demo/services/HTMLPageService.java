package org.madushan.demo.services;


import org.madushan.demo.domain.HTMLPage;

public interface HTMLPageService {
    Iterable<HTMLPage> listAllHTMLPages();

    HTMLPage getHTMLPageById(Integer id);

    HTMLPage saveHTMLPage(HTMLPage HTMLPage);

    void deleteHTMLPage(Integer id);
}
