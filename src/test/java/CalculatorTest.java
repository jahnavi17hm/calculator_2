import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
    private Main calculator;
    @Before
    public void setUp() {
        calculator = new Main();
    }

    @Test
    public void test_add() {
        int a = 12;
        int b = 23;
        int expectedResult = 35;
        int result = calculator.add(a,b);
        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void test_subt() {
        int a = 11;
        int b = 15;
        int expectedResult = -4;
        int result = calculator.subt(a,b);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_mul() {
        int a = 11;
        int b = 11;
        int expectedResult = 121;
        int result = calculator.mul(a,b);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_per() {
        int a = 37;
        int b = 8;
        int expectedResult = 5;
        int result = calculator.per(a,b);
        Assert.assertEquals(expectedResult, result);
    }
}