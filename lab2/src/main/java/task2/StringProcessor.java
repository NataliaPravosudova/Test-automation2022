package task2;

public class StringProcessor {

    public static void main(String[] args) {
        //2
        String s = "Task 2. Given a string, find the number of words in it.";
        System.out.println(s.split(" ").length);

        //3
        for (String w:s.split(" ")) {
            System.out.println(w+"\t"+w.length());
        }

        //4
        System.out.println(StringWorldCalc(s, 4));

    }

    private static int StringWorldCalc(String s, int i) {
        return s.split(" ")[i].length();
    }

}
