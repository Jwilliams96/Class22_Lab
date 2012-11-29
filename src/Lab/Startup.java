package Lab;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Startup {

    public static void main(String[] args) throws ParseException {
        Calendar partA1 = Calendar.getInstance();
        partA1.add(Calendar.WEEK_OF_YEAR, -1);

        Date partA2 = partA1.getTime();
        SimpleDateFormat partA3 = new SimpleDateFormat("EEE, MMM d, ''yy");

        System.out.println("Part A: " + partA3.format(partA2));

        Calendar partB1 = Calendar.getInstance();
        SimpleDateFormat partB2 = new SimpleDateFormat("M/d/yy h:mm a");

        System.out.println("Part B: " + partB2.format(partB1.getTime()));

        String partC1 = "12/12/2012";
        SimpleDateFormat partC2 = new SimpleDateFormat("d/M/yyyy");
        Date partC3 = partC2.parse(partC1);
        Calendar partC4 = Calendar.getInstance();
        partC4.setTime(partC2.parse(partC1));
        System.out.println("Part C: " + partC2.format(partC3));
        System.out.println("Part C: " + partC2.format(partC4.getTime()));

        Calendar partD1 = Calendar.getInstance();
        partD1.add(Calendar.DAY_OF_YEAR, 30);
        Date partD2 = partD1.getTime();
        SimpleDateFormat partD3 = new SimpleDateFormat("EEE, MMM d, ''yy");
        
        System.out.println("Part D: " + partD3.format(partD2));
    }
}
