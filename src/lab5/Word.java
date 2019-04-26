package lab5;

public class Word extends SentenceElement {
    private Letter[] letters;

    public Word(String wordString) {
        char[] chars = wordString.toCharArray();
        letters = new Letter[chars.length];
        for (int i = 0; i < chars.length; i++) {
            letters[i] = new Letter(chars[i]);
        }
    }
}
