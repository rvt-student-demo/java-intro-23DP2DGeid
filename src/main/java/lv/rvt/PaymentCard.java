package lv.rvt;

public class PaymentCard {
    private double balance;
    private double paulsCard;
    private double mattsCard;
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
        this.paulsCard = openingBalance;
        this.mattsCard = openingBalance;

        
    }

    public String toString() {
        return "The card has a balance of "+ balance + " euros";
    }
    public void eatAffordably() {
        if (balance > 2.6) {
            this.balance = balance - 2.6;
            
        }      
    }
    
    public void eatHeartily() {
        if (balance > 4.6) {
            this.balance = balance - 4.6;
        }

    }

    public void addMoney(double money){
        if (money > 0) {
            this.balance += money;
        }

        if (balance >= 150) {
            balance = 150;
        }

    }
}
