package uva.tds.pr2.equipo10;


import org.junit.Test;

import org.junit.experimental.categories.Category;


@Category(Sequence.class)
public class SecuenciaDirecionTest {

	@Test
	public void secuenciaTest() {
		double latitud = 1.0;
		double longitud = 1.0;
		DireccionGPS direccion = new DireccionGPS(latitud, longitud);
		direccion.getLatitud();
		direccion.getLongitud();
	}


}
