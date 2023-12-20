package lecture.chapter4;

public class SwitchCaseExample {

    public static void main(String[] args) {

        int grade = 2;

        switch(grade){
            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befriedigend");
                break;
            case 4:
                System.out.println("Ausreichend");
                break;
            case 5:
                System.out.println("Ungenügend");
                break;
            default:
                System.out.println("Ungültige Note!");
        }


        int speed = 49;
        switch(speed){
            case 1: case 2: case 3:
            case 30:
                System.out.println("Das ist ziemlich lahm!");
                break;
            case 48: case 49:
            case 50:
                System.out.println("So fährt man anständig!");
                break;
            case 70:
                System.out.println("Schon etwas zu schnell");
                break;
            case 100:
                System.out.println("Das ist zu schnell!");
                System.out.println("Jetzt ist der Führerschein weg!");
        }


        String gradeDescription = switch(grade){
            case 1 -> "Sehr gut";
            case 2 -> "Gut";
            case 3 -> "Befriedigend";
            case 4 -> "Ausreichend";
            case 5 -> "Ungenügend";
            default -> "Ungültige Note";
        };
        System.out.println(gradeDescription);

        gradeDescription = switch(grade){
            case 1, 2, 3, 4 -> "Bestanden";
            case 5 -> "Durchgefallen";
            default -> "Ungültige Note";
        };
        System.out.println(gradeDescription);


        System.out.println("Ende");



    }
}
