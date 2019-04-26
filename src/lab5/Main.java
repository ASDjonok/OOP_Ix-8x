package lab5;

public class Main {
    public static void main(String[] args) {
        Text text = new Text("Hello World! I am student.");
        Object object = text;

        if (text instanceof Object) {
            System.out.println("YUHU!!!!");
        }

        /*text.myMethod();
//        ((Text) object).myMethod();
        object.myMethod();
        text.myField = 1;
        object.myField = 1;

        object = new String("ASD");
        text = "ASD";

        object = new Boolean(true);*/

        System.out.println("Done!");
        String punctuationSymbols = Punctuation.punctuationSymbols;
    }
}
