package uz.singleresponsibility.compliant;

import uz.singleresponsibility.noncompliant.TextManipulator;

import java.util.Arrays;

public class TextPrinter {
    TextManipulator textManipulator;

    public TextPrinter(TextManipulator textManipulator) {
        this.textManipulator = textManipulator;
    }

    public void printText() {
        System.out.println(textManipulator.getText());
    }

    public void printOutEachWordOfText() {
        System.out.println(Arrays.toString(textManipulator.getText().split(" ")));
    }

    public void printRangeOfCharacters(int startingIndex, int endIndex) {
        System.out.println(textManipulator.getText().substring(startingIndex, endIndex));
    }
    /**
     * Now, in this class, we can create methods for as many
     * variations of printing text as we want, because that's its job.
     *
     * */
}
