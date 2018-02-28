package io.ysz.myguice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class FortuneApplication {
    public static void main(String[] args) {
        Injector i = Guice.createInjector(new ChefModule());
        Chef chef = i.getInstance(Chef.class);
        chef.makeFortuneCookie();
    }
}
