import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

    public class Homework5 {

        public static void main(String[] args) {
            char[]c={'.',',','-',':',';','?','!'};
            int count = 0;
            Scanner sc = new Scanner(System.in);
            String s=sc.nextLine();
            for(int i=0;i<s.length();i++){
                for(int j=0;j<c.length;j++){
                    if(s.charAt(i)==c[j]){
                        count++;
                        break;
                    }
                }
            }
            System.out.println(count);
        }


        public static void inputword() {

            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            System.out.println("Введите слова одной строкой через пробел");

            int count = 0;
            if (input.length() != 0) {
                count++;
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == ' ') {
                        count++;
                    }

                }
            }
            System.out.println("Вы ввели " + count + " слов");
        }




        public static void sentenceword() {
            Scanner sc = new Scanner(System.in);
            String sentence = sc.nextLine();

            sentence = sentence.replaceAll("[!.,:;-]", "");

            String[] words = sentence.split(" ");
            StringBuilder newSentence = new StringBuilder();

            for (String word : words) {
                newSentence.append(word.charAt(word.length() - 1));
            }
            System.out.println(newSentence);
        }



        public static void sword() {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            Pattern p = Pattern.compile("-?[0-9a-fA-F]+");
            Matcher matcher = p.matcher(s);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                System.out.println("Найдено совпадение " + s.substring(start, end) + " с " + start + " по " + (end - 1) + " позицию");
            }
        }


        public static void strword (){
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println(str.replaceAll("<p id=p1>", "<p>"));
            Pattern p = Pattern.compile("0x\\p{XDigit}+");
            Matcher m = p.matcher(str);
            while (m.find()) {
                System.out.println(m.start() + " " + m.end());

            }
        }
    }


}
