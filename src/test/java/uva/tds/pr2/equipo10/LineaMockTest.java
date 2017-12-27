package uva.tds.pr2.equipo10;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.*;

import org.easymock.Mock;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(Isolation.class)
public class LineaMockTest {


	private Parada paradas[];
	private int identificador;
	private Linea linea;

	@Mock
	private Parada mParada1;

	@Test
	public void hasTrasbordoDirectoCorrectoTest() {
		
		
		
		mParada1 = createMock(Parada.class);
		
		expect(mParada1.getDistancia(mParada1)).andReturn((double) 0).times(3);
		
		replay(mParada1);
		
		paradas = new Parada[3];
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
		
		assertTrue(linea.hasTrasbordoDirecto(_linea));
		assertNotNull(_linea);
		
		verify(mParada1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void hasTrasbordoDirectoConLineaNullTest() {
		mParada1 = createMock(Parada.class);
		
		expect(mParada1.getDistancia(mParada1)).andReturn((double) 0).times(3);
		
		replay(mParada1);
		
		paradas = new Parada[3];
		paradas[0] = mParada1;
		paradas[1] = mParada1;
		paradas[2] = mParada1;
		identificador = 1;
		linea = new Linea(identificador, paradas);
		
		linea.hasTrasbordoDirecto(null);
		verify(mParada1);
	}

	
	@Test
	public void getParadasConTrasbordoDirectoCorrectoTest() {
		
		mParada1 = createMock(Parada.class);
		
		expect(mParada1.getDistancia(mParada1)).andReturn((double) 0).times(13);
		
		replay(mParada1);
		
		paradas = new Parada[3];
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

		Parada paradasConCorrespondencia[] = linea.getParadasConTrasbordoDirecto(_linea);
		
		assertNotNull(_linea);
		assertTrue(linea.hasTrasbordoDirecto(_linea));
		Parada trasbordos[] = new Parada[] { mParada1, mParada1, mParada1, mParada1, mParada1, mParada1, mParada1, mParada1, mParada1, };
		assertArrayEquals(trasbordos, paradasConCorrespondencia);
		verify(mParada1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getParadasConTrasbordoDirectoConLineaNullTest() {
mParada1 = createMock(Parada.class);
		
		expect(mParada1.getDistancia(mParada1)).andReturn((double) 0).times(13);
		
		replay(mParada1);
		
		paradas = new Parada[3];
		paradas[0] = mParada1;
		paradas[1] = mParada1;
		paradas[2] = mParada1;
		identificador = 1;
		linea = new Linea(identificador, paradas);
		
		linea.getParadasConTrasbordoDirecto(null);
		verify(mParada1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getParadasConTrasbordoDirectoConLineaSinTrasbordoDirectoTest() {
		
		mParada1 = createMock(Parada.class);
		
		expect(mParada1.getDistancia(mParada1)).andReturn((double) 150).times(12);
		
		replay(mParada1);
		
		paradas = new Parada[3];
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
		
		linea.getParadasConTrasbordoDirecto(_linea);
		
		verify(mParada1);
	}
	
	@Test
	public void checkDistanciaCorrectoTest() {
		mParada1 = createMock(Parada.class);
		
		expect(mParada1.getDistancia(mParada1)).andReturn((double) 0).times(2);
		
		replay(mParada1);
		
		paradas = new Parada[3];
		paradas[0] = mParada1;
		paradas[1] = mParada1;
		paradas[2] = mParada1;
		identificador = 1;
		linea = new Linea(identificador, paradas);
		
		double distancia = linea.checkDistancia(mParada1, mParada1);
		assertNotNull(mParada1);
		assertTrue(0 == distancia);
		
		verify(mParada1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void checkDistanciaConPrimerParametroNullTest() {
		mParada1 = createMock(Parada.class);
		expect(mParada1.getDistancia(mParada1)).andReturn((double) 0).times(2);
		
		replay(mParada1);
		
		paradas = new Parada[3];
		paradas[0] = mParada1;
		paradas[1] = mParada1;
		paradas[2] = mParada1;
		identificador = 1;
		linea = new Linea(identificador, paradas);
		linea.checkDistancia(null, mParada1);
		verify(mParada1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void checkDistanciaConSegundoParametroNullTest() {
		mParada1 = createMock(Parada.class);
		expect(mParada1.getDistancia(mParada1)).andReturn((double) 0).times(2);
		
		replay(mParada1);
		
		paradas = new Parada[3];
		paradas[0] = mParada1;
		paradas[1] = mParada1;
		paradas[2] = mParada1;
		identificador = 1;
		linea = new Linea(identificador, paradas);

		linea.checkDistancia(mParada1, null);
		verify(mParada1);
	}
}
