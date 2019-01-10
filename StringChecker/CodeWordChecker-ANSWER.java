/*
 * IMO the most difficult problem on the test due to size and concepts
 *      The problem states that CodeWordChecker is a StringChecker. They further
 *          employ polymorphism when they create "new CodeWordChecker" objects but
 *          declare sc1 and sc2 as Stringcheckers. Do NOT forget to add StringChecker
 *          to the class declaration (first line of code). Also note that StringChecker 
 *          is an interface, not an abstract class. StringChecker must be implemented
 *          rather than extended from.
 *      Note that we need two separate constructors; we are overriding them.
 *          Each must be named the exact same thing but have different 
 *          parameters, and the body of each constructor must be different
 *          to fit the requirements of each constructor
 *      Since CodeWordChecker is a StringChecker, the method isValid() needs to be 
 *          implemented. isValid must match exactly what it is declared as in the
 *          StringClass: it returns a boolean and accepts only one argument, that 
 *          being the code word String. The "@Override" annotation is optional, but 
 *          it's generally good practice to include it to indicate inheritance. 
 *      Note that only one isValid() method wil be implemented, despite two 
 *          constructors. You need to make sure that no matter which constructor is 
 *          called, isValid will still work. 
 *      Also note that the problem asks for default min and max values should
 *          none be provided. This is set in the same line as the declarations.
 *          You can also set them in the second constructor; either is fine
 *      As you are responsible for the entire class, variable names don't 
 *          actually matter as long as they work. However, you will need
 *          three variables saved as class fields that will be accessed in
 *          the isValid implementation
 *      The implementation of isValid should not be too hard as it only
 *          requires basic String checking. Note that there must be a 
 *          "return true" at the end if all the fail checks don't trigger.
 *          Also note that the code word is a case-sensitive String; you
 *          don't have to anything fancy manipulating the input any way.
 */

public class CodeWordChecker implements StringChecker {

    private int minLength = 6;
    private int maxLength = 20;
    private String blacklist;

    public CodeWordChecker(int min, int max, String bad) {
        minLength = min;
        maxLength = max;
        blacklist = bad;
    }

    public CodeWordChecker(String bad) {
        blacklist = bad;
    }

    @Override
    public boolean isValid(String codeWord) {
        if (codeWord.length() < minLength) return false;
        if (codeWord.length() > maxLength) return false;
        if (codeWord.contains(blacklist)) return false;
        return true;
    }

}
