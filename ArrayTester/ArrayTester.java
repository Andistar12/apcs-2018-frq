public class ArrayTester {

    public static int[] getColumn(int[][] arr2D, int c) {

        // TODO TEST PROBLEM
    }

    public static boolean isLatin(int[][] square) {
       // TODO TEST PROBLEM
    }

/* Everything below is not on the test but implements examples
 * It also makes this file runnable */

    public static boolean hasAllValues(int[] arr1, int[] arr2) {
        boolean presentFlag = false;
        for (int i = 0; i < arr1.length; i++) {
            presentFlag = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) presentFlag = true;
            }
            if (!presentFlag) return false;
        }
        return true;
    }

    public static boolean containsDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {


        int[][] arr2D = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8},
            {9, 5, 3}
        };
        int[] result = ArrayTester.getColumn(arr2D, 1);
        int[][][] ls = { // 3D array :)
        {
            {1, 2, 3},
            {2, 3, 1},
            {3, 1, 2}
        }, {
            {10, 30, 20, 0},
            {0, 20, 30, 10},
            {30, 0, 10, 20},
            {20, 10, 0, 30}
        }, {
            {1, 2, 1},
            {2, 1, 1},
            {1, 1, 2}
        }, {
            {1, 2, 3},
            {3, 1, 2},
            {7, 8, 9}
        }, {
            {1, 2}, 
            {1, 2}
        }};
        boolean ls_answers[] = {true, true, false, false, false};

        // Problem 4a
        System.out.print("Checking arr2D. Expecting 1 4 7 5, got ");
        for (int i = 0; i < result.length; i++ ) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        
        // Problem 4b
        for (int i = 0; i < ls.length; i++) {
            System.out.println("Latin square " + (i + 1) + ": expecting " +
                ls_answers[i] + ", got " + ArrayTester.isLatin(ls[i]));
        }
    }

}
