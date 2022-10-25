
public class HomeWork3 {
    public static void main(String[] args) {
        int i = 1;
        int x = 10;
        int factorial = 1;
        while (i <= x) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("factorial = " + factorial);
    }
}


public static void number {
        int sum = 1;
        int number = 1;
        do {
        sum = sum * number;
        number++;
        } while (number <= 25);
        System.out.println("sum = " + sum);
        }


public static void sum {
        long sum = 0;
        long number = 7893823445L;
        do {
        sum = sum + (number % 10);
        } while ((number /= 10) != 0);
        System.out.println("sum = " + sum);
        }


public static void isPrime {
        for (int n = 50; n <= 70; n++) {
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
        if ((n % i) == 0) {
        isPrime = false;
        }
        }
        if (isPrime) System.out.println(n + " Prostoe");
        else System.out.print("");
        }
        }


public static void Hope{
        int i = 0;
        for (i = 1; i <= 100; i++) {
        if (i % 7 == 0) {
        System.out.println("Hope!");
        }
        }
        }



public static void longlong {
        long x = 20023143;
        System.out.println(String.valueOf(x).replaceAll("(?=(\\d{3})+$)", " "));
        }



        import java.util.Arrays;
        import java.util.Random;


    public static void Array {
        Random random = new Random();
        int[] Array = new int[10];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(Array));
        int indexlast = 0;
        for (int i = 0; i < Array.length; i++) {
            int a = Array[Array.length - 1];
        }
        System.out.println("Последний элемент массива = " + Array[Array.length - 1]);
    }



    public static void length {
        int[] a = {1, 2, 2, 2, 3, 3, 3, 3, 6, 7};
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                System.out.print("индекс " + i + " = " + a[i] + ", ");
            }
        }
    }


import java.util.Arrays;
        import java.util.Random;

    public static void List {
        Random random = new Random();
        int[] List = new int[10];
        for (int i = 0; i < List.length; i++) {
            List[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(List));
        int max = 0;
        for (int i = 0; i < List.length; i++) {
            if (List[i] > max) {
                max = List[i];
            }
        }
        System.out.println("Максимальное значение =  " + max);
    }


import java.util.Arrays;
        import java.util.Random;

   public static void index {
        Random random = new Random();
        int[] m = new int[10];
        for (int i = 0; i < m.length; i++) {
            m[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(m));
        int minM = m[0];
        int maxM = m[0];
        int indexMin = 0;
        int indexMax = 0;
        int sum = 0;
        for (int i = 0; i < m.length; i++)
        {
            if (m[i] < minM)
            {
                minM = m[i];
                indexMin = i;
            }
            if (m[i] > maxM)
            {
                maxM = m[i];
                indexMax = i;
            }
        }
        for (int i = indexMin; i <= indexMax; i++)
        {
            sum = sum + m[i];
        }
        System.out.println(sum);
    }


import java.util.Arrays;
        import java.util.Random;


    public static void rulength {
        Random random = new Random();
        int[] ru = new int[10];
        int n ;
        for (int i = 0; i < ru.length; i++) {
            ru[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(ru));
        for (n = ru.length - 1; n >= 0; n--) {
            System.out.print(ru[n] + " ");

        }
    }

    public static void butterfly {
        int[] a = new int[4];
        int k, i, j, n = 5;
        k = n / 2 + 1;
        for (i = 0; i < k; i++) {
            for (j = 0; j < n; j++) {
                if ((j < i) && (j >= (n - i))) ;
                a[i][j] = 0;
            }else{
                a[i][j] = 1;
                for (i = n - 1; i >= k; i--) {
                    for (j = 0; i < n; j++) {
                        if ((j < (n - i)) && (j > i)) ;
                        a[i][j] = 0;
                    } else {
                        a[i][j] = 1;
                    }
                    System.out.println(a[i][j]);
                }
            }
        }
    }
        }












