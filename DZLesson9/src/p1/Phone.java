package p1;

public abstract class Phone<T> implements Callable<T>, Informable {

    private String number;
    private String model;
    private int weight;


    public abstract void info();

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

}
