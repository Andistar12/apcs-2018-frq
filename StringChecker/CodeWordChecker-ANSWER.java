/*
 * IMO the most difficult problem on the test due to size and concepts
 *      Note that StringChecker is an interface. Not only does it need to
 *          be "implemented," but the method isValid() also needs to be 
 *          implemented. The @Override is optional technically, but it's 
 *          good practice to include it to indicate.
 *      Note that we have two separate constructors; we are overriding it.
 *          Each must be named the exact same thing but have different 
 *          parameters, and the body of each constructor must be different
 *      Also note that the problem asks for default min and max values should
 *          none be provided. This is set in the same line as the declarations.
 *          You can also set them in the second constructor; either is fine
 *      As you are responsible for the entire class, variable names don't 
 *          actually matter as long as they are present. However, you will need
 *          three variables saved as class fields that will be accessed in
 *          the isValid implementation
 *      The implementation of isValid should not be too hard as it only
 *          requires basic String checking. Note that there must be a 
 *          "return true" at the end if all the fail checks don't trigger.
 *          Also note that the code word String is case sensitive.
 *      
 *      Note that there is only one isValid method even though there
 *          are two constructors. Regardless of which constructor is called,
 *          the same isValid method will be called and must be 
 *      If you look at the problem, you may notice polymorphism used: sc1 and
 *          sc2 create CodeWordChecker objects but declare them only as 
 *          StringCheckers. This makes the StringChecker implementation
 *          the most important aspect of this problem
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
