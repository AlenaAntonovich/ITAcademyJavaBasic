import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {



        //Ввести с клавиатуры номер месяца текущего года. Вывести на экран все его даты в формате d::MMM::uuuu.


        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        LocalDate ld = LocalDate.of(2022, month, 1);
        do {
            System.out.println(ld.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
            ld = ld.plusDays(1);

        } while (ld.getDayOfMonth() > 1);

        //От текущей даты вывести расписание всех встреч, которые происходят еженедельно в 13:00 в течение 2 месяцев.

        List<Date> dates = new ArrayList<Date>();

        String str_date = "11/11/2022";
        String end_date = "11/01/2023";

        DateFormat formatter;

        formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date startDate = (Date) formatter.parse(str_date);
        Date endDate = (Date) formatter.parse(end_date);
        long interval = 24 * 1000 * 60 * 60 * 7;
        long endTime = endDate.getTime();
        long curTime = startDate.getTime();
        while (curTime <= endTime) {
            dates.add(new Date(curTime));
            curTime += interval;
        }
        for (int i = 0; i < dates.size(); i++) {
            Date lDate = (Date) dates.get(i);
            String ds = formatter.format(lDate);
            System.out.println(" Today our conference in 13:00 ..." + ds);

        }



        //От текущей даты вывести на экран дату, которая была 60 дней назад.

        Calendar cal = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Today's date is "+dateFormat.format(cal.getTime()));

        cal.add(Calendar.DATE, -60);
        System.out.println("60 days ago date was "+dateFormat.format(cal.getTime()));

    }
}