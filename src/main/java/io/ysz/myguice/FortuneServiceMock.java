package io.ysz.myguice;

// XXX io.ysz.test
public class FortuneServiceMock implements FortuneService {
    private int invocationCount;

    @Override
    public String randomFortune() {
        invocationCount++;
        return "MOCK";
    }

    public boolean calledOnce() {
        return invocationCount == 1;
    }
}
