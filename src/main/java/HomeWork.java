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
}// Не понимаю как в чем ошибка


