import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File originalFile = new File("\\study");
        File folder = originalFile.getParentFile();
        for (File file : folder.listFiles())
        {
            System.out.println(file.getName());
        }
    }
}
import java.util.Scanner;
        import java.util.NoSuchElementException;
        import java.io.File;
        import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("hello.txt" ));
            scanner.useDelimiter("\\Z");
            String text = scanner.next();
            scanner.close();

            System.out.println("Текст:\n" + text);
            System.out.println("Слов: " + String.valueOf(text.split("[ \t\n]+").length));
            System.out.println("Знаков пунктуации: " + String.valueOf(text.replaceAll("\\P{Punct}", "").length()));
        }
        catch ( FileNotFoundException fnfe ) {
            System.err.println("Can't find input file!");
        }
        catch ( NoSuchElementException nsee ) {
            System.err.println("Can't read from input file!");
        }
    }

}

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/file.txt");
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(file)))) {
            String[] words = br.readLine().split(" ");
            for (String number : words) {
                if (Integer.parseInt(number) ) {
                    sb.append(0 + " ");
                } else {
                    sb.append(number).append(" ");
                }
            }
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(sb.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





import java.io.*;
        import java.util.Random;

public class Main {

    public static void main(String[] args) {

        WriteFile();
        ReadFile();
    }

    private static void WriteFile() {
        DataOutputStream output = null;
        try {
            output = new DataOutputStream(new FileOutputStream("src/file.txt"));
            Random rn = new Random();
            for (int i = 0; i <= 20; i++) {
                output.writeInt(rn.nextInt(20));
            }
            output.flush();
            output.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                output.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void ReadFile() {
        DataInputStream input = null;
        try {
            input = new DataInputStream(new FileInputStream("src/file.txt"));
            int cont = 0;
            int number = input.readInt();
            while (true) {
                System.out.println("cont =" + cont + " number =" + number);
                if (input.available() == 4) {
                    break;
                }
                number = input.readInt();
                cont++;
            }
            input.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                input.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public class ReadBinary {
        public static void main(String[] args) throws ClassNotFoundException, IOException {
            DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream("myData.dat")));
            long total = 0;
            int count = 0;
            System.out.println("generator 20 numbers are ");
            while (input.available() > 0) {
                total += input.readInt();
                count++;
                System.out.println(input.readInt());

            }
            System.out.println("The sum is " + total);
            System.out.println("The average is " + total / count);

            input.close();

        }
    }
}
import java.util.Random;

public class Main {
    public static void main(String[] args) {

    }

    public class Person {
        private final String Name;
        private final String Surname;
        private final int age;

        Person( String Name, String Surname, int age) {
            this.Name = Name;
            this.Surname = Surname;
            this.age = age;
        }
        Name[] names = {"Anton","Vasya","Petya","Katya","Masha"};
        Surname[] surnames = {"Ivanov", "Petrov","Sidorov","Popkov","Subbotin"};


        @Override
        public String toString() {
            return "Person{" + ", Name='" + Name + '\'' +
                    ", Surname='" + Surname + '\'' +
                    ", age ='" + age + '\'' +
                    '}';
        }
    }
}

