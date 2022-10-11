import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        List<Integer> schoolGrades = new ArrayList<>();
        Random randomNumber = new Random();
        for (int i = 0; i < 10; i++) {
            schoolGrades.add(randomNumber.nextInt(11));
        }
        System.out.println(schoolGrades);
        schoolGrades.removeIf(mark ->{
            return mark < 4;
        });
        System.out.println(schoolGrades);
    }
}


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Integer[] m = {1, 2, 2, 3, 4, 5, 5 ,6,6,7,7,7,7,7};
        Set<Integer> sp1 = new HashSet<Integer>();
        for (int i = 0; i < m.length; i++) {
            sp1.add(m[i]);
        }
        System.out.println(sp1);
    }
}


import java.util.ArrayList;
        import java.util.Iterator;
        import java.util.List;
        import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> schoolGrades = new ArrayList<>();
        Random randomNumber = new Random();
        for (int i = 0; i<10; i++) {
            schoolGrades.add(randomNumber.nextInt(11));
        }
        System.out.println( schoolGrades);
        schoolGrades.removeIf(mark -> { return mark < 4; });

        System.out.println(schoolGrades);
        int maxGrade = schoolGrades.get(0);
        Iterator<Integer> iterator = schoolGrades.iterator();
        while (iterator.hasNext()) {
            int maxSearch = iterator.next();
            if (maxSearch > maxGrade) {
                maxGrade = maxSearch;
            }
        }
        System.out.println("Max school grade: " + maxGrade);
    }
}
import java.util.Scanner;
        import java.util.Map;
        import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<String, Integer> wordToCount = new TreeMap<>();
        for (String word : text.split(" ")) {
            wordToCount.put(word, wordToCount.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordToCount);
    }
}




