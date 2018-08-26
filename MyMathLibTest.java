import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyMathLibTest.
 *
 * @author  Dave Avis
 * @version 8.26.2018
 */
public class MyMathLibTest
{
    private double[] testArray = { 1.2, 14.6, 73.9, 100.1, 204.0, 300.5 };
    private double[] negTestArray = { -1.2, -14.6, -73.9, -100.1, -204.0, -300.5 };
    
    /**
     * Default constructor for test class MyMathLibTest.
     */
    public MyMathLibTest()
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
    
    /**
     * Tests MyMathLib.doSqrt() for both positive and negative numbers.
     */
    @Test
    public void doSqrtTest()
    {
        
        for( int i = 0; i < testArray.length; i++ )
        {
            double num = testArray[i];
            assertEquals("doSqrt(" + num + ") failed.", Math.sqrt(num), MyMathLib.doSqrt(num), 0.1 );
        }
        for( int i = 0; i < negTestArray.length; i++ )
        {
            double num = negTestArray[i];
            assertEquals("doSqrt(" + num + ") failed.", -1, MyMathLib.doSqrt(num), 0.1 );
        }
    }
    
    /**
     * Tests MyMathLib.roundUp() for both positive and negative numbers.
     */
    @Test
    public void roundUpTest()
    {
        for( int i = 0; i < testArray.length; i++ )
        {
            double num = testArray[i];
            assertEquals("roundUp(" + num + ") failed.", Math.ceil(num), MyMathLib.roundUp(num), 0.1 );
        }
        for( int i = 0; i < negTestArray.length; i++ )
        {
            double num = negTestArray[i];
            assertEquals("roundUp(" + num + ") failed.", Math.floor(num), MyMathLib.roundUp(num), 0.1 );
        }
    }
    
    /**
     * Tests MyMathLib.roundDown() for both positive and negative numbers.
     */
    @Test
    public void roundDownTest()
    {
        for( int i = 0; i < testArray.length; i++ )
        {
            double num = testArray[i];
            assertEquals("roundDown(" + num + ") failed.", Math.floor(num), MyMathLib.roundDown(num), 0.1 );
        }
        for( int i = 0; i < negTestArray.length; i++ )
        {
            double num = negTestArray[i];
            assertEquals("roundDown(" + num + ") failed.", Math.ceil(num), MyMathLib.roundDown(num), 0.1 );
        }
    }
    
    /**
     * Tests MyMathLib.square() for both positive and negative numbers.
     */
    @Test
    public void squareTest()
    {
        for( int i = 0; i < testArray.length; i++ )
        {
            double num = testArray[i];
            assertEquals("square(" + num + ") failed.", num * num, MyMathLib.square(num), 0.1 );
        }
        for( int i = 0; i < negTestArray.length; i++ )
        {
            double num = negTestArray[i];
            assertEquals("square(" + num + ") failed.", num * num, MyMathLib.square(num), 0.1 );
        }
    }
    
    /**
     * Tests MyMathLib.root() for both positive and negative numbers.
     */
    @Test
    public void rootTest()
    {
        int[] rootArr = { 1, 2, 3, 4, 5, -1, -2, -3, -4, -5 };
        double[] baseArr = { 1.1, 2.4, 3.6, 4.1, 5.9 };
        for( int i = 0; i < baseArr.length; i++ )
        {
            for( int j = 0; j < rootArr.length; j++ )
            {
                assertEquals("root(" + baseArr[i] + ", " + rootArr[j] + ") failed.", Math.pow( baseArr[i], 1.0/rootArr[j] ), MyMathLib.root( baseArr[i], rootArr[j] ), 0.1 );
            }
        }
    }
    
    /**
     * Tests MyMathLib.isBigger() for both positive and negative numbers.
     */
    @Test
    public void isBiggerTest()
    {
        String[] ansArray = { "100", "100", "100", "100.1", "204.0", "300.5" };
        String[] negAnsArray = { "100", "100", "100", "100.1", "204.0", "300.5" };
        
        for( int i = 0; i < testArray.length; i++ )
        {
            double num = testArray[i];
            boolean answer = false;
            if( Math.abs(num) > 100 )
            {
                answer = true;
            }
            else
            {
                answer = false;
            }
            assertEquals("isBigger(" + num + ") failed.", answer, MyMathLib.isBigger(num) );
        }
        for( int i = 0; i < negTestArray.length; i++ )
        {
            double num = negTestArray[i];
            boolean answer = false;
            if( Math.abs(num) > 100 )
            {
                answer = true;
            }
            else
            {
                answer = false;
            }
            assertEquals("isBigger(" + num + ") failed.", answer, MyMathLib.isBigger(num) );
        }
    }
    
    /**
     * Tests MyMathLib.isEvenOdd() for both positive and negative numbers.
     */
    @Test
    public void isEvenOddTest()
    {
        int[] intArray = { 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5 };
        String[] ansArray = { "Odd", "Even", "Odd", "Even", "Odd", "Even", "Odd", "Even", "Odd", "Even", "Odd" };
        
        for( int i = 0; i < intArray.length; i++ )
        {
            int num = intArray[i];
            assertEquals("isEvenOdd(" + num + ") failed.", ansArray[i].toLowerCase(), MyMathLib.isEvenOdd(num).toLowerCase() );
        }
    }
}
