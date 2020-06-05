package OOPConveptPart2;

public class HSBCBAnk implements USBank, BrazilBank { //we are achieving multiple inheritence
	//Is-a relatioship

	//if a class is implementing any Interface, then its mandatory to define/override all the methods of Interface
	
	//overriding from USBank
	public void credit() {
		System.out.println("hsbc--credit");
	}
	public void debit() {
		System.out.println("hsbc---debit");
	}
	public void transferMoney() {
		System.out.println("hsbc---transferMoney");
	}
	//separate method of HSBCBAnk
	public void educationLoan() {
		System.out.println("hsbc---educationLoan");
	}
	public void carLoan() {
		System.out.println("hsbc===carLoan");
		
	}
	//brazilBank method:
	public void mutualFund() {
		System.out.println("Brazil bank mutual fund");
	}
		
}
