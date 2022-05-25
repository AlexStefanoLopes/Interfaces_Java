package Services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
		for(int i=1; i<= months; i++) {
			double updateQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			//basicQuota = 202
			double fullQuota = updateQuota + onlinePaymentService.paymentFee(updateQuota);
			//fullQuota = 206.04
			Date dueDate = addMonths(contract.getData(), i);
			contract.getInstallments().add(new Installment(dueDate, fullQuota)); 
		}
	}//08/12/1990
	
	private Date addMonths(Date date, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);  
		calendar.add(Calendar.MONTH, N);
		return calendar.getTime();
	}
	
}
