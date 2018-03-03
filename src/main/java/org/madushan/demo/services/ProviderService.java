package org.madushan.demo.services;


import org.madushan.demo.domain.Provider;

public interface ProviderService {
    Iterable<Provider> listAllProviders();

    Provider getProviderById(Integer id);

    Provider saveProvider(Provider provider);

    void deleteProvider(Integer id);
}
