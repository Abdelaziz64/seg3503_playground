import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateOkTest {
    private Date date, nextDate;

    /**
     * Constructor for DateNextDateOKTest class
     * @param date starting date (Date object)
     * @param nextDate expected Date object result of date.nextDate()
     */
    public DateNextDateOkTest(Date date, Date nextDate) {
        this.date = date;
        this.nextDate = nextDate;
    }

    /**
     * Parameterization of the first 15 test cases
     * @return List of Date arrays containing the starting date and the expected nextDate
     */
    @Parameters
    public static List<Date[]> dates() {
        List<Date[]> dates = new LinkedList<Date[]>();
        
        // 1
        dates.add(new Date[] {
            new Date(1700,6,20),
            new Date(1700,6,21)
        });

        // 2
        dates.add(new Date[] {
            new Date(2005,4,15),
            new Date(2005,4,16)
        });

        // 3
        dates.add(new Date[] {
            new Date(1901,7,20),
            new Date(1901,7,21)
        });

        // 4
        dates.add(new Date[] {
            new Date(3456,3,27),
            new Date(3456,3,28)
        });

        // 5
        dates.add(new Date[] {
            new Date(1500,2,17),
            new Date(1500,2,18)
        });

        // 6
        dates.add(new Date[] {
            new Date(1700,6,29),
            new Date(1700,6,30)
        });

        // 7
        dates.add(new Date[] {
            new Date(1800,11,29),
            new Date(1800,11,30)
        });

        // 8
        dates.add(new Date[] {
            new Date(3453,1,29),
            new Date(3453,1,30)
        });

        // 9
        dates.add(new Date[] {
            new Date(444,2,29),
            new Date(444,3,01)
        });

        // 10
        dates.add(new Date[] {
            new Date(2005,4,30),
            new Date(2005,5,1)
        });

        // 11
        dates.add(new Date[] {
            new Date(3453,1,30),
            new Date(3453,1,31)
        });

        // 12
        dates.add(new Date[] {
            new Date(3456,3,30),
            new Date(3456,3,31)
        });

        // 13
        dates.add(new Date[] {
            new Date(1901,7,31),
            new Date(1901,8,1)
        });

        // 14
        dates.add(new Date[] {
            new Date(3453,1,31),
            new Date(3453,2,1)
        });

        // 15
        dates.add(new Date[] {
            new Date(3456,12,31),
            new Date(3457,1,1)
        });

        return dates;
    }

    /**
     * Test case
     * Tests dates with ok next dates
     */
    @Test
    public void testDateNextDateOk(){
        assertEquals(nextDate, date.nextDate());
    }
}