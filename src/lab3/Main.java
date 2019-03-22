package lab3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StringBuffer stringBuffer =
                new StringBuffer("Hello! I am happy!");
        stringBuffer.length();
        int indexDelimiter = stringBuffer.indexOf("!");
        ArrayList<StringBuffer> sentences = new ArrayList();
        String sentence = stringBuffer.substring(0,
                indexDelimiter);
        sentences.add(new StringBuffer(sentence));
        StringBuffer x = sentences.get(0);
        System.out.println(x);
        System.out.println(x.length());
    }
}
