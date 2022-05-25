package Services;

public interface OnlinePaymentService {

	double paymentFee(double amount);
	double interest(double amoute, int months);
	
}
