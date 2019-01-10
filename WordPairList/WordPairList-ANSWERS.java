import java.util.ArrayList;

public class WordPairList {

    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {
        /*
         * ArrayLists are all you need to know, really
         *      Note that the allPairs ArrayList isn't actually initialized. Therefore
         *          you have the responsibility to do that.
         *      You will need two NESTED for loops. They use the iterator variables
         *          i and j in the problem, so I did the same
         *      A (j > i) check must be present as asked of the problem. The for loops
         *          manage the other bounds automatically (>= 0, < words.length). Note 
         *          that j can start at 1 or 0, it doesn't actually matter
         *      You'll have to create a new WordPair object. I created a separate object
         *          wp for mine, but you don't really have to
         *      You'll have to add it to the pre-existing allPairs array (ArrayList to be
         *          exact). Note that since the allPairs variable is in the same class
         *          as this method, you can just directly use it without any other
         *          dot notation. 
         */
       
        allPairs = new ArrayList<WordPair>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 1; j < words.length; j++) {
                if (j > i) {
                    WordPair wp = new WordPair(words[i], words[j]);
                    allPairs.add(wp);
                }
            }
        }
    }

    public int numMatches() {

        /*
         * The key to this problem is taking advantage of the WordPair class. Otherwise, EZ
         *      You'll need a running total. You'll also need to iterate through the allPairs
         *          array. I am using an enhanced for loop, but you can always do the usual
         *          for (int i = 0; i < allPairs.size(); i++)
         *          Enhanced for loops are perfectly acceptable on the test, and some 
         *          multiple choice problems may even expect you to be familiar with it
         *      You must recognize that allPairs saves WordPairs, not pairs of words. WordPairs
         *          is an object representing pairs of words, and it has .getFirst() and .getSecond()
         *          variable getter methods that you must use.
         *      Note that == does NOT work with Strings. You must use the .equals() method
         *      Don't forget to return your running total. That's the whole point of this method
         */

        int total = 0;
        for (WordPair wp : allPairs) {
            if (wp.getFirst().equals(wp.getSecond())) 
                total++;
        }

        return total;
    }

/* Everything below this point is not on the test but implements methods
 * It also makes this file runnable */

    public ArrayList<WordPair> getPairs() {
        return allPairs;
    }

    public static void main(String args[]) {

        WordPairList exampleOne = new WordPairList(new String[]{"one", "two", "three"});
        WordPairList exampleTwo = new WordPairList(new String[]{"the", "more", "the", "merrier"});
        WordPairList exampleThree = new WordPairList(new String[]{"the", "red", "fox", "the", "red"});

        // Example one
        System.out.println("Example one: {'one', 'two', 'three'}");
        for (WordPair wp : exampleOne.getPairs()) {
            System.out.print(wp.toString() + " ");
        }
        System.out.println();

        // Example two
        System.out.println("Example two: {'the', 'more', 'the', 'merrier'}");
        for (WordPair wp : exampleTwo.getPairs()) {
            System.out.print(wp.toString() + " ");
        }
        System.out.println();

        // Example three
        System.out.println("Example three: {'the', 'red', 'fox', 'the', 'red'}");
        System.out.println("Running numMatches() method. Expecting 2, got " + exampleThree.numMatches());
        
    }
}

class WordPair {

    private String firstWord;
    private String secondWord;

    public WordPair(String first, String second) {
        firstWord = first;
        secondWord = second;
    }

    public String getFirst() {
        return firstWord;
    }

    public String getSecond() {
        return secondWord;
    }

    @Override
    public String toString() {
        return "(" + firstWord + ", " + secondWord + ")";
    }

}
