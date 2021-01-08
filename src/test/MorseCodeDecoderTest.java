package test;

import main.java.kata.kyu6.MorseCodeDecoder;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;

class MorseCodeDecoderTest {
    @org.junit.jupiter.api.Test
    void decodeTestEmpty() {
        String code = "···· · −·−−   ·−−− ··− −·· ·";
        Assert.assertThat("HEY JUDE", CoreMatchers.is(MorseCodeDecoder.decode(code)));
    }
}