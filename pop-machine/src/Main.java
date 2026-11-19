public class Main {

    public static void main(String[] args) {
        PopMachine pop = new PopMachine(100, 10.0, 1.5);

        pop.coinSlot(1.0);
        pop.coinSlot(2.5);
        pop.popButton();

        System.out.println(pop.getNumberOfPop());
    }
}