import org.junit.Test;

import static org.junit.Assert.*;

public class TestDecoding {
    Decoding testDecoding = new Decoding( 2, "MGWQRSTU MEWDRFCTR");
    @Test
    public void checkIfSavesInputText()
    {
        assertEquals("MGWQRSTU MEWDRFCTR", testDecoding.getInputText() );
    }

    @Test
    public void checkKeyIsSaved()
    {
        assertEquals(2,testDecoding.getKey());
    }

    @Test
    public void isValidInputText()
    {
        assertEquals(true, testDecoding.isValidInputText());
    }

    @Test
    public void isValidKey()
    {
        assertEquals(true, testDecoding.isValidKey());
    }

    @Test
    public void validDecoding()
    {
        assertEquals("wanjohi juniour" , testDecoding.decode());
    }
}