public class MethodsArray1 {

    public static String arraySum(char[] ar) {
        String res = "";
        for (char c : ar) {
            res = res + c;



        }
        return res;
    }

    public static String arraySum(String[] ar){
        String res = ""; //empty string (пустой стринг не null)
        for (String s:ar){
            res = res + s + " ";
        }
            res += ".";
            return res;

            /*
             ar =>  ["Hello"] ["course"] ["QA"]
             */
        }
    }





/*
int sum = 26
      0   1   2   3   4   5    6
ar-> [9] [6] [2] [1] [7] [4] [-3]   ar.lenght = 7

 */

/*HW
1
public static int arraySum(byte[] ar
ar -> 3, 127,5...
return sum of element
2
public static double arraySum(double[]ar)
return sum of element
3
public static double arraySum(float[]ar
return sum element
4
static byte arraySum boolean
true false
  1    2
return sum of 1. when true
 */