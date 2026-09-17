package org.example.java.N9.modelagem_objetos_responsabilidade.ex05;

public class Account {
    private String accountNumber;
    private double balance;
    private boolean isBlocked;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.isBlocked = false;
        this.balance = balance;
    }


    public boolean deposit(double amount){
        if(!this.isBlocked && amount > 0){
            balance = (balance + amount);
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount){
        if(!this.isBlocked && amount > 0 && balance >= amount){
            balance = (balance - amount);
            return true;
        }
        return false;
    }
    public boolean transferTo(Account target, double amount){
        if(!this.isBlocked && !target.isBlocked){
            if(withdraw(amount)){
                if(target.deposit(amount)){
                    return true;
                }
            }
        }
        return false;
    }

    public void block(){
        this.isBlocked = true;
    }

    public void unblock(){
        this.isBlocked = false;
    }

    public double getBalance() {
        return balance;
    }
}

