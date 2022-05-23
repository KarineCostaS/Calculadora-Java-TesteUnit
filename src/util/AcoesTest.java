package util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcoesTest {

    private Acoes acoesTeste;

    @BeforeEach
    void setUp() {
        acoesTeste = new Acoes();
    }

    @Test
    void soma() {
        assertEquals(10, acoesTeste.soma(5,5));
        assertEquals(9, acoesTeste.soma(4,5));
    }

    @Test
    void subtracao() {
        assertEquals(10,acoesTeste.subtracao(20,10));
        assertEquals(25, acoesTeste.subtracao(50,25));
    }

    @Test
    void multiplicacao() {
        assertEquals(25,acoesTeste.multiplicacao(5,5));
        assertEquals(50,acoesTeste.multiplicacao(5,10));
    }

    @Test
    void divisao() {
        assertEquals(100,acoesTeste.divisao(1000,10));
        assertEquals(3,acoesTeste.divisao(9,3));
    }

    @Test
    void exponencial() {
        assertEquals(216.0, acoesTeste.exponencial(6,3));
    }

    @Test
    void raizQuadrada() {
        assertEquals(12, acoesTeste.raizQuadrada(144));
        assertEquals(3, acoesTeste.raizQuadrada(9));
    }

    @Test
    void piso() {
    assertEquals(4,acoesTeste.piso(4.8));
    }

    @Test
    void teto() {
        assertEquals(6, acoesTeste.teto(5.9));
    }
}