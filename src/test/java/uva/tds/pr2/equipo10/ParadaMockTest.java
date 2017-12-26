package uva.tds.pr2.equipo10;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.eq;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.easymock.Mock;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(Isolation.class)
public class ParadaMockTest {

	@Mock
	private DireccionGPS direccion;

	@Test
	public void getDistanciaCorrectoTest() {
		direccion = createMock(DireccionGPS.class);
		expect(direccion.getLatitud()).andReturn((double) 5.1).times(4);
		expect(direccion.getLongitud()).andReturn((double) -5.1).times(2);
		replay(direccion);
		Parada parada = new Parada(direccion);
		Parada parada2 = new Parada(direccion);
		parada.getDistancia(parada2);
		assertNotNull(parada2);
		verify(direccion);
	}

	@Test(expected = IllegalArgumentException.class)
	public void getDistanciaParadaACompararNullTest() {
		direccion = createMock(DireccionGPS.class);
		expect(direccion.getLatitud()).andReturn((double) 5.1).times(4);
		expect(direccion.getLongitud()).andReturn((double) -5.1).times(2);
		replay(direccion);
		Parada parada = new Parada(direccion);
		parada.getDistancia(null);
		verify(direccion);
	}

}
