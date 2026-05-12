public class MainArraysTypes {
    public static void main(String[] args) {

        //           0 1 2  3 4
        int[] ari = {9,2,5,-3,7};
        //               0    1     2       3     4
        double[] ard = {8.2, 7.23, 9.12, -23.3, -2.1 };
        //             0    1    2    3
        char[] arc = {'h', 'e', 'l', 'o'};
        //            0    1   2    3    4
        byte[] arb = {3,  127, 5,  -15,  8};
        //                    0     1      2     3
        boolean[] arbool = {true, false, true, false};
        //                   0       1        2
        String[] ars = { "Hello", "course", "QA"};
        float[] arf = {6.2F, 5.7F, 8.4F};

        MethodsArray.printArray(arbool);
        System.out.println(MethodsArray1.arraySum(ars));

    }
}