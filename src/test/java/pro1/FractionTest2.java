package pro1;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionTest2
{
    @org.junit.jupiter.api.Test
    void test()
    {
        assertEquals(
                "2 / 5",
                new Fraction(400,1000).toString()
        );
        assertEquals("1 / 2", new Fraction(5, 10).toString());
        assertEquals("3 / 1", new Fraction(9, 3).toString());

        assertEquals("1 / -4", new Fraction(5, -20).toString());
        assertEquals("2 / 3", new Fraction(-10, -15).toString());
        assertEquals("5 / 2", new Fraction(25, 10).toString());
        assertEquals("1 / 3", new Fraction(12345, 37035).toString());
    }
}