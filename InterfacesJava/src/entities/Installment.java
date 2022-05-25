package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date duDate;
	private Double amount;
	
	public Installment() {
		
	}

	public Date getDuDate() {
		return duDate;
	}

	public void setDuDate(Date duDate) {
		this.duDate = duDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Installment(Date duDate, Double amount) {
		super();
		this.duDate = duDate;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return sdf.format(duDate)+ "-" + String.format("%.2f", amount);
		
	}

}
