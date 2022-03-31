package task.day_3;

import java.util.Arrays;

public class MainArray {

    public static void main(String[] args) {
        //1
        double[] array1 = {5, 9, 3, 2, 0, -4, -8.3, 3, -4};
        double max=array1[0];

        for (double e:array1) {
            if(e>max){
                max=e;
            }
        }
        System.out.println("Task1");
        System.out.println("max="+max);

        //2
        int[] array2 = {1, 6, 3, 3, 4, 5, 5, 6, 0};
        int[] result2 = new int[array2.length];
        int i = 0;
        for (int e:array2){
            if(contains(array2, e)){
                result2[i++] = e;
            }
        }
        System.out.println("Task2");
        Arrays.sort(result2);
        Arrays.stream(result2).forEach(System.out::println);

        //3
        String[] array3 = {"12", "23", "34", "12", "56", "67"};

        for (int i3=0; i3<array3.length; i3++){
            if(array3[i3].equals("12")){
                array3[i3]="replaced";
            }
        }
        System.out.println("Task3");
        Arrays.stream(array3).forEach(System.out::println);

        //4
        String[] array4 = {"12", "23", "34", "12", "56", "67"};
        String[] res4 = new String[array4.length];

        for(int i4=0; i4<array4.length; i4++){
            res4[(res4.length-i4)-1]=array4[i];
        }
        System.out.println("Task4");
        Arrays.stream(res4).forEach(System.out::println);

    }

    private static boolean contains(int[] array, int test_element) {
        for(int e:array){
            if (test_element == e){
                return true;
            }
        }
        return false;
    }


}
