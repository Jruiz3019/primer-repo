package main.test.eam.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.com.eam.app.Calculadora;

class CalculadoraTest {
    
    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    void testSumar() {
        double resultado = calculadora.sumar(5, 3);
        assertEquals(8, resultado, "La suma de 5 y 3 debe ser 8");
    }

    @Test
    void testRestar() {
        double resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado, "La resta de 5 menos 3 debe ser 2");
    }

    @Test
    void testMultiplicar() {
        double resultado = calculadora.multiplicar(5, 3);
        assertEquals(15, resultado, "La multiplicación de 5 por 3 debe ser 15");
    }

    @Test
    void testDividir() {
        double resultado = calculadora.dividir(6, 3);
        assertEquals(2, resultado, "La división de 6 entre 3 debe ser 2");
    }

    @Test
    void testDividirPorCero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividir(1, 0);
        });
        assertEquals("No se admiten divisores 0", exception.getMessage(), "Dividir por cero debe lanzar IllegalArgumentException");
    }
}

