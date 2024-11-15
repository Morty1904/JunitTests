package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class ExampleTest {

    Example example = new Example();

    // 1. Tests para sumar(int a, int b)
    @Test
    void testSumarPositivos() {
        assertEquals(5, example.sumar(2, 3));
    }

    @Test
    void testSumarNegativos() {
        assertEquals(-5, example.sumar(-2, -3));
    }

    @Test
    void testSumarCero() {
        assertEquals(3, example.sumar(3, 0));
    }

    // 2. Tests para checkPositivo(int numero)
    @Test
    void testCheckPositivoConPositivo() {
        assertTrue(example.checkPositivo(5));
    }

    @Test
    void testCheckPositivoConCero() {
        assertTrue(example.checkPositivo(0));
    }

    @Test
    void testCheckPositivoConNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            example.checkPositivo(-1);
        });
        assertEquals("El número no puede ser negativo", exception.getMessage());
    }

    // 3. Tests para contarLetrasA(String cadena)
    @Test
    void testContarLetrasASimple() {
        assertEquals(3, example.contarLetrasA("banana"));
    }

    @Test
    void testContarLetrasAVacio() {
        assertEquals(0, example.contarLetrasA(""));
    }

    @Test
    void testContarLetrasASinA() {
        assertEquals(0, example.contarLetrasA("bcdf"));
    }

    // 4. Tests para contieneElemento(List<String> lista, String elemento)
    @Test
    void testContieneElemento() {
        List<String> lista = Arrays.asList("manzana", "pera", "uva");
        assertTrue(example.contieneElemento(lista, "pera"));
    }

    @Test
    void testNoContieneElemento() {
        List<String> lista = Arrays.asList("manzana", "pera", "uva");
        assertFalse(example.contieneElemento(lista, "plátano"));
    }

    @Test
    void testContieneElementoListaVacia() {
        List<String> lista = Arrays.asList();
        assertFalse(example.contieneElemento(lista, "manzana"));
    }

    // 5. Tests para revertirCadena(String cadena)
    @Test
    void testRevertirCadenaNormal() {
        assertEquals("cba", example.revertirCadena("abc"));
    }

    @Test
    void testRevertirCadenaVacio() {
        assertEquals("", example.revertirCadena(""));
    }

    @Test
    void testRevertirCadenaUnCaracter() {
        assertEquals("a", example.revertirCadena("a"));
    }

    // 6. Tests para factorial(int numero)
    @Test
    void testFactorialPositivo() {
        assertEquals(120, example.factorial(5));
    }

    @Test
    void testFactorialCero() {
        assertEquals(1, example.factorial(0));
    }

    @Test
    void testFactorialNumeroNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            example.factorial(-1);
        });
        assertEquals("Factorial no definido para números negativos", exception.getMessage());
    }

    // 7. Tests para esPrimo(int numero)
    @Test
    void testEsPrimo() {
        assertTrue(example.esPrimo(7));
    }

    @Test
    void testNoEsPrimo() {
        assertFalse(example.esPrimo(9));
    }

    @Test
    void testEsPrimoConNumeroPequeno() {
        assertFalse(example.esPrimo(1));
        assertFalse(example.esPrimo(0));
        assertFalse(example.esPrimo(-5));
    }

    // 8. Tests para mensajeConRetraso()
    @Test
    void testMensajeConRetraso() throws InterruptedException {
        assertEquals("Listo después de retraso", example.mensajeConRetraso());
    }

    // 9. Tests para convertirAString(List<Integer> lista)
    @Test
    void testConvertirAString() {
        List<Integer> lista = Arrays.asList(1, 2, 3);
        List<String> resultado = example.convertirAString(lista);
        assertEquals(Arrays.asList("1", "2", "3"), resultado);
    }

    @Test
    void testConvertirAStringListaVacia() {
        List<Integer> lista = Arrays.asList();
        List<String> resultado = example.convertirAString(lista);
        assertTrue(resultado.isEmpty());
    }

    // 10. Tests para calcularMedia(List<Integer> lista)
    @Test
    void testCalcularMedia() {
        List<Integer> lista = Arrays.asList(1, 2, 3);
        assertEquals(2.0, example.calcularMedia(lista));
    }

    @Test
    void testCalcularMediaListaVacia() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            example.calcularMedia(Arrays.asList());
        });
        assertEquals("La lista no puede ser nula o vacía", exception.getMessage());
    }

    // 11. Tests para convertirListaAString(List<String> lista)
    @Test
    void testConvertirListaAString() {
        List<String> lista = Arrays.asList("manzana", "pera", "uva");
        assertEquals("MANZANA,PERA,UVA", example.convertirListaAString(lista));
    }

    @Test
    void testConvertirListaAStringConNulo() {
        List<String> lista = Arrays.asList("manzana", null, "uva");
        assertEquals("MANZANA,NULL,UVA", example.convertirListaAString(lista));
    }

    @Test
    void testConvertirListaAStringVacia() {
        List<String> lista = Arrays.asList();
        assertEquals("", example.convertirListaAString(lista));
    }
}