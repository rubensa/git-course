import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercise1 {

    @Test
    public void suma2numeros(){
        assertEquals(4, 2+2);
    }

   @Test
   public void contarPalabras() {
    	String frase = "Esta es una frase super mega chula.";
    	String[] palabras = frase.split(" ");
    	int npalabras = palabras.length;
    	assertEquals(7, npalabras);
    }
    @Test
    public void multiplicaX10() {
    	assertEquals(100, 10*10);
    }
}
