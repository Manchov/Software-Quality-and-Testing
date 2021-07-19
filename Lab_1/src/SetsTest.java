import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SetsTest {
    int testcount = 1;
    Set<Integer> set1 = new HashSet<Integer>();
    Set<Integer> set2 = new HashSet<Integer>();
    Set<Integer> set3 = new HashSet<Integer>();
    Sets compare = new Sets();
    Random random = new Random();

    @BeforeAll
    static void initAll() {
        System.out.println("Test Started");
    }

    @BeforeEach
    void setUp() {
            System.out.println("---Test:");
        }

    @AfterEach
    void tearDown() {
    }

    @Test
    void NullSet1() {
        set1 = null;
        set2 = null;
        assertEquals(null,compare.SetDifference(set1,set2));
    }

    @Test
    void NullSet2() {
        set1 = null;
        set2.add(1);
        assertEquals(null,compare.SetDifference(set1,set2));
    }

    @Test
    void NullSet3() {
        set1.add(1);
        set2 = null;
        assertEquals(null,compare.SetDifference(set1,set2));
    }

    @Test
    void NullSet4() {
        set1.add(22);
        set1.remove(22);
        set2 = null;
        assertEquals(null,compare.SetDifference(set1,set2));
    }

    @Test
    void NullSet5() {
        set1 = Stream.of(2323,43242,1233).collect(Collectors.toSet());
        set2 = null;
        assertEquals(null,compare.SetDifference(set1,set2));
    }

    @Test
    void NullSet6() {
        set1 = null;
        set2.clear();
        assertEquals(null,compare.SetDifference(set1,set2));
    }

    @Test
    void NullSet7() {
        set1.clear();
        set2 = Stream.of(333333,43242312,1244433).collect(Collectors.toSet());
        assertEquals(null,compare.SetDifference(set1,set2));
    }

    @Test
    void NullSet8() {
        set1 = null;
        set2 = Stream.of(333333,43242312,1244433).collect(Collectors.toSet());
        assertEquals(null,compare.SetDifference(set1,set2));
    }
//    //non-nulls
//    Random random = new Random();
//
//    int[] array = random.ints(100000, 10,100000).toArray();

    @Test
    void NullSet9() {
        set1 = Stream.of(5432423,44322312,124444433).collect(Collectors.toSet());;
        set2 = Stream.of(333333,43242312,1244433).collect(Collectors.toSet());
        assertNotEquals(null,compare.SetDifference(set1,set2));
    }
    @Test
    void NullSet10() {
        set1 = Stream.of(21,23,32).collect(Collectors.toSet());
        set2 = Stream.of(32,11,88).collect(Collectors.toSet());
        assertNotEquals(null,compare.SetDifference(set1,set2));
    }
    @Test
    void NullSet11() {
        set1 = Stream.of(21,23,32).collect(Collectors.toSet());
        set2 = Stream.of(32,11,88).collect(Collectors.toSet());
        set3 = Stream.of(23,21).collect(Collectors.toSet());
        assertEquals(set3 ,compare.SetDifference(set1,set2));
    }
    @Test
    void NullSet12() {
        set1 = Stream.of(1,2,3).collect(Collectors.toSet());
        set2 = Stream.of(2,4,5).collect(Collectors.toSet());
        assertNotEquals(null,compare.SetDifference(set1,set2));
    }
    @Test
    void NullSet13() {
        set1 = Stream.of(1,2,3,4,5,6,7,8,9,10).collect(Collectors.toSet());
        set2 = Stream.of(6,7,8,9,10).collect(Collectors.toSet());
        set3 = Stream.of(1,2,3,4,5).collect(Collectors.toSet());
        assertEquals(set3 ,compare.SetDifference(set1,set2));
    }
    @Test
    void NullSet14() {
        set1 = Stream.of(1).collect(Collectors.toSet());
        set2 = Stream.of(1).collect(Collectors.toSet());
        set3 = null;
        assertEquals(set3 ,compare.SetDifference(set1,set2));
    }
    @Test
    void NullSet15() {
        set1 = Stream.of(1,2).collect(Collectors.toSet());
        set2 = Stream.of(2).collect(Collectors.toSet());
        set3 = Stream.of(1).collect(Collectors.toSet());
        assertEquals(set3 ,compare.SetDifference(set1,set2));
    }
}