import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class myTest {
    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");

        StringTokenizer st = new StringTokenizer(simpleDateFormat.format(date),".");

        while (st.hasMoreTokens()){
            System.out.print(Integer.parseInt(st.nextToken()));
        }

    }
}
