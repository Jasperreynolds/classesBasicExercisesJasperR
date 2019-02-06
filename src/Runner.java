public class Runner {

    public static void main(String[] args) {
        Car myNewCar = new Car(2017, "Ferrari", 1729, "488");
        System.out.println(myNewCar.toString());
        myNewCar.drive(1000);
        System.out.println(myNewCar.toString());
        Rectangle newRect = new Rectangle(12,12);
        System.out.println(newRect.getArea());
        System.out.println(newRect.getDiagonal());
        System.out.println(newRect.isSquare());
    }
}
