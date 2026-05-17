public class HomeWork {

    public static int arraySum(byte[] ar) {
        int sum = 0;
        for (byte num : ar) {
            sum = sum + num;
        }
        return sum;
    }


    public static double arraySum(double[] ar) {
        double sum = 0;
        for (double num : ar) {
            sum = sum + num;

        }
        return sum;

    }

    public static double arraySum(float[] ar) {
        double sum = 0;
        for (float num : ar) {
            sum = sum + num;

        }
        return sum;

    }

    public static byte arraySum(boolean[] ar) {
        byte sum = 0;


        for (boolean b : ar) {
            if (b == true) {
                sum++;

            }

        }

        return sum;
    }
}// //////////////////////////////

      public static int maxValue(int[] ar){

    int max = 0;
    for ( int i = 0; i< ar.length; i++){
        if (ar[i] > max)
        max = ar[i];

    }

return max;

      }




public static char maxValue(char[] ar) {

    char max = 0;

    for (char sym: ar) {

        if (sym < max) {
            max = sym;
        }
    }

    return max;
}




public static int evensSum(int[] ar) {

    int sum = 0;

    for (int i = 0; i < ar.length; i++) {

        if (ar[i] % 2 == 0) {
            sum++;
        }
    }

    return sum;
}



public static int minPositiveValue(int[] ar){


}