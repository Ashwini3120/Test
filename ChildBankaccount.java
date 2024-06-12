package programs;

public class ChildBankaccount extends Bankaccount {

	public static void main(String[] args) {
		ChildBankaccount Bc=new ChildBankaccount();
		Bc.setaccountno(242452);
		Bc.setbalance(50000);
		
		System.out.println("Acc no: "+Bc.getaccountno());
		System.out.println("Balance: "+Bc.getbalance());
	}

}
