package org.example.flexibility.hamcrest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class HamcrestTest {

    @Test
    public void test() {
        // Collections
        List<Integer> scores = Arrays.asList(99, 85, 100, 95, 51);
        assertThat(scores, hasSize(5));
        assertThat(scores, hasItems(100, 95));
        assertThat(scores, everyItem(lessThan(101)));

        // Strings
        String str1 = null;
        String str2 = "";
        assertThat(str1, isEmptyOrNullString());
        assertThat(str2, isEmptyString());

        // Arrays
        Integer[] numbers = {1, 2, 3};
        assertThat(numbers, arrayWithSize(3));
        assertThat(numbers, arrayContaining(1, 2, 3));
        assertThat(numbers, arrayContainingInAnyOrder(2, 3, 1));
    }
}
