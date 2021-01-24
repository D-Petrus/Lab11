public class TestBank {
    public static void main(String[] args) {

        Bank bank =Bank.getInstance();
        for(int k=0;k<100;k++){
          bank.addAccount(new Account(1000));
        }
        System.out.println("Początkowe saldo w banku = "+bank.getTotalBalance());
//
        Bank.getInstance().transfer(10,15,70);
        Bank.getInstance().transfer(14,55,800);


        System.out.println("Saldo w banku po przelewach = "+bank.getTotalBalance());
    }
}
