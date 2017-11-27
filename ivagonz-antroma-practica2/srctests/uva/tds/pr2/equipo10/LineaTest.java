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
		paradas[0] = null;
		paradas[1] = null;
		paradas[2] = null;
		identificador = 0;
		linea = null;
	}

	@Test
	public void addParadaCorrectoTest() {
		//fail("Cambiar");
		DireccionGPS direccionGPS = new DireccionGPS(20.1, 31);
		Parada parada = new Parada(direccionGPS);
		int posicion = 1;
		linea.addParada(parada, posicion);
		assertNotNull(parada);
		assertTrue(posicion > 0);
		assertTrue(posicion < paradas.length - 1);
	}

}
