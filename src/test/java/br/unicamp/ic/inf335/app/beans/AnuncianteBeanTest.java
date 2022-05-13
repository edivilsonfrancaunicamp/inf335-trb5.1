package br.unicamp.ic.inf335.app.beans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AnuncianteBeanTest {

    private ProdutoBean produto;
    private AnuncianteBean anunciante;
    private ArrayList<URL> listUrl = new ArrayList();
    private ArrayList<AnuncioBean> listaAnuncios = new ArrayList();

    @BeforeEach
    @org.junit.jupiter.api.Test
    void setUp() {
        this.produto = new ProdutoBean("0001", "Moto g10", "Celular praticamente novo", 100.0, "novo");
        AnuncioBean anuncio = new AnuncioBean(produto, this.listUrl, 0.0);
        this.listaAnuncios.add(anuncio);
        this.anunciante = new AnuncianteBean("Anunciante 1", "262.280.670-10", listaAnuncios);
    }

    @Test
    @DisplayName("Testa a inclusão de um novo anuncio")
    void addAnuncio() {
        this.produto = new ProdutoBean("0002", "Sansung Galaxy", "Celular em ótimo estado", 100.0, "novo");
        AnuncioBean anuncio = new AnuncioBean(produto, this.listUrl, 0.0);
        this.anunciante.addAnuncio(anuncio);
        assertEquals(anunciante.getAnuncios().size(), 2);
    }

    @Test
    @DisplayName("Testa a remoção de um anuncio")
    void removeAnuncio() {
        this.produto = new ProdutoBean("0003", "Assus", "Celular que funciona tudo", 100.0, "novo");
        AnuncioBean anuncio = new AnuncioBean(produto, this.listUrl, 0.0);
        this.anunciante.addAnuncio(anuncio);
        this.anunciante.removeAnuncio(0);
        assertEquals(this.anunciante.getAnuncios().size(), 1);
    }

    @Test
    @DisplayName("Testa o calculo do valor médio dos anuncios")
    void valorMedioAnuncios() {
        Double result = this.anunciante.valorMedioAnuncios();
        assertEquals(result, 100.0);
    }
}