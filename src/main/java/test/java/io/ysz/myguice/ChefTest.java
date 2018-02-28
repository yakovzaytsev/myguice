package io.ysz.myguice;

import org.junit.Test;

import java.text.ChoiceFormat;

import static org.junit.Assert.assertTrue;

public class ChefTest {
    @Test
    public void makeFortuneCookie() {
        FortuneServiceMock mock = new FortuneServiceMock();
        Chef chef = new Chef(mock);
        chef.makeFortuneCookie();
        assertTrue(mock.calledOnce());
    }
}
