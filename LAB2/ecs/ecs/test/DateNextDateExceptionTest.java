import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class DateNextDateExceptionTest
{
    private int year;
    private int month;
    private int day;

    public DateNextDateExceptionTest(int year, int month, int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }





    @Parameterized.Parameters
    public static List<Integer[]> input(){
        List<Integer[]> dateList = new LinkedList<>( );
        dateList.add(new Integer[] {1500, 2, 31});
        dateList.add(new Integer[] {1500, 2, 29});
        dateList.add(new Integer[] {-1, 10, 20});
        return dateList;
    }

    @Test
    public void testNextDateException() {
        Assert.assertThrows(IllegalArgumentException.class, () -> new Date(year, month, day));

    }
}