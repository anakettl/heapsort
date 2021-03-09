/**
 * @License
 * Copyright 2020 Bubble Sort Application
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.ifrs.vvs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Unit test for heap sort.
 */
class HeapSortTest {
    private HeapSort hs = new HeapSort();
    /**
     * HeapSort Test.
     */

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    void arraySimpleSort() {
        int[] arrayTest = new int[] {1, 2, 0, 23};
        int[] arrayExpected = new int[] {0, 1, 2, 23};

        hs.sort(arrayTest);
        assertArrayEquals(arrayTest, arrayExpected);
    }

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    void arrayWithNegativesSort() {
        int[] arrayTest = new int[] {-1, 2, 0, 23, 1, -2};
        int[] arrayExpected = new int[] {-2, -1, 0, 1, 2, 23};

        hs.sort(arrayTest);
        assertArrayEquals(arrayTest, arrayExpected);
    }

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    void arrayWithOnlyNegativesSort() {
        int[] arrayTest = new int[]{-1, -22, -23, -10, -2, -90};
        int[] arrayExpected = new int[]{-90, -23, -22, -10, -2, -1};

        hs.sort(arrayTest);
        assertArrayEquals(arrayTest, arrayExpected);

    }

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    void arrayEmptySort() {
        int[] arrayTest = new int[5];
        int[] arrayExpected = new int[5];

        hs.sort(arrayTest);
        assertArrayEquals(arrayTest, arrayExpected);
    }

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    void arrayWithOneElement() {
        int[] arrayTest = new int[]{2};
        int[] arrayExpected = new int[]{2};

        hs.sort(arrayTest);
        assertArrayEquals(arrayTest, arrayExpected);
    }
}
