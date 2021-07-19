import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class calTest {
    int month1;
    int day1;
    int month2;
    int day2;
    int year;
    Cal calcul;
    @BeforeEach
    public void setUp() {
        calcul = new Cal();
    }

    @Test
    public void test1() {
        month1 = 1;
        day1 = 1;
        month2 = 1;
        day2 = 1;
        year = 1;
        // 1 : T T T T
        assertEquals(0,
                calcul.cal(month1,day1, month2, day2,year));
    }
    @Test
    public void test2() {
        month1 = 1;
        day1 = 1;
        month2 = 2;
        day2 = 1;
        year = 1;
        // 9 : F T T T
        assertEquals(31,
                calcul.cal(month1,day1, month2, day2,year));
    }
    @Test
    public void test3() {
        month1 = 1;
        day1 = 1;
        month2 = 2;
        day2 = 1;
        year = 400;
        // 10 : F T T F
        assertEquals(31,
                calcul.cal(month1,day1, month2, day2,year));
    }
    @Test
    public void test4() {
        month1 = 1;
        day1 = 1;
        month2 = 2;
        day2 = 1;
        year = 404;
        // 14 : F F T F
        assertEquals(31,
                calcul.cal(month1,day1, month2, day2,year));
    }
    @Test
    public void test5() {
        month1 = 1;
        day1 = 1;
        month2 = 2;
        day2 = 1;
        year = 500;
        // 13 : F F T T
        assertEquals(31,
                calcul.cal(month1,day1, month2, day2,year));
    }
    @Test
    public void test6() {
        month1 = 1;
        day1 = 1;
        month2 = 2;
        day2 = 1;
        year = 505;
        // 15 : F F F T
        assertEquals(31,
                calcul.cal(month1,day1, month2, day2,year));
    }
}