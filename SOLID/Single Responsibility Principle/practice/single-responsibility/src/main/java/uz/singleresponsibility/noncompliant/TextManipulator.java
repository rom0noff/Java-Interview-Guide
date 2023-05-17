package uz.singleresponsibility.noncompliant;

public class TextManipulator {
    private String text;

    public TextManipulator(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void appendText(String newText) {
        text = text.concat(newText);
    }

    public String findWordAndReplace(String word, String replacementWord) {
        if (text.contains(word)) {
            text = text.replace(word, replacementWord);
        }
        return text;
    }

    public String findWordAndDelete(String word) {
        if (text.contains(word)) {
            text = text.replace(word, "");
        }
        return text;
    }

    public void printText() {
        System.out.println(getText());
    }

    /**
    * Although this may seem fine, it is not a good example of the SRP.
    * Here we have two responsibilities: manipulating and printing the text.
    * Having a method that prints out text in this class violate the Single Responsibility Principle.
    * For this purpose, we should create another class, which will only handle printing text:
    * */
}
