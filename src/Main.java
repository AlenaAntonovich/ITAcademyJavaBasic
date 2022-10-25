public class Main {
    public static void main(String[] args) {

        try {
            method1();
        } catch (NullPointerException e) {
            System.out.println("NPE: " + e);
        } finally {
            System.out.println("Final");
        }
    }

    public static void method1() {
        Object obj = null;
        obj.hashCode();
    }
}

class Main {
    public static void main(String args[]) {
        int num1, num2;
        try {
            num1 = 0;
            num2 = 62 / num1;
            System.out.println(num2);
            System.out.println("Hey I'm at the end of try block");
        }
        catch(ArithmeticException e) {
            System.out.println("You should not divide a number by zero");
        }
        catch(Exception e) {
            System.out.println("Exception occurred");
        }finally {
            System.out.println("Final.");
        }
    }
}

package ua.com.prologistic;

        import java.io.FileNotFoundException;
        import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            testException(-5);
            testException(-10);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Необязательный блок, но раз уже написан, то выполнятся будет не зависимо от того было исключение или нет");
        }
        testException(15);
    }

    public static void testException(int i) throws FileNotFoundException, IOException {
        if (i < 0) {
            FileNotFoundException myException = new FileNotFoundException("число меньше 0: " + i);
            throw myException;
        } else if (i > 10) {
            throw new IOException("Число должно быть в пределах от 0 до 10");
        }

    }

}

