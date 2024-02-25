public class ClosedState implements AccountState {

    @Override
    public void deposit(Double depositAmount, Account account) {

        System.out.println("You cannot deposit on a closed account!");
        System.out.println(account.toString());

    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {

        System.out.println("You cannot withdraw on a closed account!");
        System.out.println(account.toString());

    }

    @Override
    public void suspend(Account account) {

        System.out.println("You cannot suspend a closed account!");

    }

    @Override
    public void activate(Account account) {

        System.out.println("You cannot activate a closed account!");

    }

    @Override
    public void close(Account account) {

        System.out.println("Your account is already closed!");

    }

}