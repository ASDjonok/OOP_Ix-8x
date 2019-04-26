package lab5;

public class Punctuation extends SentenceElement {
    static final String punctuationSymbols = "!.?,;:";
    private String punctuationsString;

    public Punctuation(String punctuationsString) {
        this.punctuationsString = punctuationsString;
    }

    static boolean isPunctuationString(String s) {
        return punctuationSymbols.contains(s);
    }
}
