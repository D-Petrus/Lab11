public class Bank {
        private Account[] allAccounts = new Account[100];

        private int numberOfAccounts = 0;

        private static Bank instance=new Bank();
        public static Bank getInstance(){
            return instance;
        }
        // żeby to był Singleton - wg przykładu
        private Bank(){}

        public void addAccount(Account account){
            allAccounts[numberOfAccounts++] = account;
        }

        public int getTotalBalance(){
            int totalBalance=0;
            for (Account acc:allAccounts){
                if (acc !=null){
                    totalBalance += acc.getBalance();
                }
            }
            // TODO: pętla po kontach, suma obrotów
            return totalBalance;
        }
        //TODO sprawdzić czy kwota jest >0
        public void payIn(int accountIndex, int amountToPayIn){
            if (accountIndex >=0 && accountIndex <numberOfAccounts){
                allAccounts[accountIndex].setBalance(allAccounts[accountIndex].getBalance()+amountToPayIn);
            }
            // TODO - zapisać w określonym koncie wpłatę
        }
        public void payOut(int accountIndex, int amountToPayOut){
            payIn(accountIndex, -amountToPayOut);
            // TODO - zapisać w określonym koncie wypłatę
        }
        public void transfer(int sourceAccountIndex, int destinationAccountIndex, int amountToTransfer){
            payOut(sourceAccountIndex,amountToTransfer);
            payIn(destinationAccountIndex,amountToTransfer);
            // TODO, jw
        }
    }



