package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import javax.xml.crypto.Data;

import Services.ContractService;
import Services.OnlinePaymentService;
import Services.PaypalService;
import entities.Contract;
import entities.Installment;

public class Program {

	public static void main(String[] args)  throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter contract data");
		System.out.println("Number: ");
		Integer number = sc.nextInt();
		System.out.println("Data (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());   
		System.out.println("Contract value: ");
		Double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.println("Enter number of Installments: ");
		int N = sc.nextInt();
		
		ContractService cs = new ContractService(new PaypalService());
		
		cs.processContract(contract, N);
		
		System.out.println("Installments:");
		for (Installment it: contract.getInstallments()) {
			System.out.println(it);
			
		sc.close();
	}
	}
}