import java.util.Scanner;

public class domotica {

    //variables globals 
    static String lights, h1L = "OFF", h2L = "OFF", h3L = "OFF", kitchenL = "OFF", livingromL = "OFF", bathroomL = "OFF", lightsState = "OFF";
    static String doors, h1D = "CLOSED", h2D = "CLOSED", h3D = "CLOSED", kitchenD = "CLOSED", livingromD = "CLOSED", bathroomD = "CLOSED", doorsState = "CLOSED";
    static double h1T = 25.0, h2T = 25.0, h3T = 25.0, kitchenT = 25.0, livingroomT = 25.0, bathroomT = 25.0;
    static String heating, h1H = "OFF", h2H = "OFF", h3H = "OFF", kitchenH = "OFF", livingroomH = "OFF", bathroomH = "OFF";
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
                case 3:
                    heating(sc);
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
                String onOff = sc.next().toUpperCase();
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
                showStateL();
                break;
            case "d":
                break;
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
        String onOff = sc.next().toUpperCase();

        h1L = onOff;
        h2L = onOff;
        h3L = onOff;
        livingromL = onOff;
        kitchenL = onOff;
        bathroomL = onOff;

        System.out.println("All lights turned "  + onOff + "  correctly.");
    }

    public static void showStateL() {
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

                System.out.println("Write OPEN/CLOSE");
                String openClose = sc.next().toUpperCase();
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
                
            if (!roomName.isEmpty()) controlDoors(roomName, openClose);
                break;

            case "b":
                controlAllD(sc);
                break;
            case "c":
                showStateD();
                break;
            case "d":
                break;
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

    public static void controlAllD (Scanner sc) {
        System.out.println("Write OPEN/CLOSE to switch all rooms");
        String openClose = sc.next().toUpperCase();

        h1D = openClose;
        h2D = openClose;
        h3L = openClose;
        livingromD = openClose;
        kitchenD = openClose;
        bathroomD = openClose;

        System.out.println("All doors are "  + openClose);
    }
    public static void showStateD() {
        System.out.println("State of the doors:");
        System.out.println("H1 ("  + h1D + ")");
        System.out.println("H2 ("  + h2D + ")");
        System.out.println("H3 ("  + h3D + ")");
        System.out.println("Livingroom ("  + livingromD + ")");
        System.out.println("Kitchen ("  + kitchenD + ")");
        System.out.println("Bathroom ("  + bathroomD + ")");
    }
    public static void heating(Scanner sc) {
        System.out.println("----Heating control----");
        System.out.println("a. Set temperature of a room");
        System.out.println("b. Turn ON/OFF heating of a room");
        System.out.println("c. Show the current temperature and heating state");
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

                System.out.println("Enter desired temperature (°C):");
                double temp = sc.nextDouble();
                sc.nextLine();
                setTemperature(roomSelect, temp);
            break;

            case "b":
                System.out.println("----Select a room----");
                System.out.println("i. H1");
                System.out.println("ii. H2");
                System.out.println("iii. H3");
                System.out.println("iv. Kitchen");
                System.out.println("v. Living Room");
                System.out.println("vi. Bathroom");
                roomSelect = sc.nextLine();

                System.out.println("Write ON/OFF:");
                String onOff = sc.next().toUpperCase();
                sc.nextLine();
                controlHeating(roomSelect, onOff);
            break;

            case "c":
                showHeatingState();
            break;

            case "d":
            break;
        }
    }
    public static void setTemperature(String roomSelect, double temp) {
        switch (roomSelect) {
            case "i": 
                h1T = temp; 
            break;

            case "ii": 
                h2T = temp; 
            break;

            case "iii": 
                h3T = temp; 
            break;

            case "iv": 
                kitchenT = temp; 
            break;

            case "v": 
                livingroomT = temp; 
            break;

            case "vi": 
                bathroomT = temp; 
            break;

            default: System.out.println("Invalid room"); return;
        }
        System.out.println("Temperature set successfully.");
    }
    public static void controlHeating(String roomSelect, String onOff) {
        switch (roomSelect) {
            case "i": 
                h1H = onOff; 
            break;

            case "ii": 
                h2H = onOff; 
            break;

            case "iii": 
                h3H = onOff; 
            break;

            case "iv": 
                kitchenH = onOff; 
            break;

            case "v": 
                livingroomH = onOff; 
            break;

            case "vi": 
                bathroomH = onOff; 
            break;

            default: 
                System.out.println("Invalid room"); 
            break;
        }
        System.out.println("Heating of selected room is now " + onOff + ".");
    }
    public static void showHeatingState() {
        System.out.println("---- Heating Status ----");
        System.out.println("H1: " + h1T + "°C (" + h1H + ")");
        System.out.println("H2: " + h2T + "°C (" + h2H + ")");
        System.out.println("H3: " + h3T + "°C (" + h3H + ")");
        System.out.println("Kitchen: " + kitchenT + "°C (" + kitchenH + ")");
        System.out.println("Living Room: " + livingroomT + "°C (" + livingroomH + ")");
        System.out.println("Bathroom: " + bathroomT + "°C (" + bathroomH + ")");
    }
}