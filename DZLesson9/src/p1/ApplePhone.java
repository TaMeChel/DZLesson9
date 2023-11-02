package p1;

public class ApplePhone<T> extends Phone<T>{
    public ApplePhone(String number, String model, int weight) {
        super(number, model, weight);
    }

    @Override
    public void receiveCall(T name) {
        System.out.printf("Звонит: %s\n", name);
    }

    @Override
    public void info() {
        System.out.printf("Number: %s\t Model: %s Weight: %d\n", this.getNumber(), this.getModel(), this.getWeight());
    }
}
