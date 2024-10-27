package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private Double amount;
	private LocalDate date;
	
	
	public Installment() {
	}
	
	public Installment(Double amount, LocalDate date) {
		this.amount = amount;
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return date.format(fmt) + "-" + String.format("%.2f, amount");
	}
	
	
		
	
}

