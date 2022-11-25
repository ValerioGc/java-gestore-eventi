package org.generation.italy.eventi;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Concert extends Event {

	private LocalTime hour;
	private BigDecimal price;
	
	public Concert(String title, String date, int seats, String hour, float price) throws Exception {
		super(title,date,seats);
		setHour(hour);
		setPrice(price);
	}
	
// Getter and Setters hour & price
	public LocalTime getHour() {
		return hour;
	}
	public void setHour(String hour) {
		LocalTime ltm = LocalTime.parse(hour);
		this.hour = ltm;
	}

	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(float price) throws Exception {	
		if (price < 0) {
			throw new Exception("Il prezzo del concerto non può essere inferiore a 0");
		}
		BigDecimal dbPrice = new BigDecimal(price);
		this.price = dbPrice;
	}

	
//Formatted date and price
	private String getFormDateTime() {
		DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("d/M/y");
		DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("H:m");
		String formDate = "\nData: " + getDate().format(formatterDate);
		String formTime = "\nOra: " + getHour().format(formatterTime);

		return formDate + formTime;
	}
	
	private String getFormPrice() {
		return price.toString() + '\u20ac'; 
	}
	
	
	
	@Override
	public String toString() {
		return "----------------------------------" 
				+ "\nConcerto:"
				+ getFormDateTime()
				+ getTitle() 
				+ "\nPrezzo: " +  getFormPrice() 
				+ "\n----------------------------------";
	}
}