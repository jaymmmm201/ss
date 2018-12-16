package data;

import org.junit.Test;
import org.opencv.core.Core;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class SampleTest {
    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }
    @Test
    public void sampleReadTest() throws IOException {
       Sample sample =new Sample();
       sample.readTxt();
       assertEquals(sample.mahjongCardsTempForString.get(0),"1條,1T,1T.jpg");
    }
}
