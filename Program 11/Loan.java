class Loan {
    private double amount;
    private double interestRate;

    public Loan(double amount, double interestRate) {
        this.amount = amount;
        this.interestRate = interestRate;
    }

    // toString method to represent Loan object
    @Override
    public String toString() {
        return "Loan [amount=" + amount + ", interestRate=" + interestRate + "]";
    }
}