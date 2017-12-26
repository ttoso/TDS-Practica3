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
public class RedMockTest {
	
	@Mock
	private Linea mLinea;
	private Parada mParada;
	
	
	@Test
	public void getDistanciaParadasCorrectoTest() {
		
		mLinea = createMock(Linea.class);
		mParada = createMock(Parada.class);
		
		expect(mParada.getDistancia(mParada)).andReturn((double) 0).times(2);
		
		replay(mParada);
		
		Linea lineas[] = new Linea[3];
		lineas[0] = mLinea;
		lineas[1] = mLinea;
		lineas[2] = mLinea;
		
		Red red = new Red(lineas);
		
		@SuppressWarnings("unused")
		double distancia = red.getDistanciaParadas(mParada, mParada);
		assertNotNull(mParada);
		assertTrue(0 == red.getDistanciaParadas(mParada, mParada));
		verify(mParada);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getDistanciaConPrimerParametroNullTest() {
		
		mLinea = createMock(Linea.class);
		mParada = createMock(Parada.class);
		
		expect(mParada.getDistancia(mParada)).andReturn((double) 0).times(2);
		
		replay(mParada);
		
		Linea lineas[] = new Linea[3];
		lineas[0] = mLinea;
		lineas[1] = mLinea;
		lineas[2] = mLinea;
		
		Red red = new Red(lineas);
		
		red.getDistanciaParadas(null, mParada);
		verify(mParada);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getDistanciaConSegundoParametroNullTest() {
		mLinea = createMock(Linea.class);
		mParada = createMock(Parada.class);
		
		expect(mParada.getDistancia(mParada)).andReturn((double) 0).times(2);
		
		replay(mParada);
		
		Linea lineas[] = new Linea[3];
		lineas[0] = mLinea;
		lineas[1] = mLinea;
		lineas[2] = mLinea;
		
		Red red = new Red(lineas);
		
		red.getDistanciaParadas(mParada, null);
		verify(mParada);
	}

}
