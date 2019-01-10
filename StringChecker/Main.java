public class Main {

    public static void main(String args[]) {
        
        StringChecker sc1 = new CodeWordChecker(5, 8, "$");
        StringChecker sc2 = new CodeWordChecker("pass");

        System.out.println("Checking StringChecker sc1");
        System.out.println("Checking 'happy'. Expecting true, got " + sc1.isValid("happy"));
        System.out.println("Checking 'happy$'. Expecting true, got " + sc1.isValid("happy$"));
        System.out.println("Checking 'Code'. Expecting true, got " + sc1.isValid("Code"));
        System.out.println("Checking 'happyCode'. Expecting true, got " + sc1.isValid("happyCode"));

        System.out.println("Checking StringChecker sc2");
        System.out.println("Checking 'MyPass'. Expecting true, got " + sc2.isValid("MyPass"));
        System.out.println("Checking 'Mypassport'. Expecting true, got " + sc2.isValid("Mypassport"));
        System.out.println("Checking 'happy'. Expecting true, got " + sc2.isValid("happy"));
        System.out.println("Checking '1,000,000,000,000,000'. Expecting true, got " + sc2.isValid("1,000,000,000,000,000"));
    }

}

