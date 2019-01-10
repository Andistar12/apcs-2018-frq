public class ArrayTester {

    public static int[] getColumn(int[][] arr2D, int c) {
        
        /*
         * The only major (ha) thing to note is the row-major order of arrays in Java
         *      You will have to create a new, separate array to return later
         *      Note that the method is supposed to get the column. Since Java
         *          is row-major, the first array reference is the iterator [i], 
         *          which represents the row, and the second is the column [c]. 
         *      Don't forget to return the result, of course
         *      Note that this method has a precondition from the problem: the 
         *          given column will be a valid column, so no input sanitaton needed
         */

        int[] result = new int[arr2D.length];

        for (int i = 0; i < arr2D.length; i++) {
            result[i] = arr2D[i][c];
        }
        return result;
    }

    public static boolean isLatin(int[][] square) {

        /*
         * This one is tricky if you don't know how methods work nor how 2D arrays work
         *      The first check is pretty straightforward. Note that square[0] is 
         *          an array, the first row
         *      The second check is also straightforward with the provided method.
         *      The third is a little bit tricky. You have to get the column before
         *          checking it against the first row, which makes this one more
         *          complicated than the second check. Note that you use your own
         *          method for this one: you can just trust that the getColumn method
         *          works, even if your implementation is incorrect 
         *      One thing to note is the nature of the hasAllValues method. It only checks
         *          arr1 against arr2, not the other way around. The array containing all 
         *          the elements that must appear in the other, that array must come
         *          first, then the array to be checked is second.
         *      Don't forget to return a value if all the checks pass
         *      Note that this method has a precondition from the problem: all inputs will 
         *          have an equal number of rows and columns, so you don't need to worry
         *          about any input sanitation for that
         */

        if (containsDuplicates(square[0])) return false;
        for (int r = 0; r < square.length; r++) {
            if (!hasAllValues(square[0], square[r])) return false;
        }
        for (int c = 0; c < square[0].length; c++) {
            int[] col = getColumn(square, c);
            if (!hasAllValues(square[0], col)) return false;
        }

        return true;
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
