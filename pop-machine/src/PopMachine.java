public class PopMachine {

    private int numberOfPop;
    private double amountOfMoney;
    private double priceOfPop;
    private double reserve;

    public PopMachine(int numberOfPop, double amountOfMoney, double priceOfPop) {
        this.numberOfPop = numberOfPop;
        this.amountOfMoney = amountOfMoney;
        this.priceOfPop = priceOfPop;
        this.reserve = 0.0;
    }

    public PopMachine(int numberOfPop) {
        this(numberOfPop, 90.0, 1.75);
    }

    public void coinSlot(double money) {
        reserve += money;
    }

    public double popButton() {
        double temp = reserve;

        if (numberOfPop == 0) {
            System.out.println("Sold out!");
            return temp;
        } else if (reserve < priceOfPop) {
            System.out.println("Insufficient funds!");
            return temp;
        } else {
            System.out.println("Pop dispensed!");
            numberOfPop--;
            reserve = 0.0;
            return temp - priceOfPop;
        }
    }

    public double coinReturn() {
        return reserve;
    }

    public int getNumberOfPop() {
        return numberOfPop;
    }

    public double getPriceOfPop() {
        return priceOfPop;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setNumberOfPop(int numberOfPop) {
        this.numberOfPop = numberOfPop;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public void setPriceOfPop(double priceOfPop) {
        this.priceOfPop = priceOfPop;
    }
}