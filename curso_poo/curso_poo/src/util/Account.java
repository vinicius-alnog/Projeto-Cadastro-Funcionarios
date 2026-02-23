package util;

public class Account {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    //CONSTRUTORES DA CLASSE ACCOUNT
    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }
    //GETTERS E SETTERS (BAGUI CHATO DO CARAI)
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setBalance(double balance) { // SETTER 
        this.balance = balance;
    }
    public double getBalance() { // GETTER 
        return balance;
    }

    public double depositBalance(double balance) { // MÉTODO DE DEPOSITAR DINHEIRO
        return this.balance += balance;
    }

    public double withdrawBalance(double balance) { // MÉTODO DE SACAR DINHEIRO
        return this.balance -= balance;
    }

    public String toString() {
        return "Conta Nº " + accountNumber + ", dono " + accountHolder + ", Saldo: R$ " + String.format("%.2f", balance);
    }

    }

