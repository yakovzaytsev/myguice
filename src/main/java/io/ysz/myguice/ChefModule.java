package io.ysz.myguice;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Scopes;

public class ChefModule implements Module {
    public void configure(Binder binder) {
        binder.bind(FortuneService.class)
              .to(FortuneServiceImpl.class)
              .in(Scopes.SINGLETON);
    }
}
