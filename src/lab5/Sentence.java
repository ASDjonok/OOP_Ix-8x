package lab5;

public class Sentence {
    private SentenceElement[] sentenceElements;
    public Sentence(String sentenceString) {
        // todo work with dash and brackets
        String[] sentenceElementsStrings =
                sentenceString.split("(?=[" +
                        Punctuation.punctuationSymbols +
                        "])| ");
        sentenceElements =
                new SentenceElement[sentenceElementsStrings.length];
        for (int i = 0; i < sentenceElementsStrings.length; i++) {
            if (Punctuation.isPunctuationString(sentenceElementsStrings[i])) {
                sentenceElements[i] = new Punctuation(sentenceElementsStrings[i]);
            } else {
                sentenceElements[i] = new Word(sentenceElementsStrings[i]);
            }
        }
    }
}
