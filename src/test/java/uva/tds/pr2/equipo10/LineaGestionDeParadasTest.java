package uva.tds.pr2.equipo10;


import static org.junit.Assert.*;

import org.junit.*;

public class LineaGestionDeParadasTest {

	private DireccionGPS direccion1;
	private DireccionGPS direccion2;
	private DireccionGPS direccion3;
	private Parada parada1;
	private Parada parada2;
	private Parada parada3;
	private Parada paradas[];
	private int identificador;
	private Linea linea;

	@Before
	public void setUp(){
		direccion1 = new DireccionGPS(20.45, 30.50);
		direccion2 = new DireccionGPS(30.5, 20.4);
		direccion3 = new DireccionGPS(20.44999, 30.50);
		parada1 = new Parada(direccion1);
		parada2 = new Parada(direccion2);
		parada3 = new Parada(direccion3);
		paradas = new Parada[3];
		paradas[0] = parada1;
		paradas[1] = parada2;
		paradas[2] = parada3;
		identificador = 1;
		linea = new Linea(identificador, paradas);
	}

	@After
	public void tearDown(){
		direccion1 = null;
		direccion2 = null;
		direccion3 = null;
		parada1 = null;
		parada2 = null;
		parada3 = null;
		paradas = null;
		identificador = 0;
		linea = null;
	}

	@Test
	public void addParadaIntermediaCorrectoTest() {
		DireccionGPS direccionGPS = new DireccionGPS(20.1, 31);
		Parada parada = new Parada(direccionGPS);
		int posicion = 1;
		linea.addParadaIntermedia(parada, posicion);
		assertEquals(linea.getParadas()[posicion], parada);
	}

	@Test(expected = IllegalArgumentException.class)
	public void addParadaIntermediaConParadaNullTest() {
		int posicion = 1;
		linea.addParadaIntermedia(null, posicion);
	}

	@Test(expected = IllegalArgumentException.class)
	public void addParadaIntermediaConPosicionMenorDeCeroTest() {
		DireccionGPS direccionGPS = new DireccionGPS(20.1, 31);
		Parada parada = new Parada(direccionGPS);
		int posicion = 0;
		linea.addParadaIntermedia(parada, posicion);
	}

	@Test(expected = IllegalArgumentException.class)
	public void addParadaIntermediaConPosicionMayorQueParadaFinalTest() {
		DireccionGPS direccionGPS = new DireccionGPS(20.1, 31);
		Parada parada = new Parada(direccionGPS);
		int posicion = paradas.length - 1;
		linea.addParadaIntermedia(parada, posicion);
	}

	@Test
	public void addParadaFinalCorrectoTest() {
		DireccionGPS direccionGPS = new DireccionGPS(20.44999, 30.5);
		Parada parada = new Parada(direccionGPS);
		linea.addParadaFinal(parada);

		assertEquals(linea.getParadas()[linea.getParadas().length - 1], parada);
	}

	@Test(expected = IllegalArgumentException.class)
	public void addParadaFinalParadaNulaTest() {
		linea.addParadaFinal(null);

	}

	@Test(expected = IllegalArgumentException.class)
	public void addParadaFinalConParadaAMasDe100MetrosDeLaInicialSTest() {
		DireccionGPS direccionGPS = new DireccionGPS(20.4509, 30.5);
		Parada parada = new Parada(direccionGPS);
		linea.addParadaFinal(parada);
	}

	@Test
	public void addParadaInicialCorrectoTest() {
		DireccionGPS direccionGPS = new DireccionGPS(20.44999, 30.5);
		Parada parada = new Parada(direccionGPS);
		linea.addParadaInicial(parada);
		
		assertEquals(linea.getParadas()[0], parada);
	}

	@Test(expected = IllegalArgumentException.class)
	public void addParadaInicialConParadaNullTest() {
		linea.addParadaInicial(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void addParadaInicialConParadaAMasDistanciaDeCienTest() {
		DireccionGPS direccionGPS = new DireccionGPS(20.44, 30.5);
		Parada parada = new Parada(direccionGPS);
		linea.addParadaInicial(parada);
	}

	@Test
	public void removeParadaCorrectoTest() {
		linea.removeParada(parada2);

		assertFalse(linea.hasParada(parada2));

	}

	@Test(expected = IllegalArgumentException.class)
	public void removeParadaNulaTest() {
		linea.removeParada(null);

	}

	@Test(expected = IllegalArgumentException.class)
	public void removeParadaConparadaInicialTest() {
		linea.removeParada(parada1);

	}

	@Test(expected = IllegalArgumentException.class)
	public void removeParadaConparadaFinTest() {
		linea.removeParada(parada3);

	}

	@Test
	public void hasParadaCercaCorrectoTest() {
		assertTrue(linea.hasParadaCerca(direccion2));
		assertNotNull(direccion2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void hasParadaCercaConDireccionNullTest() {
		linea.hasParadaCerca(null);
	}

	@Test
	public void hasParadaCorrectoTest() {
		assertTrue(linea.hasParada(parada1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void hasParadaConParadaNullTest() {
		linea.hasParada(null);
	}
}
