import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] array = {8.4, -5.0, -6.5, 9.0, 5.0, 3.4, 2.7, 1.2, 8.5, 5.9, 4.0, -8.9,
                8.0, 3.6, 8.0};
        double sum = 0;
        int counter = 0;
        boolean start = false;
        for (double value : array) {
            if (value < 0) {
                start = true;
            } else if (value > 0 && start) {
                System.out.println(value);
                if (value > 0) {
                    sum = sum + value;
                    counter++;
                }
            }

        }
        System.out.println("positive number =" + counter);
        System.out.println("sum = " + sum);
        System.out.println("arithmetic mean positive number = " + sum / counter);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j]) ;
                double temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;

            }

        }
        System.out.println(Arrays.toString(array));
    }

    }
