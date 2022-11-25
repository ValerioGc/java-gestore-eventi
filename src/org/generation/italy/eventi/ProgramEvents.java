package org.generation.italy.eventi;

import java.util.ArrayList;
import java.util.List;

public class ProgramEvents {
	
	private String title;
	private List events;
	

	public ProgramEvents(String title) {
		setTitle(title);
		List <Event> events = new ArrayList<>();
	}
	
//	Getter & Setters titolo
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}


// 	Aggiungi evento
	public void addEvent(Event event) {
		events.add(event);
	}

// Cancella evento
	public void deleteEvents() {
		events.clear();
	}
	
// Stampa quantità eventi
	public int getEventsNumbers() {
		return events.size();
	}
	
//	Stampa eventi
	public String getEvents() {
		return events.toString();
	}	
	
//	Stampa eventi in data specifica
	public String getEventsDate(String date) {
		List <Event> arrL = new ArrayList<>();
//		
//		for (Object event: events) {
//			if (event.getDate() == date) {
//				arrL.add(event);				
//			}
//		}
		return arrL.toString();
	}	
	
// Stampa programma ordinato per data 
//	public String getOrderedEvents() {
//		List <Event> eventsOrd = new ArrayList<>();
//		
//		return getTitle() + eventsOrd.toString();
//	}	
}