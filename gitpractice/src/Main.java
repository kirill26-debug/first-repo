public class Main {
    public static void main(String[] args) {
        File name = new File();
        name.print("Kirill");

        Car car1 = new Car("Mersedes", "Kaban", 2000, 2800);
        Car.printCar(car1);

        Car car2 = new Car("Audi", "A7", 2018, 2400);
        Car.printCar(car2);
    }
}