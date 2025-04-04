public class PopMachine {

    private int numberOfPop;
    private double amountOfMoney;
    private double priceOfPop;
    private double moneyEntered;

    public PopMachine(int numberOfPop, double amountOfMoney, double priceOfPop) {
        this.numberOfPop = numberOfPop;
        this.amountOfMoney = amountOfMoney;
        this.priceOfPop = priceOfPop;
        this.moneyEntered = 0.0;
    }

    public PopMachine(int numberOfPop) {
        this(numberOfPop, 90.0, 1.75);
    }

    public void coinSlot(double money) {
        moneyEntered += money;
    }

    public double popButton() {
        if (numberOfPop >= 1 && moneyEntered >= priceOfPop) {
            numberOfPop--;
            amountOfMoney += priceOfPop;
            double change = moneyEntered - priceOfPop;
            moneyEntered = 0.0;
            return change;
        } else if (numberOfPop == 0) {
            System.out.println("Sold out");
            return moneyEntered;
        } else {
            System.out.println("Insufficient funds!");
            return 0.0;
        }
    }

    public double coinReturn() {
        return moneyEntered;
    }
}