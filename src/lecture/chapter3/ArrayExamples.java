package lecture.chapter3;

public class ArrayExamples {
    public static void main(String[] args) {

        byte lottoNumberA = 35;
        byte lottoNumberB = 12;
        // ...

        // Byte-Array Deklaration
        byte[] lottoNumbers;

        // Array Initialisierung
        lottoNumbers = new byte[6];

        lottoNumbers[0] = 35;
        lottoNumbers[1] = 12;
        // ...
        lottoNumbers[5] = 7;


        String[] nameList = {"Fritz", "Gabi", "Michael", "Robert"};

        System.out.println("Anzahl der Namen: " + nameList.length);

        System.out.println(nameList[0]);
        System.out.println(nameList[3]);

        char[][] tictactoe = new char[3][3];

        tictactoe[1][1] = 'X';
        tictactoe[0][0] = 'O';

        char[][][] fishTank = new char[10][10][5];

        fishTank[5][2][4] = 'F';

        String[][][] book = new String[5][][];
        System.out.println("Anzahl Kapitel im Buch: " + book.length);

        // Definition Chapter 1
        book[0] = new String[10][];
        System.out.println("Anzahl der Sätze im 1. Kapitel: " + book[0].length);

        // Definition Chatper 1 - Sentence 1
        book[0][0] = new String[6];
        System.out.println("Anzahl Wörter im 1. Satz des 1. Kapitels: " + book[0][0].length);
        // Definition Chatper 1 - Sentence 2
        book[0][1] = new String[4];

        String[][] sentences = {{"Ich", "finde", "Java", "wirklich", "großartig"},{"Es", "gibt", "jetzt", "Pause"}};

        System.out.println(sentences[0][2]);
    }
}
