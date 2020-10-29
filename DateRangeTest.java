

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DateRangeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DateRangeTest
{
    /**
     * Default constructor for test class DateRangeTest
     */
    public DateRangeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testConstructorAndGetters() {
        Date testStart = new Date (2000, 1, 4);
        Date testEnd = new Date (2001, 2, 13);
        DateRange testDateRange = new DateRange (testStart, testEnd);
        assertEquals(2000, testStart.getYear());
        assertEquals(1, testStart.getMonth());
        assertEquals(4, testStart.getDay());
        assertEquals(2001, testEnd.getYear());
        assertEquals(2, testEnd.getMonth());
        assertEquals(13, testEnd.getDay());
    }
    
    
    public void testSetters() {
        Date testStart = new Date (1999, 12, 31);
        Date testEnd = new Date (2000, 1, 2);
        DateRange testDateRange = new DateRange(testStart, testEnd);
        testDateRange.setStart(testEnd);
        assertEquals(2000, testDateRange.getStart().getYear());
        assertEquals(1, testDateRange.getStart().getMonth());
        assertEquals(2, testDateRange.getStart().getDay());
        testDateRange.setEnd(testStart);
        assertEquals(1999, testDateRange.getEnd().getYear());
        assertEquals(12, testDateRange.getEnd().getMonth());
        assertEquals(31, testDateRange.getEnd().getDay());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testStartDateNotNullPrecondition() {
        Date thisDate = new Date(2000, 1, 1);
        new DateRange (null, thisDate);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testEndDateNotNullPrecondition() {
        Date thisDate = new Date(2000, 1, 1);
        new DateRange (thisDate, null);
    }
}
