public class AccountTest {
    
    public static void main(String[] args) {
        
        Account myAccount = new Account("1234", 10000.0);

        myAccount.activate(); // displays "Account is already activated!"
        System.out.println();

        //Suspend the account
		myAccount.suspend(); //displays "Account is suspended!"
        System.out.println();

        //Activate the account
        myAccount.activate(); //displays "Account is activated!"
        System.out.println();
		
		//Deposit to the account
	    myAccount.deposit(1000.0); // update balance and displays account number and current balance. Call the toString() method in deposit().    	                                
        System.out.println();

        //Withdraw to the account
	    myAccount.withdraw(100.0); // update balance and displays account number and current balance. Call the toString() method in withdraw().    	                               
        System.out.println();

		//Close the account()
		myAccount.close();  //displays "Account is closed!"
        System.out.println();

        //Activate the account
		myAccount.activate(); // Displays "You cannot activate a closed account!"
        System.out.println();

		//Suspend the account
		myAccount.suspend(); // Displays " You cannot suspend a closed account!"
        System.out.println();

		//Withdraw to the account
        myAccount.withdraw(500.0); // Show message "You cannot withdraw on a closed account!". Call the toString() to show current balance and account number.
        System.out.println();

		//Deposit to the account
        myAccount.deposit(1000.0); // Show message "You cannot deposit on closed account!". Call the toString() to show current balance and account number.
        System.out.println();
        
    }

}
