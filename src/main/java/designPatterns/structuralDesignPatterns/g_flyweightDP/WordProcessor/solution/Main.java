package designPatterns.structuralDesignPatterns.g_flyweightDP.WordProcessor.solution;

public class Main {
    public static void main(String[] args) {
        ILetter letter1= LetterFactory.createLetter('T');
        letter1.display(0, 1);

        ILetter letter2= LetterFactory.createLetter('t'); // pick from the cached map --> reuse the object
        letter1.display(0, 2);

    }
}
