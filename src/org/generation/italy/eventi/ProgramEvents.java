package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProgramEvents {
	
	private String title;
	private List <Event> events;
	

	public ProgramEvents(String title) {
		setTitle(title);
		this.events = new ArrayList<>();
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
		LocalDate dtL = LocalDate.parse(date);
		
		for (Event event: events) {
			if (event.getDate().equals(dtL)) {
				arrL.add(event);				
			}
		}
		return arrL.toString();
	}	
	
// Stampa programma ordinato per data 
	public String getOrderedEvents() {
		String eventsOrd = getTitle();
		events.sort((event1, event2) -> event1.getDate().compareTo(event2.getDate()));
		
		for (Event event: events) {
			eventsOrd += "\n" + event.getTitle() + " - " + "Data: " + event.getDate() + "\n";		
		}
		return eventsOrd;
	}	
}