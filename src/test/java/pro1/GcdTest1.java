package pro1;
import org.junit.jupiter.api.Assertions;

class GcdTest1
{
    @org.junit.jupiter.api.Test
    void test()
    {
        Assertions.assertEquals(
                10,
                 NumericUtils.gcd(20,50)

        );
        Assertions.assertEquals(
                20,
                NumericUtils.gcd(20,1000)

        );
        Assertions.assertEquals(
                1,
                NumericUtils.gcd(7919,7907)

        );
        Assertions.assertEquals(
                15,
                NumericUtils.gcd(15,15)

        );
    }
}