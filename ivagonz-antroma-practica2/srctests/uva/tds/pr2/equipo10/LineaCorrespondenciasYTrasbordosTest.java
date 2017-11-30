package uva.tds.pr2.equipo10;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LineaCorrespondenciasYTrasbordosTest {

	private DireccionGPS direccion1;
	private DireccionGPS direccion2;
	private DireccionGPS direccion3;
	private Parada parada1;
	private Parada parada2;
	private Parada parada3;
	private Parada paradas[];
	private int identificador;
	private Linea linea;

	private final double errorAdmisible = 0.001;

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
		int _identificador = 2;
		Linea _linea = new Linea(_identificador, _paradas);

		assertTrue(linea.hasCorrespondencia(_linea));
		assertNotNull(_linea);
	}

	@Test(expected = IllegalArgumentException.class)
	public void hasCorrespondenciaConLineaNullTest() {
		linea.hasCorrespondencia(null);
	}

	@Test
	public void getParadasConCorrespondenciaCorrectoTest() {
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
		int _identificador = 2;
		Linea _linea = new Linea(_identificador, _paradas);

		Parada paradasConCorrespondencia[] = linea.getParadasConCorrespondencia(_linea);
		Parada correspondencias[] = new Parada[] { _parada1, _parada2, _parada3 };

		assertNotNull(_linea);
		assertTrue(linea.hasCorrespondencia(_linea));
		assertArrayEquals(correspondencias, paradasConCorrespondencia);
	}

	@Test(expected = IllegalArgumentException.class)
	public void getParadasConCorrespondenciaLineaNullTest() {
		linea.getParadasConCorrespondencia(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void getParadasConCorrespondenciaConLineaSinCorrespondenciaTest() {
		DireccionGPS _direccion1 = new DireccionGPS(21.45, 31.50);
		DireccionGPS _direccion2 = new DireccionGPS(31.5, 21.4);
		DireccionGPS _direccion3 = new DireccionGPS(21.4498, 31.50);
		Parada _parada1 = new Parada(_direccion1);
		Parada _parada2 = new Parada(_direccion2);
		Parada _parada3 = new Parada(_direccion3);
		Parada _paradas[] = new Parada[3];
		_paradas[0] = _parada1;
		_paradas[1] = _parada2;
		_paradas[2] = _parada3;
		int _identificador = 2;
		Linea _linea = new Linea(_identificador, _paradas);
		linea.getParadasConCorrespondencia(_linea);
	}

	@Test
	public void hasTrasbordoDirectoCorrectoTest() {
		fail("Quitar en implementación");
		DireccionGPS _direccion1 = new DireccionGPS(21.45, 31.50);
		DireccionGPS _direccion2 = new DireccionGPS(30.5, 20.4);
		DireccionGPS _direccion3 = new DireccionGPS(21.4498, 31.50);
		Parada _parada1 = new Parada(_direccion1);
		Parada _parada2 = new Parada(_direccion2);
		Parada _parada3 = new Parada(_direccion3);
		Parada _paradas[] = new Parada[3];
		_paradas[0] = _parada1;
		_paradas[1] = _parada2;
		_paradas[2] = _parada3;
		int _identificador = 2;
		Linea _linea = new Linea(_identificador, _paradas);
		assertTrue(linea.hasTrasbordoDirecto(_linea));
		assertNotNull(_linea);
	}

	@Test(expected = IllegalArgumentException.class)
	public void hasTrasbordoDirectoConLineaNullTest() {
		linea.hasTrasbordoDirecto(null);
	}

	@Test
	public void getParadasConTrasbordoDirectoCorrectoTest() {
		fail("Quitar en implementación");
		DireccionGPS _direccion1 = new DireccionGPS(21.45, 31.50);
		DireccionGPS _direccion2 = new DireccionGPS(30.5, 20.4);
		DireccionGPS _direccion3 = new DireccionGPS(21.4498, 31.50);
		Parada _parada1 = new Parada(_direccion1);

		Parada _parada2 = new Parada(_direccion2);
		Parada _parada3 = new Parada(_direccion3);
		Parada _paradas[] = new Parada[3];
		_paradas[0] = _parada1;
		_paradas[1] = _parada2;
		_paradas[2] = _parada3;
		int _identificador = 2;
		Linea _linea = new Linea(_identificador, _paradas);

		Parada paradasConCorrespondencia[] = linea.getParadasConTrasbordoDirecto(_linea);
		assertNotNull(_linea);
		assertTrue(linea.hasTrasbordoDirecto(_linea));
		Parada trasbordos[] = new Parada[] { _parada2 };
		assertArrayEquals(trasbordos, paradasConCorrespondencia);

	}

	@Test(expected = IllegalArgumentException.class)
	public void getParadasConTrasbordoDirectoConLineaNullTest() {
		linea.getParadasConCorrespondencia(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void getParadasConTrasbordoDirectoConLineaSinTrasbordoDirectoTest() {
		DireccionGPS _direccion1 = new DireccionGPS(21.45, 31.50);
		DireccionGPS _direccion2 = new DireccionGPS(31.5, 21.4);
		DireccionGPS _direccion3 = new DireccionGPS(21.4498, 31.50);
		Parada _parada1 = new Parada(_direccion1);
		Parada _parada2 = new Parada(_direccion2);
		Parada _parada3 = new Parada(_direccion3);
		Parada _paradas[] = new Parada[3];
		_paradas[0] = _parada1;
		_paradas[1] = _parada2;
		_paradas[2] = _parada3;
		int _identificador = 2;
		Linea _linea = new Linea(_identificador, _paradas);
		linea.getParadasConTrasbordoDirecto(_linea);
	}

	@Test
	public void checkDistanciaCorrectoTest() {
		fail("Quitar en implementación");
		int distancia = linea.checkDistancia(parada1, parada2);
		assertNotNull(parada1);
		assertNotNull(parada2);
		assertEquals(1698851, distancia, errorAdmisible);
	}

	@Test(expected = IllegalArgumentException.class)
	public void checkDistanciaConPrimerParametroNullTest() {

		linea.checkDistancia(null, parada2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void checkDistanciaConSegundoParametroNullTest() {

		linea.checkDistancia(parada1, null);
	}

}
