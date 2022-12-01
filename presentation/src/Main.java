import java.util.List;
import models.auth.*;
import models.library.*;
import utils.DateFormat;

public class Main {
    public static void main(String[] args) {

        List<DateFormat> dates = DateFormat.getDatesBetween(new DateFormat(1, 11, 2022), new DateFormat(5, 11, 2022));
        System.out.println(dates);
        
        
    }
}
