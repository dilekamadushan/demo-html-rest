package org.madushan.demo.services;

import org.madushan.demo.domain.Provider;
import org.madushan.demo.repositories.ProviderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProviderServiceImpl implements ProviderService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private ProviderRepository providerRepository;

    @Autowired
    public void setProviderRepository(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    @Override
    public Iterable<Provider> listAllProviders() {
        logger.debug("listAllProviders called");
        return providerRepository.findAll();
    }

    @Override
    public Provider getProviderById(Integer id) {
        logger.debug("getProviderById called");
        return providerRepository.findOne(id);
    }

    @Override
    public Provider saveProvider(Provider provider) {
        logger.debug("saveProvider called");
        return providerRepository.save(provider);
    }

    @Override
    public void deleteProvider(Integer id) {
        logger.debug("deleteProvider called");
        providerRepository.delete(id);
    }
}
