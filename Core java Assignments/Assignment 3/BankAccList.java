import java.util.HashSet;

import java.util.*;
class SavingsAccount


{
    Double acc_balance;
    int acc_id;
    String accHolderName;
    boolean isSalaryAccount;

    public SavingsAccount(Double acc_balance, int acc_id, String accHolderName, boolean isSalaryAccount) {
        super();
        this.acc_balance = acc_balance;
        this.acc_id = acc_id;
        this.accHolderName = accHolderName;
        this.isSalaryAccount = isSalaryAccount;
    }

    public Double getAcc_balance() {
        return acc_balance;
    }

    public void setAcc_balance(Double acc_balance) {
        this.acc_balance = acc_balance;
    }

    public int getAcc_id() {
        return acc_id;
    }

    public void setAcc_id(int acc_id) {
        this.acc_id = acc_id;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public boolean isSalaryAccount() {
        return isSalaryAccount;
    }

    public void setSalaryAccount(boolean isSalaryAccount) {
        this.isSalaryAccount = isSalaryAccount;
    }

    public void updateBalance(int num,int amt)
    {
        if(num==1)
        {
            acc_balance=acc_balance-amt;
        }
        else
        {
            acc_balance=acc_balance+amt;
        }
    }





    public static void main(String[] args)
    {
        HashSet <SavingsAccount> sa = new HashSet<SavingsAccount>();

        SavingsAccount d1=new SavingsAccount(8000.0, 683267, "AARTI", true);
        SavingsAccount d2=new SavingsAccount(8000.0, 683267, "AARTI", true);
        SavingsAccount d3=new SavingsAccount(9500.0, 684526, "KIRTI", true);
        d3.updateBalance(1,200);
        sa.add(d1);
        sa.add(d2);
        sa.add(d3);
        for(SavingsAccount sal:sa)
        {

            System.out.println("Account Holder Name: " + sal.accHolderName + " Account ID: "+ sal.acc_id + " Account Balance: "+ sal.acc_balance);
        }

    }


}