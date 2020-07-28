import java.util.stream.LongStream;

public class DataTypes {

    public static void main(String[] args) {

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println(myMaxIntValue + ", " + myMinIntValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println(myMaxShortValue + ", " + myMinShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println(myMaxLongValue + ", " + myMinLongValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMaxByteValue + ", " + myMinByteValue);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println(myMaxFloatValue + ", " + myMinFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println(myMaxDoubleValue + ", " + myMinDoubleValue);

        int myFirstInt = 5;
        float myFirstFloat = 3;
        int mySecondInt = (byte)(myFirstInt/myFirstFloat);
        System.out.println(mySecondInt);
        String myFirstString = "Hi";
        System.out.println((myFirstInt + myFirstString));

        byte a = 127;
        short b = 12345;
        int c = 1234556789;
        long sum1 = Long.sum((long) a, (long) b);
        long sum2 = LongStream.of((long) a, (long) b, (long) c).sum();
        long d = 50000L + 10L * (a + b + c);

        System.out.println(d + ", " + sum2);

        float fl = 2.45f;
        double dl = 3.21d;
        long i = 24424243232L;

        double pound = 200;
        double kg = pound * 0.45359237;
        System.out.println(kg);

        String myString = "4";
        int myInt = 3;
        System.out.println(myString + Integer.toString(myInt));
        System.out.println(myString + String.valueOf(myInt));

        System.out.println(myString.getClass().getSimpleName());
        if (myInt == (int)myInt) {
            System.out.println("Integer");
        } else {
            System.out.println("Another type");
        }

        System.out.println(Integer.parseInt(myString) + myInt);
        System.out.println(Integer.valueOf(myString) + myInt);


        double doubleVar1 = 20.00;
        double doubleVar2 = 80.00;
        double sum = (doubleVar1 * doubleVar2) * 100.00;
        double rem = sum % 40.00;
        boolean isFour = (rem == 0) ? true: false;
        System.out.println(rem + ", " + isFour);
        if (!isFour) {
            System.out.println("Got some remainder");
        }

    }
}
