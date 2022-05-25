package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	
	private Integer number;
	private Date data;
	private Double totalValue;
	
	List<Installment> installments = new ArrayList<Installment>();
	
	public List<Installment> getInstallments() {
		return installments;
	}

	public Contract() {
		
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double tatalValue) {
		this.totalValue = tatalValue;
	}

	public Contract(Integer number, Date data, Double tatalValue) {
		super();
		this.number = number;
		this.data = data;
		this.totalValue = tatalValue;
	}

}
