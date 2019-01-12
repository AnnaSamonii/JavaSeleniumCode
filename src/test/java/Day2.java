
import org.testng.annotations.Test;

public class Day2 {
    @Test
    public void test001() {
        System.out.println("Welcome to Day 2");
    }

    @Test
    public void test002() {
        printString("Test");
    }

    public void printString(String a) {
        System.out.println(a);
    }

    @Test
    public void test004() {
        name("Ruchika", "Sinha");
    }

    private void name(String firstName, String lastName) {
        System.out.println("Name is " + firstName + " " + lastName);
    }

    @Test
    public void test003() {
        printString(true, "Some Text");
        printString(false, "Some Another Text");
    }

    private void printString(Boolean isEnablePrint, String printValue) {
        if (isEnablePrint) {
            System.out.println(printValue);
        } else {
            System.out.println("False");
        }
    }

    @Test
    public void test005() {
        printNameIfEnabled(true, "Anna", "Gorbenco");
        printNameIfEnabled(false, "Anna", "Gorbenco");
    }


    private void printNameIfEnabled(Boolean isEnable, String firstName, String lastName) {
        if (isEnable) {
            System.out.println(firstName + " " + lastName);
        }
    }

    @Test
    public void test006() {
        checkNumber(9);
        checkNumber(11);
    }

    public void checkNumber(int number) {
        if (number > 10) {
            System.out.println("More");

        } else {
            System.out.println(("Less"));
        }

    }

    @Test
    public void test008() {
        compareInt(20, 30, 10);
        compareInt(20, 3, 10);
    }

    public void compareInt(int a, int b, int c) {
        if (a > b) {
            System.out.println(c);
        } else {
            System.out.println("Go to sleep");
        }
    }

    @Test
    public void test009() {
        functionA(true, 10, 5);
        functionA(false, 10, 20);
        functionA(true, 10, 20);
        functionA(false, 20, 10);
    }

    private void functionA(boolean isEnable, int a, int b) {
        if (a > b) {
            if (isEnable) {
                System.out.println("Hello World");
            } else {
                System.out.println("buy buy");
            }
        }
    }

    @Test
    public void test010() {
        int[] array1 = {10, 20, 30, 40};
        System.out.println(array1[3]);
    }

    @Test
    public void test011() {
        int[] array2 = {10, 20, 30, 40, 50, 60, 70};
        printIndex(array2, 3);

    }

    private void printIndex(int[] arr, int index) {
        System.out.println(arr[index]);
    }


    @Test
    public void test012() {
        int[] array2 = {10, 20, 30, 40, 50, 60, 70};
        printIndex2(array2, 3);
        printIndex2(array2, 7);
    }

    private void printIndex2(int[] arr, int index) {
        if (index < arr.length) {
            System.out.println(arr[index]);
        } else {
            System.out.println("Check your Index");
        }

    }


    @Test
    public void test013() {
        int[] array2 = {10, 20, 30, 40, 50, 60, 70};
        printIndex3(array2, 3);
        printIndex3(array2, 7);
        printIndex3(array2, -7);
    }

    private void printIndex3(int[] arr, int index) {
        if (index < arr.length) {
            System.out.println(arr[index]);
        } else {
            System.out.println("Check your Index");
        }

    }


    @Test
    public void test014() {
        int[] array2 = {10, 20, 30, 40, 50, 60, 70};
        printIndex4(array2, 3);
        printIndex4(array2, 7);
        printIndex4(array2, -7);
    }

    private void printIndex4(int[] arr, int index) {
        if (index < arr.length && index > +0) {
            System.out.println(arr[index]);
        } else {
            {
                System.out.println("Check your Index");
            }

        }
    }

    @Test
    public void test015() {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 2, 3, 4};
        compareSizeOfArrays(array1, array2);
    }

    private void compareSizeOfArrays(int array1[], int array2[]) {
        if (array1.length > array2.length) {
            System.out.println("array1 has more elements");
        } else {
            System.out.println("array2 has more elements");
        }
    }

    @Test
    public void test016() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }


    @Test
    public void test017() {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }

    @Test
    public void test018() {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        multiplyArrayElements(array1, 5);
    }

    private void multiplyArrayElements(int[] array1, int i) {
        for (int j = 0; j < array1.length; j++) {
            System.out.println(array1[j] * i);
        }
    }

    @Test
    public void test019() {
        int[] array1 = {1, 2, 3, 4, 5};
        compareArrayElements(array1, 3);
    }

    private void compareArrayElements(int[] array1, int pivot) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < pivot) {
                System.out.println("Element in index" + i + "Is lesser than pivot");
            } else {
                System.out.println("Element in index" + i + "Is lesser than pivot");
            }
        }
    }

    @Test
    public void test020() {
        int[] arr = {2, 4, 8, 1, 5};
        countNumbersLessThanPivot(arr, 3);
    }

    private void countNumbersLessThanPivot(int[] array, int pivot) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < pivot) {
                count++;
            }
        }
        System.out.println(count);
    }


    @Test
    public void test021() {
        int[] array = {2, 4, 8, 1, 5};
        printRev(array);
    }

    private void printRev(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);

        }


    }


    @Test
    public void test022() throws Exception {
        int i = 0;
        for (; i < 5; ) {
            System.out.println(i);
            i++;
        }
    }


    @Test
    public void test023() throws Exception {
        boolean elementIsNotVisible = true;
        int i = 0;
        while (elementIsNotVisible) {
            System.out.println("Element is not visible");
            i++;

            if (i > 100) {
                elementIsNotVisible = false;
            }
        }

    }


    @Test
    public void test024() throws Exception {
        int[] integerArray = {2, 0, 1, 3};
        for (int eachElement : integerArray) {
            System.out.println(eachElement);
        }
    }

    @Test
    public void test025() throws Exception {
        int i;
        for (i = 0; i < 5; i++) {
            if (i >= 7) {
                break;
            }
            System.out.println("Yuhu");
        }
        System.out.println(i);
    }
}






