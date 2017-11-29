package uva.tds.pr2.equipo10;

import static org.junit.Assert.*;

import org.junit.*;

public class LineaTest {

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
	public void setUp() throws Exception {
		direccion1 = new DireccionGPS(20.45, 30.50);
		direccion2 = new DireccionGPS(30.5, 20.4);
		direccion3 = new DireccionGPS(20.4498, 30.50);
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
	public void tearDown() throws Exception {
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
		fail("Cambiar");
		DireccionGPS direccionGPS = new DireccionGPS(20.1, 31);
		Parada parada = new Parada(direccionGPS);
		int posicion = 1;
		linea.addParadaIntermedia(parada, posicion);
		assertNotNull(parada);
		assertTrue(posicion > 0);
		assertTrue(posicion < paradas.length - 1);
	}

	@Test(expected = NullPointerException.class)
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
		fail("Quitar en implementación");
		DireccionGPS direccionGPS = new DireccionGPS(20.44989, 30.5);
		Parada parada = new Parada(direccionGPS);
		linea.addParadaFinal(parada);

		assertNotNull(parada);
		assertTrue(parada.getDistancia(paradas[0]) < 100);
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
		fail("Cambiar");
		DireccionGPS direccionGPS = new DireccionGPS(20.44989, 30.5);
		Parada parada = new Parada(direccionGPS);
		linea.addParadaInicial(parada);
		assertNotNull(parada);
		assertTrue(paradas[paradas.length - 1].getDistancia(parada) < 100);
	}

	@Test(expected = IllegalArgumentException.class)
	public void addParadaInicialConParadaNullTest() {
		linea.addParadaInicial(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void addParadaInicialConParadaAMasDistanciaDeCienTest() {
		DireccionGPS direccionGPS = new DireccionGPS(20.44989, 30.5);
		Parada parada = new Parada(direccionGPS);
		linea.addParadaInicial(parada);
	}

	@Test
	public void removeParadaCorrectoTest() {
		fail("Quitar en implementación");
		linea.removeParada(parada2);

		assertNotNull(parada2);
		assertNotEquals(paradas[0], parada2);
		assertNotEquals(paradas[paradas.length - 1], parada2);

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
		fail("Quitar en implementación");
		linea.hasParadaCerca(direccion2);
		assertNotNull(direccion2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void hasParadaCercaConDireccionNullTest() {
		linea.hasParadaCerca(direccion2);
	}

	@Test
	public void hasCorrespondenciaCorrectoTest() {
		fail("Quitar en implementación");
		DireccionGPS _direccion1 = new DireccionGPS(20.45, 30.50);
		DireccionGPS _direccion2 = new DireccionGPS(30.5, 20.4);
		DireccionGPS _direccion3 = new DireccionGPS(20.4498, 30.50);
		Parada _parada1 = new Parada(_direccion1);
		Parada _parada2 = new Parada(_direccion2);
		Parada _parada3 = new Parada(_direccion3);
		Parada _paradas[] = new Parada[3];
		_paradas[0] = _parada1;
		_paradas[1] = _parada2;
		_paradas[2] = _parada3;
		int _identificador = 1;
		Linea _linea = new Linea(_identificador, _paradas);

		linea.hasCorrespondencia(_linea);
		assertNotNull(_linea);
	}

	@Test(expected = IllegalArgumentException.class)
	public void hasCorrespondenciaConLineaNullTest() {
		linea.hasCorrespondencia(null);
	}

	@Test
	public void getParadasConCorrespondenciaTest() {
		fail("Quitar en implementación");
		DireccionGPS _direccion1 = new DireccionGPS(20.45, 30.50);
		DireccionGPS _direccion2 = new DireccionGPS(30.5, 20.4);
		DireccionGPS _direccion3 = new DireccionGPS(20.4498, 30.50);
		Parada _parada1 = new Parada(_direccion1);
		Parada _parada2 = new Parada(_direccion2);
		Parada _parada3 = new Parada(_direccion3);
		Parada _paradas[] = new Parada[3];
		_paradas[0] = _parada1;
		_paradas[1] = _parada2;
		_paradas[2] = _parada3;
		int _identificador = 1;
		Linea _linea = new Linea(_identificador, _paradas);
		Parada paradasConCorrespondencia[] = linea.getParadasConCorrespondencia(_linea);
		assertNotNull(_linea);

	}

}
