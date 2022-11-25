package org.generation.italy.eventi;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner scn = new Scanner(System.in);
			Scanner scnI = new Scanner(System.in);
			System.out.println("Inserimento nuovo evento\nInserisci Titolo: ");
			String eName = scn.nextLine();
			System.out.println("\nInserisci Data:(formato anno-mese-giorno)");
			String eDate1 = scn.nextLine();
			LocalDate eDate = LocalDate.parse(eDate1);
			System.out.println("\nInserisci Posti disponibili:");
			int eSeats = scnI.nextInt();
			
			Event ev1 = new Event(eName, eDate, eSeats);
			System.out.println(ev1);
			
			
			System.out.println("\n---------------------------\n" 
								+ "Vuoi effettuare una prenotazione? (y/n)");
			String eBookNg = scn.nextLine();
			boolean exit = (eBookNg.toLowerCase().contains("y"))? true:false;
			if (exit) {
				System.out.println("Quanti posti vuoi prenotare?");
				int res = scnI.nextInt();
				ev1.booking(res);
			}
			
			System.out.println("\n---------------------------\n" 
					+ "Vuoi disdire una prenotazione? (y/n)");
			eBookNg = scn.nextLine();
			exit = (eBookNg.toLowerCase().contains("y"))? true:false;
			if (exit) {				
				System.out.println("Quanti posti vuoi disdire?");
				int unRes = scnI.nextInt();
				ev1.unBooking(unRes);
			}			
			scn.close();
			scnI.close();
			
			System.out.println("\n" + ev1.getTotalSeats());				
		}
		catch (Exception err) {
			System.out.println("Errore:\n" + err);
		}
	}
}
