package uva.tds.pr2.equipo10;

import org.junit.Test;

public class LineaTest {
	
	@Test
	public void constructorCorrectoTest() {
		DireccionGPS direccion1 = new DireccionGPS(20.45,30.50);
		DireccionGPS direccion2 = new DireccionGPS(30.5, 20.4);
		Parada parada1 = new Parada(direccion1);
		Parada parada2 = new Parada(direccion2);
		Parada[] paradas = new Parada[3];
		
		Linea linea = new Linea(1, paradas);
		
	}

}
