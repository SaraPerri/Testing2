import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Ottieni l'anno
//Ottieni il mese
//Ottieni il giorno
//Ottieni il giorno della settimana
//Stampa i risultati sulla console -Crea dei test per questo esercizio


public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        printMonth(dateTime);
        printYear(dateTime);
        printDayOfWeek(dateTime);
        printDay(dateTime);
    }
    public static Month printMonth(OffsetDateTime dateTime){
        Month month = dateTime.getMonth();
        System.out.println("Month: " + month);
        return month;
    }
    public static int printYear(OffsetDateTime dateTime){
        int year = dateTime.getYear();
        System.out.println("Year: " + year);
        return year;
    }
    public static int printDay(OffsetDateTime dateTime){
        int day = dateTime.getDayOfMonth();
        System.out.println("Day: " + day);
        return day;
    }
    public static DayOfWeek printDayOfWeek(OffsetDateTime dateTime){
        DayOfWeek dayW = dateTime.getDayOfWeek();
        System.out.println("Day of week: " + dayW);
        return dayW;
    }

}