import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ExampleTest {

    @Test
    public void testSumar() {
        Example example = new Example();
        assertEquals(5, example.sumar(2, 3));
        assertEquals(-1, example.sumar(-2, 1));
        assertEquals(0, example.sumar(0, 0));
    }

    @Test
    public void testCheckPositivo() {
        Example example = new Example();
        assertTrue(example.checkPositivo(5));
        assertThrows(IllegalArgumentException.class, () -> example.checkPositivo(-3));
    }

    @Test
    public void testContarLetrasA() {
        Example example = new Example();
        assertEquals(3, example.contarLetrasA("banana"));
        assertEquals(0, example.contarLetrasA("xyz"));
        assertEquals(0, example.contarLetrasA(""));
    }

    @Test
    public void testContieneElemento() {
        Example example = new Example();
        List<String> lista = Arrays.asList("manzana", "pera", "uva");
        assertTrue(example.contieneElemento(lista, "pera"));
        assertFalse(example.contieneElemento(lista, "naranja"));
    }

    @Test
    public void testRevertirCadena() {
        Example example = new Example();
        assertEquals("olleh", example.revertirCadena("hello"));
        assertEquals("", example.revertirCadena(""));
        assertEquals("a", example.revertirCadena("a"));
    }

    @Test
    public void testFactorial() {
        Example example = new Example();
        assertEquals(120, example.factorial(5));
        assertEquals(1, example.factorial(0));
        assertThrows(IllegalArgumentException.class, () -> example.factorial(-3));
    }

    @Test
    public void testEsPrimo() {
        Example example = new Example();
        assertTrue(example.esPrimo(7));
        assertFalse(example.esPrimo(4));
        assertFalse(example.esPrimo(1));
        assertFalse(example.esPrimo(0));
        assertFalse(example.esPrimo(-7));
    }

    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        Example example = new Example();
        assertEquals("Listo después de retraso", example.mensajeConRetraso());
    }

    @Test
    public void testConvertirAString() {
        Example example = new Example();
        List<Integer> lista = Arrays.asList(1, 2, 3);
        List<String> esperado = Arrays.asList("1", "2", "3");
        assertEquals(esperado, example.convertirAString(lista));
    }

    @Test
    public void testCalcularMedia() {
        Example example = new Example();
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(3.0, example.calcularMedia(lista));
        assertThrows(IllegalArgumentException.class, () -> example.calcularMedia(null));
        assertThrows(IllegalArgumentException.class, () -> example.calcularMedia(Arrays.asList()));
    }

    @Test
    public void testConvertirListaAString() {
        Example example = new Example();
        List<String> lista = Arrays.asList("uno", "dos", "tres", null);
        String esperado = "UNO,DOS,TRES,NULL";
        assertEquals(esperado, example.convertirListaAString(lista));
    }
}