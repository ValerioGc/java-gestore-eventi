package org.generation.italy.eventi;

import java.util.ArrayList;
import java.util.List;
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
	
//	restituisce l'evento con il numero massimo di posti totali
	public int getMaxPostiTotaliEvento() {
		return events.size();
	}
//	restituisce l'evento con il numero minimo di posti totali
	public int getMinPostiTotaliEvento() {
		return events.size();
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
