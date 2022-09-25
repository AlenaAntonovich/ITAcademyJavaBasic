public class Homework2 {

     public static void main(String[] args) {
            System.out.println(find7(68));
        }

        public static boolean find7(int number) {
            if (number % 10 == 7) {
                return true;
            } else {
                return false;
            }
        }


        public static CircleRectangle(String[] args) {
            Rectangle rectangle = new Rectangle(2, 2);
            Circle circle = new Circle(1);

            if(circle.getDiagonal() == rectangle.getDiagonal()) {
                System.out.println("Круг закрыл прямоугольник!");
            } else {
                System.out.println("Прямоугольник не закрыт.");
            }
        }


    abstract class Shape {
        public abstract int getDiagonal();
    }

    class Rectangle extends Shape {
        private int a, b;

        public Rectangle() {
            a = 0;
            b = 0;
        }

        public Rectangle(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getDiagonal() {
            return (int) Math.sqrt(a^2 * b^2);
        }
    }

    class Circle extends Shape {
        private int radius;

        public Circle() {
            radius = 0;
        }

        public Circle(int radius) {
            this.radius = radius;
        }

        public int getDiagonal() {
            return 2 * radius;
        }


        public static void money(String[] args) {
            int money = 400;
            int x = money % 100;
            int y = money % 10;
            if (x == 1 || y == 1) {
                System.out.println(money + " рубль");
            } else if (5 > x && x > 1 || y > 1 && y < 5) {
                System.out.println(money + " рубля");
            } else if (20 > x && x > 10 || y > 5 && y < 10) {
                System.out.println(money + " рублей");
            } else if (x == 0 || y == 0) {
                System.out.println(money + "рублей");
            }




        public static void Day(String[] args) {
            int day = 22, month = 9, year = 2022;//day-день,month-месяц,year-год
            if ((day == 28) && month == 2 && year % 4 == 0 && year % 400 == 0 && year % 100 != 0) {
                day = 1;
                month++;
                System.out.println("дата следующего дня: " + year + ":" + month + ":" + day);
            } else if (day == 29 && month == 2 && !(year % 4 == 0 && year % 400 == 0 && year % 100 != 0)) {
                day = 1;
                month++;
                System.out.println("дата следующего дня: " + year + ":" + month + ":" + day);
            } else if ((day == 31) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
                day = 1;
                month++;
                System.out.println("дата следующего дня: " + year + ":" + month + ":" + day);
            } else if ((day == 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
                day = 1;
                month++;
                System.out.println("дата следующего дня: " + year + ":" + month + ":" + day);
            } else if ((day == 31) && month == 12) {
                day = 1;
                month = 1;
                year++;
                System.out.println("дата следующего дня: " + year + ":" + month + ":" + day);
            } else {
                day++;
                System.out.println("дата следующего дня: " + year + ":" + month + ":" + day);
            }

        }

        public static void Dom(String[] args) {
            int a = 10,b = 5;
            int c = 3,d = 2;
            int e = 8,f = 1;
            if (a >= b){
                if(c >= d && e >= f){
                    if(c <= a && e <= a && (d + f) <= b)
                        System.out.println("Можно построить 2 дома");
                    else
                        System.out.println("Нельзя построить 2 дома");
                }
                else if(c < d && e >= f){
                    if(d <= a && e <= a && (c + f) <= b)
                        System.out.println("Можно построить 2 дома");
                    else
                        System.out.println("Нельзя построить 2 дома");
                }
                else if(c < d && e < f){
                    if(d <= a && f <= a && (c + e) <= b)
                        System.out.println("Можно построить 2 дома");
                    else
                        System.out.println("Нельзя построить 2 дома");
                }
                else if(c >= d && e < f){
                    if(c <= a && f <= a && (d + e) <= b)
                        System.out.println("Можно построить 2 дома");
                    else
                        System.out.println("Нельзя построить 2 дома");
                }
            }
            else if (a < b){
                if(c >= d && e >= f){
                    if(c <= b && e <= b && (d + f) <= a)
                        System.out.println("Можно построить 2 дома");
                    else
                        System.out.println("Нельзя построить 2 дома");
                }
                else if(c < d && e >= f){
                    if(d <= b && e <= b && (c + f) <= a)
                        System.out.println("Можно построить 2 дома");
                    else
                        System.out.println("Нельзя построить 2 дома");
                }
                else if(c < d && e < f){
                    if(d <= b && f <= b && (c + e) <= a)
                        System.out.println("Можно построить 2 дома");
                    else
                        System.out.println("Нельзя построить 2 дома");
                }
                else if(c >= d && e < f){
                    if(c <= b && f <= b && (d + e) <= a)
                        System.out.println("Можно построить 2 дома");
                    else
                        System.out.println("Нельзя построить 2 дома");
                }
            }


        public static void DayNumber(String[] args) {
            int dayNumber = 8;

            switch (dayNumber) {
                case 1:
                    System.out.println("Английский + ИТ-курсы");
                    break;
                case 2:
                    System.out.println("Работа");
                    break;
                case 3:
                    System.out.println("Английский + ИТ-курсы");
                    break;
                case 4:
                    System.out.println("Работа");
                    break;
                case 5:
                    System.out.println("Работа");
                    break;
                case 6:
                    System.out.println("День с семьей");
                    break;
                case 7:
                    System.out.println("Сьездить к родителям");
                    break;
                default:
                    System.out.println("Дня с таким номером не существует");
            }
        }


