package es.orange;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void existsAdd() {
		App.add("");
	}

	@Test
	public void sumavacio() {
		assertTrue(App.add("") == 0);
	}

	@Test
	public void sumaUno() {
		assertTrue(App.add("1") == 1);
	}

	@Test
	public void sumaDos() {
		assertTrue(App.add("1,2") == 3);
	}

	@Test
	public void sumaTres() {
		assertTrue(App.add("1,2,3") == 6);
	}
	
	@Test
	public void sumaDosYVacio() {
		assertTrue(App.add("1,2,") == 3);
	}

	@Test(expected = Exception.class)
	public void sumaLetras() {
		App.add("1,2,A");
	}
}
