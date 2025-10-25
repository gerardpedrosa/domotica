import java.util.Scanner;

public class domotica {

    //variables globals 
    static String lights, h1L = "OFF", h2L = "OFF", h3L = "OFF", kitchenL = "OFF", livingromL = "OFF", bathroomL = "OFF", lightsState = "OFF";
    static String doors, h1D = "CLOSED", h2D = "CLOSED", h3D = "CLOSED", kitchenD = "CLOSED", livingromD = "CLOSED", bathroomD = "CLOSED", doorsState = "CLOSED";
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
            System.out.println("5. Exit");
            int select = sc.nextInt();
            sc.nextLine();

            switch (select) {
                case 1:
                    lights(sc);
                break;
                case 2:
                    doors(sc);
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
                    System.out.println("Invalid room");
                    break;
                }

            if (!roomName.isEmpty()) controlStatus(roomName, onOff);
                break;

            case "b":
                controlAllL(sc);
                break;
            case "c":
                showState();
                break;
            case "d":
            return;
        }

    }       
    public static void controlStatus(String room, String onOff) {

        switch (room) {
            case "H1":
                if (h1L.equals(onOff)) {
                    System.out.println("The light of " + room + " is currently " + onOff + ".");
                } else {
                    h1L = onOff;
                    System.out.println("The light of " + room + " is now " + onOff + ".");
                }
                break;
            
            case "H2":
                if (h2L.equals(onOff)) {
                    System.out.println("The light of " + room + " is currently " + onOff + ".");
                } else {
                    h2L = onOff;
                    System.out.println("The light of " + room + " is now " + onOff + ".");
                }
                break;
            
            case "H3":
                if (h3L.equals(onOff)) {
                    System.out.println("The light of " + room + " is currently " + onOff + ".");
                } else {
                    h3L = onOff;
                    System.out.println("The light of " + room + " is now " + onOff + ".");
                }
                break;
            
            case "Livingroom":
                if (livingromL.equals(onOff)) {
                    System.out.println("The light ofl " + room + " is currently " + onOff + ".");
                } else {
                    livingromL = onOff;
                    System.out.println("The light ofl " + room + " is now " + onOff + ".");
                }
                break;

            case "Kitchen":
                if (kitchenL.equals(onOff)) {
                    System.out.println("The light of " + room + " is currently " + onOff + ".");
                } else {
                    kitchenL = onOff;
                    System.out.println("The light of " + room + " is now " + onOff + ".");
                }
                break;
            
            case "Bathroom":
                if (bathroomL.equals(onOff)) {
                    System.out.println("The light of " + room + " is currently " + onOff + ".");
                } else {
                    bathroomL = onOff;
                    System.out.println("The light of " + room + " is now " + onOff + ".");
                }
                break;
        }
    }
    public static void controlAllL (Scanner sc) {
        System.out.println("Write on/off to switch all rooms");
        String onOff = sc.next().toLowerCase();

        h1L = onOff;
        h2L = onOff;
        h3L = onOff;
        livingromL = onOff;
        kitchenL = onOff;
        bathroomL = onOff;

        System.out.println("All lights turned "  + onOff + "  correctly.");
    }
    public static void showState() {
        System.out.println("State of the lights:");
        System.out.println("H1 ("  + h1L + ")");
        System.out.println("H2 ("  + h2L + ")");
        System.out.println("H3 ("  + h3L + ")");
        System.out.println("Livingroom ("  + livingromL + ")");
        System.out.println("Kitchen ("  + kitchenL + ")");
        System.out.println("Bathroom ("  + bathroomL + ")");
    }
    public static void doors(Scanner sc) {
        System.out.println("----Doors control----");
        System.out.println("a. Control a room door");
        System.out.println("b. Control all doors");
        System.out.println("c. Show the real state of the doors");
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

                System.out.println("Write OPEN/CLOSED");
                String openClose = sc.next().toLowerCase();
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
                    System.out.println("Invalid room");
                    break;
                }
    
                controlDoors(roomName, openClose);
        }     
    }
    public static void controlDoors(String room, String openClose) {

        switch (room) {
            case "H1":
                if (h1L.equals(openClose)) {
                    System.out.println("The door of " + room + " is currently " + openClose + ".");
                } else {
                    h1L = openClose;
                    System.out.println("The door of " + room + " is now " + openClose + ".");
                }
                break;
            
            case "H2":
                if (h2L.equals(openClose)) {
                    System.out.println("The door of " + room + " is currently " + openClose + ".");
                } else {
                    h2L = openClose;
                    System.out.println("The door of " + room + " is now " + openClose + ".");
                }
                break;
            
            case "H3":
                if (h3L.equals(openClose)) {
                    System.out.println("The door of " + room + " is currently " + openClose + ".");
                } else {
                    h3L = openClose;
                    System.out.println("The door of " + room + " is now " + openClose + ".");
                }
                break;
            
            case "Livingroom":
                if (livingromL.equals(openClose)) {
                    System.out.println("The door of " + room + " is currently " + openClose + ".");
                } else {
                    livingromL = openClose;
                    System.out.println("The door of " + room + " is now " + openClose + ".");
                }
                break;

            case "Kitchen":
                if (kitchenL.equals(openClose)) {
                    System.out.println("The door of " + room + " is currently " + openClose + ".");
                } else {
                    kitchenL = openClose;
                    System.out.println("The door of " + room + " is now " + openClose + ".");
                }
                break;
            
            case "Bathroom":
                if (bathroomL.equals(openClose)) {
                    System.out.println("The door of " + room + " is currently " + openClose + ".");
                } else {
                    bathroomL = openClose;
                    System.out.println("The door of " + room + " is now " + openClose + ".");
                }
                break;
        }
    }
}
