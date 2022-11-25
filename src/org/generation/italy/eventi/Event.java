/**
 * 
 */
package org.generation.italy.eventi;

import java.time.LocalDate;

public class Event  {
	
	private String title;
	
	LocalDate today = LocalDate.now();
	private LocalDate date;
	
	private int seats;
	private int reservedSeats = 0;

	
	public Event(String title, LocalDate date, int seats) throws Exception {
		setTitle(title);
		setDate(date);
		setSeats(seats);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) throws Exception{
		
		if (!date.isAfter(today)) {
			throw new Exception("La data inserita è gia passata");
		}
		this.date = date;
	}
	
// Posti a sedere
	public int setSeats(int seats) throws Exception{
		if (seats <= 0) {
			throw new Exception("Il numero di posti deve essere superiore a 0");
		}
		return this.seats = seats;
	}
	public int getSeats() {
		return seats;
	}
	
	public int getReservedSeats() {
		return reservedSeats;
	}


// Methods prenotazioni
	public void booking(LocalDate date) throws Exception {
		if (!date.isAfter(today)) {
			throw new Exception("L'evento è gia passato");
		} else if (checkAvaibleSeats()) {	
			throw new Exception("Nessun posto disponibile");
		}
		reservedSeats++;
	}
	
	public void unBooking(LocalDate date) throws Exception {
		if (!date.isAfter(today)) {
			throw new Exception("L'evento è gia passato");
		} else if (reservedSeats == 0) {
			throw new Exception("Nessuna prenotazione per l'evento");
		}
		reservedSeats--;
	}
	
	public boolean checkAvaibleSeats() {
		return ((seats - reservedSeats) > 0);
	}
	
	
	@Override
	public String toString() {
		return "Data: " + getDate() + " | Titolo: " + getTitle();
	}
}
