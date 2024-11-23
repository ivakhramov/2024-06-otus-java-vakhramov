package ru.ivakhramov.java.basic.homeworks.lesson29;

import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilitiesTest {
    @ParameterizedTest
    @MethodSource("testDataToGetElementsArrayFollowingLastOn")
    void testGetElementsArrayFollowingLastOn(int[] data, int[] result) {
        if(result == null) {
            assertThrows(RuntimeException.class, new Executable() {
                @Override
                public void execute() throws Throwable {
                    ArrayUtilities.getElementsArrayFollowingLastOne(data);
                }
            });
        } else {
            assertArrayEquals(result, ArrayUtilities.getElementsArrayFollowingLastOne(data));
        }
    }

    private static Stream<Arguments> testDataToGetElementsArrayFollowingLastOn() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 1, 2, 2}, new int[]{2, 2}),
                Arguments.of(new int[]{2, 2, 2, 2}, null),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{2, 3, 4, 5}),
                Arguments.of(new int[]{0, 0, 0}, null),
                Arguments.of(new int[]{}, null)
        );
    }

    @ParameterizedTest
    @MethodSource("testDataToCheckArrayForOneAndTwo")
    void testCheckArrayForOneAndTwo(int[] data, boolean result) {
        assertEquals(result, ArrayUtilities.checkArrayForOneAndTwo(data));
    }

    private static Stream<Arguments> testDataToCheckArrayForOneAndTwo() {
        return Stream.of(
                Arguments.of(new int[] {1, 2}, true),
                Arguments.of(new int[] {1, 1}, false),
                Arguments.of(new int[] {1, 3}, false),
                Arguments.of(new int[] {1, 2, 2, 1}, true),
                Arguments.of(new int[] {}, false)
        );
    }
}
