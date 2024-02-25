public class ActiveState implements AccountState {

    @Override
    public void deposit(Double depositAmount, Account account) {

        Double amount = account.getBalance() + depositAmount;
        account.setBalance(amount);
        System.out.println(account.toString());

    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {

        Double amount = account.getBalance() - withdrawAmount;
        account.setBalance(amount);
        System.out.println(account.toString());

    }

    @Override
    public void suspend(Account account) {

        account.setAccountState(new SuspendedState());
        System.out.println("Account is suspended!");

    }

    @Override
    public void activate(Account account) {

        System.out.println("Account is already activated!");

    }

    @Override
    public void close(Account account) {

        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!");

    }

}