package br.unicamp.ic.inf335.app.beans;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AnuncioBeanTest {

    @Test
    @DisplayName("Testa o calculo do valor do produto com desconto")
    void getValorComDesconto() {
        ProdutoBean produto = new ProdutoBean("0001", "Moto g10", "Celular praticamente novo", 100.0, "novo");
        ArrayList<URL> listUrl = new ArrayList<URL>();
        AnuncioBean anuncioBen = new AnuncioBean(produto, listUrl, 10.0);
        Double result = anuncioBen.getValor();
        assertEquals(result, 90.0);
    }

    @Test
    @DisplayName("Testa o calculo do valor do produto sem desconto")
    void getValorSemDesconto() {
        ProdutoBean produto = new ProdutoBean("0001", "Moto g10", "Celular praticamente novo", 100.0, "novo");
        ArrayList<URL> listUrl = new ArrayList<URL>();
        AnuncioBean anuncio = new AnuncioBean(produto, listUrl, 0.0);
        Double result = anuncio.getValor();
        assertEquals(result, 100.0);
    }
}