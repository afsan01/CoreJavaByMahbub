package OOPConveptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
		
		HSBCBAnk hs = new HSBCBAnk ();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		
		
		
		//dynamic polymorphysm:
		//child class object can be reffered by parent Interface referenc var:
		
		USBank b = new HSBCBAnk();
		b.credit();
		b.debit();
		b.transferMoney();

	}

}
