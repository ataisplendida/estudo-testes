package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Cubo;

class Teste {
	private Cubo aresta;
	
	public Teste() {
		
	}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() {
		this.aresta = new Cubo();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Teste do método volume, da classe Cubo
	 */
	@Test
	void testVolume() {
		assertEquals(true, this.aresta.volume(10));
	}
	/**
	 * Teste do método areaFace, da classe Cubo
	 */
	@Test
	void testAreaFace() {
		assertEquals(true, this.aresta.areaFace(10));
	}
	/**
	 * Teste do método AreaTotal, da classe Cubo
	 */
	@Test
	void testAreaTotal() {
		assertEquals(true, this.aresta.areaTotal(10));
	}
	/**
	 * Teste do método diagonalFace, da classe Cubo
	 */
	@Test
	void testDiagonalface() {
		assertEquals(true, this.aresta.diagonalFace(10));
	}
	/**
	 * Teste do método diagonalInterna, da classe Cubo
	 */
	@Test
	void testdiagonalInterna() {
		assertEquals(true, this.aresta.diagonalInterna(10));
	}
	/**
	 * Teste do método comprimentoTotalArestas, da classe Cubo
	 */
	@Test
	void testComprimentoTotalArestas() {
		assertEquals(true, this.aresta.comprimentoTotalArestas(10));
	}
}
