package lecture.chapter4;

public class LoopExamples {

    public static void main(String[] args) {

        int counter = 0;

        System.out.println("Zählen mit While-Schleife (Kopfgesteuert):");
        while(counter < 10){
            if(counter == 6){
                System.out.println("Zahl des Teufels!!!");
                break;              // unterbricht die gesamte Schleife!
            }
            System.out.println(counter);
            counter++;
        }

        System.out.println("Nach der Schleife!");

        System.out.println("Zählen mit Do-While-Schleife (Fußgesteuert):");
        counter = 0;
        do {
            if(counter % 2 != 0){
                System.out.println("Ungerade Zahlen sind doof!");
                counter++;
                continue;           // unterbricht den aktuellen Schleifen-Durchlauf
            }
            System.out.println(counter);
            counter++;
        }while(counter < 10);

        System.out.println("Zählen mit For-Schleife (Zählergesteuert):");
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        System.out.println("Runter Zählen in 2er Schritten mit For-Schleife (Zählergesteuert):");
        for(counter = 10; counter >= 0; counter=counter-2){
            System.out.println(counter);
        }


        System.out.println("Timmmmmmeeeeyyyyy-Schleife:");
        counter = 0;
        for(;;){
            if(counter >= 10){
                break;
            }

            System.out.println(counter);
            counter++;
        }

        String[] names = {"Klaus", "Gabi", "Fritz", "Selma", "Robert", "Zeus", "Michael"};

        System.out.println("Array loop mit For-Schleife:");
        for(int i = 0; i < names.length; i++){
            if(names[i].equals("Robert")){
                names[i] = "Idiot";             // <-- nachhaltige Änderung im Array!
            }
            System.out.println("Name: " + names[i]);
        }

        System.out.println("Array loop mit For-Each-Schleife:");
        for(String name : names){
            if(name.equals("Robert")){
                // System.out.println("Idiot");
                name = "Idiot";                 // <-- keine nachhaltige Änderung im Array!
                // continue;
            }
            System.out.println("Name: " + name);
        }

        System.out.println("Array loop mit For-Each-Schleife:");
        for(String name : names){
            System.out.println("Name: " + name);
        }

    }
}
