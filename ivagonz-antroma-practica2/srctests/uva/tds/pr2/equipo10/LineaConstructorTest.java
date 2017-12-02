package uva.tds.pr2.equipo10;

import static org.junit.Assert.*;

import org.junit.Test;

public class LineaConstructorTest {

	private final double errorAdmisible = 0.001;

	@Test
	public void constructorCorrectoTest() {
		DireccionGPS direccion1 = new DireccionGPS(20.45, 30.50);
		DireccionGPS direccion2 = new DireccionGPS(30.5, 20.4);
		DireccionGPS direccion3 = new DireccionGPS(20.4498, 30.50);
		Parada parada1 = new Parada(direccion1);
		Parada parada2 = new Parada(direccion2);
		Parada parada3 = new Parada(direccion3);
		Parada[] paradas = new Parada[3];
		paradas[0] = parada1;
		paradas[1] = parada2;
		paradas[2] = parada3;
		int identificador = 1;

		Linea linea = new Linea(identificador, paradas);

		assertEquals(identificador, linea.getId(), errorAdmisible);
		assertNotNull(linea.getParadas());
		assertArrayEquals(paradas, linea.getParadas());
		assertFalse(linea.hasParadaNull());

	}

	@Test(expected = IllegalArgumentException.class)
	public void constructorIdentificadorMenorQue1Test() {
		DireccionGPS direccion1 = new DireccionGPS(20.45, 30.50);
		DireccionGPS direccion2 = new DireccionGPS(30.5, 20.4);
		DireccionGPS direccion3 = new DireccionGPS(20.4498, 30.50);
		Parada parada1 = new Parada(direccion1);
		Parada parada2 = new Parada(direccion2);
		Parada parada3 = new Parada(direccion3);
		Parada[] paradas = new Parada[3];
		paradas[0] = parada1;
		paradas[1] = parada2;
		paradas[2] = parada3;
		int identificador = 0;

		@SuppressWarnings("unused")
		Linea linea = new Linea(identificador, paradas);
	}

	@Test(expected = NullPointerException.class)
	public void constructorParadasNullTest() {
		Parada[] paradas = null;

		int identificador = 1;

		@SuppressWarnings("unused")
		Linea linea = new Linea(identificador, paradas);
	}

	@Test(expected = NullPointerException.class)
	public void constructorParadasConUnElementoNullTest() {
		DireccionGPS direccion1 = new DireccionGPS(20.45, 30.50);
		DireccionGPS direccion3 = new DireccionGPS(20.4498, 30.50);
		Parada parada1 = new Parada(direccion1);
		Parada parada3 = new Parada(direccion3);
		Parada[] paradas = new Parada[3];
		paradas[0] = parada1;
		paradas[1] = null;
		paradas[2] = parada3;
		int identificador = 1;

		@SuppressWarnings("unused")
		Linea linea = new Linea(identificador, paradas);
	}

	@Test(expected = IllegalArgumentException.class)
	public void constructorParadasConMenosDe3ElementosTest() {
		DireccionGPS direccion1 = new DireccionGPS(20.45, 30.50);
		DireccionGPS direccion2 = new DireccionGPS(20.4498, 30.50);
		Parada parada1 = new Parada(direccion1);
		Parada parada2 = new Parada(direccion2);
		Parada[] paradas = new Parada[2];
		paradas[0] = parada1;
		paradas[1] = parada2;
		int identificador = 1;

		@SuppressWarnings("unused")
		Linea linea = new Linea(identificador, paradas);
	}

	@Test(expected = IllegalArgumentException.class)
	public void constructorDistanciaParadaInicioYParadaFinMayorQue100Test() {
		DireccionGPS direccion1 = new DireccionGPS(20.45, 30.50);
		DireccionGPS direccion2 = new DireccionGPS(30.5, 20.4);
		DireccionGPS direccion3 = new DireccionGPS(20.4509, 30.50);
		Parada parada1 = new Parada(direccion1);
		Parada parada2 = new Parada(direccion2);
		Parada parada3 = new Parada(direccion3);
		Parada[] paradas = new Parada[3];
		paradas[0] = parada1;
		paradas[1] = parada2;
		paradas[2] = parada3;
		int identificador = 1;

		@SuppressWarnings("unused")
		Linea linea = new Linea(identificador, paradas);
	}

	@Test
	public void getIdCorrectoTest() {
		DireccionGPS direccion1 = new DireccionGPS(20.45, 30.50);
		DireccionGPS direccion2 = new DireccionGPS(30.5, 20.4);
		DireccionGPS direccion3 = new DireccionGPS(20.4498, 30.50);
		Parada parada1 = new Parada(direccion1);
		Parada parada2 = new Parada(direccion2);
		Parada parada3 = new Parada(direccion3);
		Parada[] paradas = new Parada[3];
		paradas[0] = parada1;
		paradas[1] = parada2;
		paradas[2] = parada3;
		int identificador = 1;

		Linea linea = new Linea(identificador, paradas);
		assertEquals(identificador, linea.getId(), errorAdmisible);
	}

	@Test
	public void getParadasCorrectoTest() {
		DireccionGPS direccion1 = new DireccionGPS(20.45, 30.50);
		DireccionGPS direccion2 = new DireccionGPS(30.5, 20.4);
		DireccionGPS direccion3 = new DireccionGPS(20.4498, 30.50);
		Parada parada1 = new Parada(direccion1);
		Parada parada2 = new Parada(direccion2);
		Parada parada3 = new Parada(direccion3);
		Parada[] paradas = new Parada[3];
		paradas[0] = parada1;
		paradas[1] = parada2;
		paradas[2] = parada3;
		int identificador = 1;

		Linea linea = new Linea(identificador, paradas);
		assertArrayEquals(paradas, linea.getParadas());
	}

	@Test
	public void secuenciaTest() {
		fail("Quitar en implementacion");
		DireccionGPS direccion1 = new DireccionGPS(20.45, 30.50);
		DireccionGPS direccion2 = new DireccionGPS(30.5, 20.4);
		DireccionGPS direccion3 = new DireccionGPS(20.4498, 30.50);
		Parada parada1 = new Parada(direccion1);
		Parada parada2 = new Parada(direccion2);
		Parada parada3 = new Parada(direccion3);
		Parada[] paradas = new Parada[3];
		paradas[0] = parada1;
		paradas[1] = parada2;
		paradas[2] = parada3;
		int identificador = 1;

		Linea linea = new Linea(identificador, paradas);
		linea.addParadaIntermedia(parada1, 2);
		linea.removeParada(parada1);
		linea.hasParadaCerca(direccion1);
		linea.hasCorrespondencia(linea);
		linea.getParadasConTrasbordoDirecto(linea);
	}

}
