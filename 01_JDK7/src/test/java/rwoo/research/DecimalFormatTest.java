package rwoo.research;

import org.junit.Test;

import java.text.DecimalFormat;

public class DecimalFormatTest {
    @Test
    public void testFormat () {
        // javaDoc link http://docs.oracle.com/javase/7/docs/api/java/text/DecimalFormat.html
        DecimalFormat nf = new DecimalFormat("0.##");
        System.out.println(nf.format(Math.PI));

        nf.applyPattern("00.##");
        System.out.println(nf.format(Math.PI));

        nf.applyPattern("00.###");
        System.out.println(nf.format(Math.PI));

        nf.applyPattern("00.####");
        System.out.println(nf.format(Math.PI));
    }
}
