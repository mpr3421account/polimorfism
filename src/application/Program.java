package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account x = new Account(1001, "maria", 1000.0);//classe abstract não pode ser instanciada
        Account y = new SavingsAccount(1002, "joao", 1000.0, 0.01);
        Account z = new BusinessAccount(1003, "bob", 1000.0, 500.0);

        x.withdraw(50.0);
        y.withdraw(50.0);
        z.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
        System.out.println(z.getBalance());

    }
}