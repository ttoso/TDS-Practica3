package uva.tds.pr2.equipo10;


import org.junit.Test;
import org.junit.experimental.categories.Category;


@Category(Sequence.class)
public class SecuenciaLineaTest {

	@Test
	public void secuenciaTest() {
		DireccionGPS direccion1 = new DireccionGPS(20.45, 30.50);
		DireccionGPS direccion2 = new DireccionGPS(30.5, 20.4);
		DireccionGPS direccion3 = new DireccionGPS(20.44999, 30.50);
		Parada parada1 = new Parada(direccion1);
		Parada parada2 = new Parada(direccion2);
		Parada parada3 = new Parada(direccion3);
		Parada[] paradas = new Parada[3];
		paradas[0] = parada1;
		paradas[1] = parada2;
		paradas[2] = parada3;
		int identificador = 1;

		Linea linea = new Linea(identificador, paradas);
		linea.addParadaIntermedia(parada1, 1);
		linea.removeParada(parada2);
		linea.hasParadaCerca(direccion1);
		linea.hasCorrespondencia(linea);
		linea.getParadasConTrasbordoDirecto(linea);
	}

}
