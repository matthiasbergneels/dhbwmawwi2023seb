package lecture.chapter3;

public class LiteralExamples {

    public static void main(String[] args) {

        // Ganzzahlen-Literale

        int numberA = 5;        // 5 -> literal
        numberA = 42;
        System.out.println(numberA);

        numberA = 017;          // Dezimal -> 15
        System.out.println(numberA);

        numberA = 0x15;         // Dezimal -> 21
        System.out.println(numberA);

        numberA = 0b110;        // Dezimal -> 6
        System.out.println(numberA);

        final int COLOR_CODE_RGD_RED = 0xFF0000;
        System.out.println(COLOR_CODE_RGD_RED);

        byte numberB = 42;

        numberA = 2_000_000_000;

        long numberC = 3_000_000_000L;
        numberC = 3L;

        // Gleitkomma Literale - double
        double numberD = 5.5;   // -> 5.5
        numberD = .5;           // -> 0.5
        numberD = 5.;           // -> 5.0
        numberD = 5D;           // -> 5.0
        numberD = .5e2;         // -> 50.0
        System.out.println(numberD);
        numberD = .5e-2;        // -> 0.005
        System.out.println(numberD);

        float numberF = 5.5F;    // -> 5.5 (float)


        // Boolean Literal
        boolean isTired = true;     // true / false

        // Char-Literal
        char sign = 'a';
        System.out.println(sign);
        sign = '!';
        System.out.println(sign);
        sign = 'T';
        System.out.println(sign);
        sign = 70;
        System.out.println(sign);

        sign = '\'';
        System.out.println(sign);
        sign = '\u2777';
        System.out.println(sign);
        sign = '\u2764';
        System.out.println(sign);

        String myText = "Hallo \\hier \u2764 steht \nein \"toller\" \tText!";
        System.out.println(myText);

        myText = """
                <html>
                    <head>
                    </head>
                    <body>
                        <h1>Das ist ein \"""super HTML Dokument</h1>
                        <p>Mit einem "bombastisch" tollen Text \u2764
                        über ganz viele Zeilen!</p>
                    </body>
                </html>
                """;
        System.out.println(myText);


    }
}
