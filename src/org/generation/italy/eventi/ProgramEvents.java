package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProgramEvents {
	
	private String title;
	private List <Event> events;
	

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
		LocalDate dtL = LocalDate.parse(date);
		
		for (Event event: events) {
			if (event.getDate() == dtL) {
				arrL.add(event);				
			}
		}
		return arrL.toString();
	}	
	
// Stampa programma ordinato per data 
	public void getOrderedEvents() {
		List <Event> eventsOrd = new ArrayList<>();
		
		eventsOrd  = events.sort(null);
		
		for (Event event: events) {
			System.out.println(event.getDate() + " " + event.getTitle());		
		}
	}	
}