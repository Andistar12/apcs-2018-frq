import java.util.ArrayList;

public class WordPairList {

    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {

        // TODO TEST PROBLEM

    }

    public int numMatches() {
        
        // TODO TEST PROBLEM
    
    }

/* Everything below this point is not on the test but implements examples
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
