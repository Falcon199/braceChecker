package braceChecker;

public class BraceCheckerTest {

    public static void main(String[] args) {
        BraceChecker braceChecker = new BraceChecker(
                "(H{e[llo Java}");
        braceChecker.check();
    }
}
