package org.generation.italy.eventi;

import java.util.Set;

public class ProgramsUniqueEvents {

	private String title;
	private Set <Event> events;
	
	public ProgramsUniqueEvents(String title) {
		setTitle(title);
	}

//  Getter and Setters 
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Set <Event> getEvents() {
		return events;
	}
	
//	Methods milestone 4
	

	public Event getMaxPostiTotaliEvento() {
		int maxS = Integer.MIN_VALUE;
		int currS;
		Event eventMaxS = null;
		for (Event event: events) {
			if (event.getSeats() > maxS) {
				maxS = event.getSeats();
				eventMaxS = event;
			}
		}
		return eventMaxS;
	}
	
	public Event getMinPostiTotaliEvento() {
		int minS = Integer.MIN_VALUE;
		int currS;
		Event eventMinS = null;
		for (Event event: events) {
			if (event.getSeats() < minS) {
				minS = event.getSeats();
				eventMinS = event;
			}
		}
		return eventMinS;
	}
	
//	 stampa tutti gli eventi in ordine di lunghezza del titolo 
//	 (titolo piu' lungo prima
	public Set <Event> orderedPrint() {
		return events;
	}
	
//	restituisce il primo evento in ordine temporale 
//	(senza ordinare la lista; usare i comparatori)
	public void getFirstEvent() {
		
	}
	
//	restituisce l'ultimo evento in ordine temporale 
//	(senza ordinare la lista; usare i comparatori)
	public void getLastEvent() {
		
	}

}
