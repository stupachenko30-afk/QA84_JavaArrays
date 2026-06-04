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

      /*    public static int maxValue(int[] ar){

              int max = ar[0];
              for (int num; ar)
              }
              if (max > num)
              max = num;
       */
          /*
int[] ar = {-9,2,6,4,8,9,3};
int res = MethodsHomeWork2.maxValue(ar);
System.out.println("max = "+ res);
           */

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
/*
public static char maxValue(char[] ar) {

    char max = ar[0];
    for (char sym: ar)
    if (sym < max)
    max = sym;

 */
/*
char[] arc = {'j', 'n', 'b'}
System.out.println("max = "MethodsHomeWork2.maxValue(arc));
 */



public static int evensSum(int[] ar) {

    int sum = 0;

    for (int i = 0; i < ar.length; i++) { //for (int num: ar)

        if (ar[i] % 2 == 0) { // (num %2 ==0)
            sum++;  //sum +=num;
        }
    }

    return sum;
}
/* int res = MethodsHomeWork.evensSum(ar);
sout ("Evens sum = " + res);
 */


public static int minPositiveValue(int[] ar){

int min = -1; // min=0;
for (int num: ar){
    if (num >0){
        if (min ==-1 || num < min)  // || - пайт (или)
            min = num;
    }
}
return  min;
}
/*
ar -> [-9][2][5][-4][1][-8]
       num
       min =1
 */