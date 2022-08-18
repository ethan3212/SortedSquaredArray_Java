package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortedSquaredArrayReverseFillTest {
    @Test
    void Test1() {
        var input = new int[] {1, 2, 3, 5, 6, 8, 9};
        var expected = new int[] {1, 4, 9, 25, 36, 64, 81};
        var actual = Main.sortedSquaredArrayReverseFill(input);
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void Test2() {
        var input = new int[] {1};
        var expected = new int[] {1};
        var actual = Main.sortedSquaredArrayReverseFill(input);
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void Test3() {
        var input = new int[] {1, 2};
        var expected = new int[] {1, 4};
        var actual = Main.sortedSquaredArrayReverseFill(input);
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void Test4() {
        var input = new int[] {1, 2, 3, 4, 5};
        var expected = new int[] {1, 4, 9, 16, 25};
        var actual = Main.sortedSquaredArrayReverseFill(input);
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void Test5() {
        var input = new int[] {0};
        var expected = new int[] {0};
        var actual = Main.sortedSquaredArrayReverseFill(input);
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void Test6() {
        var input = new int[] {10};
        var expected = new int[] {100};
        var actual = Main.sortedSquaredArrayReverseFill(input);
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void Test7() {
        var input = new int[] {-1};
        var expected = new int[] {1};
        var actual = Main.sortedSquaredArrayReverseFill(input);
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void Test8() {
        var input = new int[] {-2, -1};
        var expected = new int[] {1, 4};
        var actual = Main.sortedSquaredArrayReverseFill(input);
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void Test9() {
        var input = new int[] {-5, -4, -3, -2, -1};
        var expected = new int[] {1, 4, 9, 16, 25};
        var actual = Main.sortedSquaredArrayReverseFill(input);
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void Test10() {
        var input = new int[] {-10};
        var expected = new int[] {100};
        var actual = Main.sortedSquaredArrayReverseFill(input);
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void Test11() {
        var input = new int[] {-10, -5, 0, 5, 10};
        var expected = new int[] {0, 25, 25, 100, 100};
        var actual = Main.sortedSquaredArrayReverseFill(input);
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void Test12() {
        var input = new int[] {-7, -3, 1, 9, 22, 30};
        var expected = new int[] {1, 9, 49, 81, 484, 900};
        var actual = Main.sortedSquaredArrayReverseFill(input);
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void Test13() {
        var input = new int[] {-50, -13, -2, -1, 0, 0, 1, 1, 2, 3, 19, 20};
        var expected = new int[] {0, 0, 1, 1, 1, 4, 4, 9, 169, 361, 400, 2500};
        var actual = Main.sortedSquaredArrayReverseFill(input);
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void Test14() {
        var input = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        var expected = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        var actual = Main.sortedSquaredArrayReverseFill(input);
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void Test15() {
        var input = new int[] {-1, -1, 2, 3, 3, 3, 4};
        var expected = new int[] {1, 1, 4, 9, 9, 9, 16};
        var actual = Main.sortedSquaredArrayReverseFill(input);
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void Test16() {
        var input = new int[] {-3, -2, -1};
        var expected = new int[] {1, 4, 9};
        var actual = Main.sortedSquaredArrayReverseFill(input);
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}