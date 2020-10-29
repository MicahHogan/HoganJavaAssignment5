

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DateTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DateTest
{
    /**
     * Default constructor for test class DateTest
     */
    public DateTest()
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
        Date testDate = new Date(2020,1,1);
        assertEquals(2020, testDate.getYear());
        assertEquals(1, testDate.getMonth());
        assertEquals(1, testDate.getDay());
    }
    
    @Test
    public void testSetters() {
        Date testDate = new Date(2020,1,1);
        testDate.setYear(2021);
        assertEquals(2021, testDate.getYear());
        testDate.setMonth(2);
        assertEquals(2, testDate.getMonth());
        testDate.setDay(14);
        assertEquals(14, testDate.getDay());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testYearPrecondition() {
        new Date (-999, 1, 1);
    
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testMonthPrecondition() {
        new Date (1, -999, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDayPrecondtion() {
        new Date (1, 1, -999);
    }
}
