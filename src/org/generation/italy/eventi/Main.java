package org.generation.italy.eventi;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
//		try {
//			Scanner scn = new Scanner(System.in);
//			Scanner scnI = new Scanner(System.in);
//			
//		// Inserimento nuovo evento
//			System.out.println("Inserimento nuovo evento\nInserisci Titolo: ");
//			String eName = scn.nextLine();
//			
//			System.out.println("\nInserisci Data:(formato anno-mese-giorno)");
//			String eDate = scn.nextLine();
//			
//			System.out.println("\nInserisci Posti disponibili:");
//			int eSeats = scnI.nextInt();
//			
//			Event ev0 = new Event(eName, eDate, eSeats);
//			System.out.println(ev0);
//			
//			
//		// Gestione Prenotazioni
//			System.out.println("\n---------------------------\n" 
//								+ "Vuoi effettuare una prenotazione? (y/n)");
//			String eBookNg = scn.nextLine();
//			
//			boolean exit = (eBookNg.toLowerCase().contains("y"))? true:false;
//			if (exit) {
//				System.out.println("Quanti posti vuoi prenotare?");
//				int res = scnI.nextInt();
//				ev0.booking(res);
//				System.out.println("\n" + ev0.getTotalSeats());
//			}
//			
//			System.out.println("\n---------------------------\n" 
//					+ "Vuoi disdire una prenotazione? (y/n)");
//			eBookNg = scn.nextLine();
//			exit = (eBookNg.toLowerCase().contains("y"))? true:false;
//			
//			if (exit) {				
//				System.out.println("Quanti posti vuoi disdire?");
//				int unRes = scnI.nextInt();
//				ev0.unBooking(unRes);
//				System.out.println("\n" + ev0.getTotalSeats());
//			}			
//			ProgramEvents pEc = new ProgramEvents("Eventi");
//			pEc.addEvent(ev0);
//		}
//		catch (Exception e) {
//			System.err.println(e.getMessage());
//		}
//		
////      Creazione nuovo concerto
//		try {
//			Scanner scn = new Scanner(System.in);
//			Scanner scnI = new Scanner(System.in);
//			System.out.println("\n--------------------------------------------\n");
//			System.out.println("------Inserimento nuovo concerto------");
//	
//			System.out.println("Inserisci il nome del concerto: ");			
//			String cName = scn.nextLine();
//			
//			System.out.println("Inserisci la data del concerto: (yyyy-mm-dd)");
//			String cDate = scn.nextLine();
//			
//			System.out.println("Inserisci posti concerto: ");
//			int cSeats = scnI.nextInt();
//			
//			System.out.println("Inserisci l'orario del concerto: (ora:minuti)");
//			String cHour = scn.nextLine();
//			
//			System.out.println("Inserisci il prezzo del concerto: ");
//			float cPrice = scnI.nextInt();
//			
//			Concert cn1 = new Concert(cName, cDate,  cSeats, cHour, cPrice);
//		
//			System.out.println(cn1);
//			ProgramEvents pEc = new ProgramEvents("Eventi");
//			pEc.addEvent(cn1);
//			
//			scn.close();
//			scnI.close();
//		}
//		catch (Exception err) {
//			System.out.println("Errore:\n" + err.getMessage());
//		}

		
// 		Aggiunta eventi e gestione Liste
		try {
			Event ev1 = new Event("ev1", "2023-04-10", 80 );
			Event ev01 = new Event("ev1", "2023-04-10", 80 );
			Event ev2 = new Event("ev2", "2022-12-22", 120 );
			Event ev3 = new Event("ev3", "2024-08-15", 30 );
			
			Concert cnA1 = new Concert("ev4", "2022-12-22", 500,"20:20", 130);
			Concert cnA2 = new Concert("ev4", "2023-04-18", 500,"20:20", 25);
			Concert cnA3 = new Concert("ev4", "2022-12-22", 500,"20:20", 150);
			
			ProgramEvents prEv = new ProgramEvents("Eventi e Concerti");

			// Controllo eventi unici 			
//			ProgramsUniqueEvents prEvU = new ProgramsUniqueEvents("Confronto Eventi unici");
//			System.out.println(ev01.checkUnique(ev2, ev1));
			
			

			prEv.addEvent(ev1);
			prEv.addEvent(ev2);
			prEv.addEvent(ev3);
			prEv.addEvent(cnA1);
			prEv.addEvent(cnA2);
			prEv.addEvent(cnA3);
			
			System.out.println("Numero eventi presenti nel programma: " + prEv.getEventsNumbers() + " eventi");
			System.out.println("\n---------------------------------------------------------\n");
			System.out.println("Eventi del 22/12:\n" + prEv.getEventsDate("2022-12-22"));
			System.out.println("\n---------------------------------------------------------\n");
			System.out.println(prEv.getEvents());
			System.out.println("\n---------------------------------------------------------\n");
			System.out.println(prEv.getOrderedEvents());
		} 
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}