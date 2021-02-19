package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logic.DinnerReservation;

//	questa classe testa la creazione di una prenotazione per cena a dun ristorante, e' un caso di optimistic coverage perchè ho coverage del 100% ma ho un bug: 
//	infatti il sistema permette di inserire numeri di cellulare con tutte le cifre uguali, cosa impossibile per un numero di telefono 
public class testDinnerReservation {

//	testo il metodo con un numero di cellulare inesistente
	@Test
	public void testMakeReservation() {
		DinnerReservation d = new DinnerReservation();
		d.setSurname("Agostinelli");
		d.setDinnerTime("20:30");
		d.setDate("19:02:2021");
		d.setMobile("0000000000");
		boolean res = d.makeReservation();
		assertEquals(true, res);
	}
	
//	testo il metodo con un numero più corto
	@Test
	public void testMakeReservation2() {
		DinnerReservation d = new DinnerReservation();
		d.setSurname("Agostinelli");
		d.setDinnerTime("20:30");
		d.setDate("19:02:2021");
		d.setMobile("345678901");
		boolean res = d.makeReservation();
		assertEquals(false, res);
	}
}
