package uva.tds.pr2.equipo10;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RedTest {

	private DireccionGPS direccion1;
	private DireccionGPS direccion2;
	private DireccionGPS direccion3;
	private Parada parada1;
	private Parada parada2;
	private Parada parada3;
	private Parada paradas[];
	private int identificador;
	private Linea linea;

	private Parada parada4;
	private Parada parada5;
	private Parada parada6;
	private Parada paradas2[];
	private int identificador2;
	private Linea linea2;

	private Linea[] lineas;
	private Red red;

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

		parada6 = new Parada(direccion3);
		parada5 = new Parada(direccion2);
		parada4 = new Parada(direccion1);
		paradas2 = new Parada[3];
		paradas2[0] = parada6;
		paradas2[1] = parada5;
		paradas2[2] = parada4;
		identificador2 = 2;
		linea2 = new Linea(identificador2, paradas2);

		lineas = new Linea[] { linea, linea2 };
		red = new Red(lineas);
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

		parada6 = null;
		parada5 = null;
		parada4 = null;
		paradas2 = null;
		identificador2 = 0;
		linea2 = null;

		lineas = null;
		red = null;
	}

	@Test
	public void addLineaCorrectoTest() {
		DireccionGPS d1 = new DireccionGPS(20.45, 30.50);
		DireccionGPS d2 = new DireccionGPS(30.5, 20.4);
		DireccionGPS d3 = new DireccionGPS(20.4498, 30.50);
		Parada p1 = new Parada(direccion1);
		Parada p2 = new Parada(direccion2);
		Parada p3 = new Parada(direccion3);
		Parada p[] = new Parada[3];
		p[0] = p1;
		p[1] = p2;
		p[2] = p3;
		int identificador = 3;
		linea = new Linea(identificador, paradas);
		red.addLinea(linea);
	}

}
