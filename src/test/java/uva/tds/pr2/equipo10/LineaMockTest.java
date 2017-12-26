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
	private Parada paradas[];
	private int identificador;
	private Linea linea;

	@Mock
	private Parada mParada1;
	private Parada mParada2;

	@Test
	public void hasCorrespondenciaCorrectoTest() {

		direccion1 = new DireccionGPS(20.45, 30.50);
		direccion2 = new DireccionGPS(30.5, 20.4);
		direccion3 = new DireccionGPS(20.44999, 30.50);
		paradas = new Parada[3];
		
		mParada1 = createMock(Parada.class);
		mParada2 = createMock(Parada.class);
		expect(mParada1.getDistancia(mParada1)).andReturn((double)0).times(2);
		expect(mParada1.getDistancia(mParada2)).andReturn((double)0).times(2);
		expect(mParada1.getDireccion()).andReturn((DireccionGPS) direccion1).once();
		replay(mParada1);
		replay(mParada2);
		
		paradas[0] = mParada1;
		paradas[1] = mParada1;
		paradas[2] = mParada1;
		identificador = 1;
		linea = new Linea(identificador, paradas);
		
		Parada _paradas[] = new Parada[3];
		_paradas[0] = mParada1;
		_paradas[1] = mParada1;
		_paradas[2] = mParada1;
		int _identificador = 2;
		Linea _linea = new Linea(_identificador, _paradas);

		assertTrue(linea.hasCorrespondencia(_linea));
		assertNotNull(_linea);
		verify(mParada1);
		verify(mParada2);

	}

}
