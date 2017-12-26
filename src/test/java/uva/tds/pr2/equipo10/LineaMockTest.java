package uva.tds.pr2.equipo10;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.eq;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.easymock.Mock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(Isolation.class)
public class LineaMockTest {

	private DireccionGPS direccion1;
	private DireccionGPS direccion2;
	private DireccionGPS direccion3;
	private Parada parada1;
	private Parada parada2;
	private Parada parada3;
	private Parada paradas[];
	private int identificador;
	private Linea linea;

	@Mock
	private Parada mParada1;
	private Parada mParada2;
	private Parada mParada3;

	@Before
	public void setUp() {
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
	public void tearDown() {
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

		mParada1 = createMock(Parada.class);
		mParada2 = createMock(Parada.class);
		mParada3 = createMock(Parada.class);

		expect(mParada1.getDireccion()).andReturn((DireccionGPS) direccion1);
		expect(mParada2.getDireccion()).andReturn((DireccionGPS) direccion2);
		expect(mParada3.getDireccion()).andReturn((DireccionGPS) direccion3);

		Parada _paradas[] = new Parada[3];
		_paradas[0] = mParada1;
		_paradas[1] = mParada2;
		_paradas[2] = mParada3;
		int _identificador = 2;
		Linea _linea = new Linea(_identificador, _paradas);

		assertTrue(linea.hasCorrespondencia(_linea));
		assertNotNull(_linea);
	}

}
