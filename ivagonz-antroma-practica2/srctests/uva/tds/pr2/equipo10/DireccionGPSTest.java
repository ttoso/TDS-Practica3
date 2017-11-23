package uva.tds.pr2.equipo10;

import static org.junit.Assert.*;

import org.junit.Test;

public class DireccionGPSTest {

	@Test
	public void constructorCorrectoTest() {
		double latitudNorte = 1.0;
		double latitudSur = -1.0;
		double longitudEste = 1.0;
		double longitudOeste = -1.0;
		@SuppressWarnings("unused")
		DireccionGPS direccion = new DireccionGPS(latitudNorte, latitudSur, 
				longitudEste, longitudOeste);
	}

}
