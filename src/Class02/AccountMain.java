package Class02;

public class AccountMain {
    public static void main(String[] args) {
        Account a1 = new Account(20140923);
        Account a2 = new Account(20210911);
        Account a3 = new Account(20220210);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        a1.withdraw(45.98);
        a2.deposit(550);
        System.out.println(a1);
        System.out.println(a2);

    }
}
