package ru.sample2.server.config;

import com.google.inject.AbstractModule;
import ru.sample2.server.AddressesRepository;
import ru.sample2.server.AddressesRepositoryFromBaseImpl;

import javax.inject.Singleton;

/**
 * Created by Anna on 23.02.2017.
 */
public class ApplicationModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(AddressesRepository.class).to(AddressesRepositoryFromBaseImpl.class).in(Singleton.class);
    }
}
