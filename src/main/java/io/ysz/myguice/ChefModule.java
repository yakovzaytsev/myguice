package io.ysz.myguice;

import com.google.inject.AbstractModule;
import com.google.inject.Binder;
import com.google.inject.Scopes;

public class ChefModule extends AbstractModule {
    protected void configure() {
        bind(FortuneService.class)
              .to(FortuneServiceImpl.class);
    }
}
