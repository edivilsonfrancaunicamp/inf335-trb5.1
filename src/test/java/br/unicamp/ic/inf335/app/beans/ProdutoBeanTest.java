package br.unicamp.ic.inf335.app.beans;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoBeanTest {

    @Test
    @DisplayName("Testa o retorno com valor 1")
    void compareToBetterThan() {
        ProdutoBean produto1 = new ProdutoBean("0001", "Moto g10", "Celular praticamente novo", 101.0, "novo");
        ProdutoBean produto2 = new ProdutoBean("0002", "Sansung Galaxy", "Celular muito bom", 100.0, "novo");
        int result = produto1.compareTo(produto2);
        assertEquals(result, 1);
    }

    @Test
    @DisplayName("Testa o retorno com valor -1")
    void compareToLessThan() {
        ProdutoBean produto1 = new ProdutoBean("0001", "Moto g10", "Celular praticamente novo", 100.0, "novo");
        ProdutoBean produto2 = new ProdutoBean("0002", "Sansung Galaxy", "Celular muito bom", 101.0, "novo");
        int result = produto1.compareTo(produto2);
        assertEquals(result, -1);
    }

    @Test
    @DisplayName("Testa o retorno com valor 0")
    void compareToEqualThan() {
        ProdutoBean produto1 = new ProdutoBean("0001", "Moto g10", "Celular praticamente novo", 100.0, "novo");
        ProdutoBean produto2 = new ProdutoBean("0002", "Sansung Galaxy", "Celular muito bom", 100.0, "novo");
        int result = produto1.compareTo(produto2);
        assertEquals(result, 0);
    }
}