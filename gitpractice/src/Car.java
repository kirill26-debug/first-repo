public class Car {
    String mark;
    String model;
    int year;
    double weight;

    public Car(String mark, String model, int year, double weight) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.weight = weight;
    }

    public double getWeight() {return weight;}

    public void setWeight(double weight) {this.weight = weight;}

    public int getYear() {return year;}

    public void setYear(int year) {this.year = year;}

    public String getModel() {return model;}

    public void setModel(String model) {this.model = model;}

    public String getMark() {return mark;}

    public void setMark(String mark) {this.mark = mark;}

    protected static void printCar(Car car1) {
        System.out.println("Mark: " + car1.getMark() + "\nModel: " + car1.getModel() +
                "\nYear: " + car1.getYear() + "\nWeight: " + car1.getWeight());
        System.out.println("\n");
    }
}