package org.generation.italy.eventi;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner scn = new Scanner(System.in);
			Scanner scnI = new Scanner(System.in);
		
			
		// Inserimento nuovo evento
			System.out.println("Inserimento nuovo evento\nInserisci Titolo: ");
			String eName = scn.nextLine();
			
			System.out.println("\nInserisci Data:(formato anno-mese-giorno)");
			String eDate = scn.nextLine();
			
			System.out.println("\nInserisci Posti disponibili:");
			int eSeats = scnI.nextInt();
			
			Event ev1 = new Event(eName, eDate, eSeats);
			System.out.println(ev1);
			
			ProgramEvents programEvents = new ProgramEvents("lista eventi");
			programEvents.addEvent(ev1);
			
		
			
		// Gestione Prenotazioni
			System.out.println("\n---------------------------\n" 
								+ "Vuoi effettuare una prenotazione? (y/n)");
			String eBookNg = scn.nextLine();
			
			boolean exit = (eBookNg.toLowerCase().contains("y"))? true:false;
			if (exit) {
				System.out.println("Quanti posti vuoi prenotare?");
				int res = scnI.nextInt();
				ev1.booking(res);
				System.out.println("\n" + ev1.getTotalSeats());
			}
			
			System.out.println("\n---------------------------\n" 
					+ "Vuoi disdire una prenotazione? (y/n)");
			eBookNg = scn.nextLine();
			exit = (eBookNg.toLowerCase().contains("y"))? true:false;
			
			if (exit) {				
				System.out.println("Quanti posti vuoi disdire?");
				int unRes = scnI.nextInt();
				ev1.unBooking(unRes);
				System.out.println("\n" + ev1.getTotalSeats());
			}			


			
		// Creazione nuovo concerto
			System.out.println("\n--------------------------------------------\n");
			System.out.println("------Inserimento nuovo concerto------");
	
			System.out.println("Inserisci il nome del concerto: ");			
			String cName = scn.nextLine();
			
			System.out.println("Inserisci la data del concerto: (yyyy-mm-dd)");
			String cDate = scn.nextLine();
			
			System.out.println("Inserisci posti concerto: ");
			int cSeats = scnI.nextInt();
			
			System.out.println("Inserisci l'orario del concerto: (ora:minuti)");
			String cHour = scn.nextLine();
			
			System.out.println("Inserisci il prezzo del concerto: ");
			float cPrice = scnI.nextInt();
			
			Concert cn1 = new Concert(cName, cDate,  cSeats, cHour, cPrice);
		
			System.out.println(cn1);
			scn.close();
			scnI.close();
		}
		catch (Exception err) {
			System.out.println("Errore:\n" + err);
		}
	}
}