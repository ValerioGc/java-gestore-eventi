package org.generation.italy.eventi;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		try {
			Scanner scn = new Scanner(System.in);
			System.out.println("Inserimento nuovo evento\nInserisci Titolo: ");
			String eName = scn.nextLine();
			System.out.println("\nInserisci Data:(formato anno-mese-giorno)");
			String eDate1 = scn.nextLine();
			System.out.println("\nInserisci Posti disponibili:");
			int eSeats = scn.nextInt();
			scn.close();
			
			LocalDate eDate = LocalDate.parse(eDate1);
			Event ev1 = new Event(eName, eDate, eSeats);
			System.out.println(ev1);
		}
		catch (Exception err) {
			System.out.println("Errore! =" + err);
		}
	}
}
