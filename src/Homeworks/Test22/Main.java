package Homeworks.Test22;

public class Main {
    public static void main(String[] args) {
        AccountType accountType = new AccountType();
        accountType.addingAccountType();
        accountType.printAccountTypes();
        Client userType = accountType.accountSelectedType();

        AccountAction accountAction = new AccountAction();
        accountAction.printAccountAction();
        accountAction.selectAction(userType);

    }

}
