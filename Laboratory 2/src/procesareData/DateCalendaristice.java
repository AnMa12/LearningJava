package procesareData;

import java.util.Date;

public class DateCalendaristice {

    public static int metodaDate(Date arr1, Date arr2, int n) {
        //daca elementele de pe aceeasi pozitie
        //din cele doua array-uri sunt diferite =>
        //daca nu s egale se returneaza un array nou cu toate aceste valori
        //else => "Array-ul rezultat este gol"

        if(arr1.equals(arr2)) {
            return 1;
        }
        else
            return 0;
    }
}
