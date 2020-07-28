public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World...");

        Calculator myCal = new Calculator();
        myCal.setFirstNum(3);
        myCal.setSecondNum(5);

        System.out.println(myCal.getFirstNum());
        System.out.println(myCal.getSecondNum());
        System.out.println(myCal.getAdditionResult());
        System.out.println(myCal.getSubstractionResult());
        System.out.println(myCal.getMultiplicationResult());
        System.out.println(myCal.getDivisionResult());

        System.out.println("-------------------------------");

        BankAccount myAccount = new BankAccount();
        BankAccount myAccount1 = new BankAccount("12323", 3.5, "John", "john@email.com", "392392302");

        System.out.println("-------------------------------");

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
        System.out.println(first.getX());
        System.out.println(first.getY());

        System.out.println("-------------------------------");

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width=" + rectangle.getWidth());
        System.out.println("rectangle.length=" + rectangle.getLength());
        System.out.println("rectangle.area=" + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());


        System.out.println("-------------------------------");

        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getNumberOfPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getNumberOfPagesPrinted());

        System.out.println("-------------------------------");


    }
}


