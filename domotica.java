import java.util.Scanner;

public class domotica {

    //variables globals 
    static String lights, h1L = "OFF", h2L = "OFF", h3L = "OFF", kitchenL = "OFF", livingromL = "OFF", bathroomL = "OFF", lightsState = "OFF";
    static boolean doors = false;
    static boolean heating = false;
    static boolean music = false;
    static boolean menuInicial = true;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    
        do {
        
            System.out.println("---- Domotica ----");
            System.out.println("1. Lights");
            System.out.println("2. Intelligent Doors");
            System.out.println("3. Heating");
            System.out.println("4. Music System");
            System.out.println("5. Quit");
            int select = sc.nextInt();
            sc.nextLine();

            switch (select) {
                case 1:
                    lights(sc);
                break;      
        }
        }
        while (menuInicial); {
        }
    }
    public static void lights(Scanner sc){
        System.out.println("----Lights control----");
        System.out.println("a. Control a room");
        System.out.println("b. Control all rooms");
        System.out.println("c. Show the real state of the lights");
        System.out.println("d. Exit");

        switch (sc.nextLine()) {
            case "a":
                System.out.println("----Select a room----");
                System.out.println("i. H1");
                System.out.println("ii. H2");
                System.out.println("iii. H3");
                System.out.println("iv. Kitchen");
                System.out.println("v. Living Room");
                System.out.println("vi. Bathroom");
                String roomSelect = sc.nextLine();

                System.out.println("Write ON/OFF");
                String onOff = sc.next().toLowerCase();
                String roomName = "";

                switch (roomSelect) {
                    case "i":
                        roomName = "H1";
                        break;
                    case "ii":
                        roomName = "H2";
                        break;
                    case "iii":
                        roomName = "H3";
                        break;
                    case "iv":
                        roomName = "Kitchen";
                        break;
                    case "v":
                        roomName = "Livingroom";
                        break;
                    case "vi":
                        roomName = "Bathroom";
                        break;
                    default:
                        
                }
                    controlStatus(roomName, onOff);
        }

    }       
    public static void controlStatus(String room, String onOff) {

        switch (room) {
            case "H1":
                if (h1L.equals(onOff)) {
                    System.out.println("La llum de " + room + " ja està " + onOff + ".");
                } else {
                    h1L = onOff;
                    System.out.println("La llum de " + room + " s'ha posat " + onOff + " correctament.");
                }
                break;
            
            case "H2":
                if (h2L.equals(onOff)) {
                    System.out.println("La llum de " + room + " ja està " + onOff + ".");
                } else {
                    h2L = onOff;
                    System.out.println("La llum de " + room + " s'ha posat " + onOff + " correctament.");
                }
                break;
            
            case "H3":
                if (h3L.equals(onOff)) {
                    System.out.println("La llum de " + room + " ja està " + onOff + ".");
                } else {
                    h3L = onOff;
                    System.out.println("La llum de " + room + " s'ha posat " + onOff + " correctament.");
                }
                break;
            
            case "Livingroom":
                if (livingromL.equals(onOff)) {
                    System.out.println("La llum del " + room + " ja està " + onOff + ".");
                } else {
                    livingromL = onOff;
                    System.out.println("La llum del " + room + " s'ha posat " + onOff + " correctament.");
                }
                break;

            case "Kitchen":
                if (kitchenL.equals(onOff)) {
                    System.out.println("La llum de la " + room + " ja està " + onOff + ".");
                } else {
                    kitchenL = onOff;
                    System.out.println("La llum de la " + room + " s'ha posat " + onOff + " correctament.");
                }
                break;
            
            case "Bathroom":
                if (bathroomL.equals(onOff)) {
                    System.out.println("La llum de la " + room + " ja està " + onOff + ".");
                } else {
                    bathroomL = onOff;
                    System.out.println("La llum de la " + room + " s'ha posat " + onOff + " correctament.");
                }
                break;
        }
    }
}