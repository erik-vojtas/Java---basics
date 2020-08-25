import java.util.ArrayList;

public class SumQuestion {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,9};
        int sum1 = 8;
        int[] array2 = {1,2,4,4};
        int sum2 = 8;

        sumOfTwoNumsEqaulsTo(array1, sum1);
        sumOfTwoNumsEqaulsTo(array2, sum2);


    }

    public static void sumOfTwoNumsEqaulsTo(int[] array, int sum) {
        ArrayList<Integer> new_list = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if((array[i] + array[j]) == sum) {
                    new_list.add(array[i]);
                    new_list.add(array[j]);
//                    System.out.println(array[i] + ", " + array[j]);
                    break;
                }
            }
        }
        if (new_list.size() == 0) {
            System.out.println("Sum of numbers has not been found.");
        } else {
            for(int i = 0; i < new_list.size(); i++) {
                System.out.println("Num" + i + " = " + new_list.get(i));
            }

        }


    }


}
