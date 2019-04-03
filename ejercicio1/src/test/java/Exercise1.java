import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercise1 {

    @Test
    public void suma2numeros(){
        assertEquals(4, 2+2);
    }

    @Test
    public void multiplicaX10() {
    	assertEquals(100, 10*10);
    }

    @Test
    public void cuentaAtras10() {
    	int i = 10;
    	assertEquals(10, i);
    	for(i = 10; i>0; i--) {
    		assertEquals(i, i);
    	}
    	assertEquals(0, i);
    }

}
