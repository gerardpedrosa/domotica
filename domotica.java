import java.util.Scanner;


public class domotica {

    //variables globals

    //lights
    static String lights, h1L = "OFF", h2L = "OFF", h3L = "OFF", kitchenL = "OFF", livingroomL = "OFF", bathroomL = "OFF", lightsState = "OFF";
    
    //doors
    static String doors, h1D = "CLOSED", h2D = "CLOSED", h3D = "CLOSED", kitchenD = "CLOSED", livingroomD = "CLOSED", bathroomD = "CLOSED", doorsState = "CLOSED";
    
    //heating
    static double h1T = 25.0, h2T = 25.0, h3T = 25.0, kitchenT = 25.0, livingroomT = 25.0, bathroomT = 25.0;
    static String heating, h1H = "OFF", h2H = "OFF", h3H = "OFF", kitchenH = "OFF", livingroomH = "OFF", bathroomH = "OFF";
   
    //music
    static double h1V = 0, h2V = 0, h3V = 0, kitchenV = 0, livingroomV = 0, bathroomV = 0;
    static String music, h1M = "OFF", h2M = "OFF", h3M = "OFF", kitchenM = "OFF", livingroomM = "OFF", bathroomM = "OFF", musicState = "OFF";
    
    //others
    static boolean menuInicial = true;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    
    
    //menu inicial
        do {
        
            System.out.println("---- Domotica ----");
            System.out.println("1. Lights");
            System.out.println("2. Intelligent Doors");
            System.out.println("3. Heating");
            System.out.println("4. Music System");
            System.out.println("5. Exit");
            int select = readIntInRange(sc, "Select an option:", 1, 5);

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

                case 4:
                    music(sc);
                break;

                case 5:
                    menuInicial = false;
                break;

                default:
                    System.out.println("Invalid option. Please select a valid option.");}
            }
        while (menuInicial);
    }

    //menu lights
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

                String onOff = readState(sc, "Write ON/OFF:", "ON", "OFF");
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

    //metodes lights
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
                if (livingroomL.equals(onOff)) {
                    System.out.println("The light of " + room + " is currently " + onOff + ".");
                } else {
                    livingroomL = onOff;
                    System.out.println("The light of " + room + " is now " + onOff + ".");
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
        String onOff = readState(sc, "Write ON/OFF to switch all rooms:", "ON", "OFF");

        h1L = onOff;
        h2L = onOff;
        h3L = onOff;
        livingroomL = onOff;
        kitchenL = onOff;
        bathroomL = onOff;

        System.out.println("All lights turned "  + onOff + "  correctly.");
    }

    public static void showStateL() {
        System.out.println("State of the lights:");
        System.out.println("H1 ("  + h1L + ")");
        System.out.println("H2 ("  + h2L + ")");
        System.out.println("H3 ("  + h3L + ")");
        System.out.println("Livingroom ("  + livingroomL + ")");
        System.out.println("Kitchen ("  + kitchenL + ")");
        System.out.println("Bathroom ("  + bathroomL + ")");
    }
    
    //menu doors
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

                String openClose = readState(sc, "Write OPEN/CLOSE:", "OPEN", "CLOSE");
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

    //metodes doors
    public static void controlDoors(String room, String openClose) {

        switch (room) {
            case "H1":
                if (h1D.equals(openClose)) {
                    System.out.println("The door of " + room + " is currently " + openClose + ".");
                } else {
                    h1D = openClose;
                    System.out.println("The door of " + room + " is now " + openClose + ".");
                }
                break;
            
            case "H2":
                if (h2D.equals(openClose)) {
                    System.out.println("The door of " + room + " is currently " + openClose + ".");
                } else {
                    h2D = openClose;
                    System.out.println("The door of " + room + " is now " + openClose + ".");
                }
                break;
            
            case "H3":
                if (h3D.equals(openClose)) {
                    System.out.println("The door of " + room + " is currently " + openClose + ".");
                } else {
                    h3D = openClose;
                    System.out.println("The door of " + room + " is now " + openClose + ".");
                }
                break;
            
            case "Livingroom":
                if (livingroomD.equals(openClose)) {
                    System.out.println("The door of " + room + " is currently " + openClose + ".");
                } else {
                    livingroomD = openClose;
                    System.out.println("The door of " + room + " is now " + openClose + ".");
                }
                break;

            case "Kitchen":
                if (kitchenD.equals(openClose)) {
                    System.out.println("The door of " + room + " is currently " + openClose + ".");
                } else {
                    kitchenD = openClose;
                    System.out.println("The door of " + room + " is now " + openClose + ".");
                }
                break;
            
            case "Bathroom":
                if (bathroomD.equals(openClose)) {
                    System.out.println("The door of " + room + " is currently " + openClose + ".");
                } else {
                    bathroomD = openClose;
                    System.out.println("The door of " + room + " is now " + openClose + ".");
                }
                break;
        }
    }
    public static void controlAllD (Scanner sc) {
        String openClose = readState(sc, "Write OPEN/CLOSE to switch all rooms:", "OPEN", "CLOSE");

        h1D = openClose;
        h2D = openClose;
        h3D = openClose;
        livingroomD = openClose;
        kitchenD = openClose;
        bathroomD = openClose;

        System.out.println("All doors are "  + openClose);
    }
    public static void showStateD() {
        System.out.println("State of the doors:");
        System.out.println("H1 ("  + h1D + ")");
        System.out.println("H2 ("  + h2D + ")");
        System.out.println("H3 ("  + h3D + ")");
        System.out.println("Livingroom ("  + livingroomD + ")");
        System.out.println("Kitchen ("  + kitchenD + ")");
        System.out.println("Bathroom ("  + bathroomD + ")");
    }

    //menu heating
    public static void heating(Scanner sc) {
        System.out.println("----Heating control----");
        System.out.println("a. Set temperature of a room");
        System.out.println("b. Turn ON/OFF heating of a room");
        System.out.println("c. Show the current temperature and heating state");
        System.out.println("d. Automatizate heating");
        System.out.println("e. Exit");

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

                double temp = readDoubleInRange(sc, "Enter desired temperature (°C) [10.0 - 35.0]:", 10.0, 35.0);
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

                String onOff = readState(sc, "Write ON/OFF:", "ON", "OFF");
                controlHeating(roomSelect, onOff);

            break;

            case "c":
                showHeatingState();
            break;

            case "d":
                automatizateHeating();
            break;

            case "e":
            break;
        }
    }

    //metodes heating
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

    public static void automatizateHeating() {
    System.out.println("---- Automatic Heating Control ----");
    System.out.println("Select a room:");
    System.out.println("i. H1");
    System.out.println("ii. H2");
    System.out.println("iii. H3");
    System.out.println("iv. Kitchen");
    System.out.println("v. Living Room");
    System.out.println("vi. Bathroom");
    String roomSelect = sc.nextLine();

    System.out.print("Enter the hour when you want to change the temperature (0 - 23): ");
    int targetHour = sc.nextInt();
    sc.nextLine();

    if (targetHour < 0 || targetHour > 23) {
        System.out.println("Invalid hour. It must be between 0 and 23.");
        return;
    }

    System.out.print("Enter the new desired temperature (°C) [10.0 - 35.0]: ");
    double newTemp = sc.nextDouble();
    sc.nextLine();

    if (newTemp < 10.0 || newTemp > 35.0) {
        System.out.println("Invalid temperature. Must be between 10.0 and 35.0 °C.");
        return;
    }

    System.out.println("Simulating time passing...");

    for (int hour = 0; hour < 24; hour++) {
        System.out.println("Current hour: " + hour);

        if (hour == targetHour) {
            System.out.println("Automatically adjusting temperature...");

            switch (roomSelect) {
                case "i":
                    h1T = newTemp;
                    break;
                case "ii":
                    h2T = newTemp;
                    break;
                case "iii":
                    h3T = newTemp;
                    break;
                case "iv":
                    kitchenT = newTemp;
                    break;
                case "v":
                    livingroomT = newTemp;
                    break;
                case "vi":
                    bathroomT = newTemp;
                    break;
                default:
                    System.out.println("Invalid room.");
                    return;
            }

            System.out.println("Temperature successfully adjusted to " + newTemp + "°C.");
            break;
        }
        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
    //menu music
    public static void music(Scanner sc) {
        System.out.println("---- Music Control ----");
        System.out.println("a. Set volume of a room");
        System.out.println("b. Turn ON/OFF music in a room");
        System.out.println("c. Show volume and music state in all rooms");
        System.out.println("d. Sync all room volumes to Livingroom volume");
        System.out.println("e. Exit");

        String option = sc.nextLine();

        switch (option) {
            case "a":
                System.out.println("----Select a room----");
                System.out.println("i. H1");
                System.out.println("ii. H2");
                System.out.println("iii. H3");
                System.out.println("iv. Kitchen");
                System.out.println("v. Living Room");
                System.out.println("vi. Bathroom");
                String roomSelect = sc.nextLine();

                double volume = readDoubleInRange(sc, "Enter desired volume (0–100):", 0.0, 100.0);
                setVolume(roomSelect, volume);
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

                String state = readState(sc, "Write ON/OFF:", "ON", "OFF");
                controlRoomMusic(roomSelect, state);

            break;

            case "c":
                showMusicState();
            break;

            case "d":
                syncMusicVolumes();
            break;

            case "e":
            break;

            default:
                System.out.println("Invalid option.");
            break;
        }
    }

    //metodes music
    public static void setVolume(String roomSelect, double volume) {
        if (volume < 0 || volume > 100) {
            System.out.println("Volume must be between 0 and 100.");
            return;
        }

        switch (roomSelect) {
            case "i": h1V = volume; break;
            case "ii": h2V = volume; break;
            case "iii": h3V = volume; break;
            case "iv": kitchenV = volume; break;
            case "v": livingroomV = volume; break;
            case "vi": bathroomV = volume; break;
            default: System.out.println("Invalid room"); return;
        }
        System.out.println("Volume set successfully.");
    }

    public static void controlRoomMusic(String roomSelect, String state) {

        while (!state.equals("ON") && !state.equals("OFF")) {
            System.out.println("Invalid. Please write ON or OFF:");
            state = sc.nextLine().toUpperCase();
        }

        switch (roomSelect) {
            case "i": 
                h1M = state; 
            break;

            case "ii": 
                h2M = state; 
            break;

            case "iii": 
                h3M = state; 
            break;

            case "iv": 
                kitchenM = state; 
            break;

            case "v": 
                livingroomM = state; 
            break;

            case "vi": 
                bathroomM = state; 
            break;

            default: 
                System.out.println("Invalid room"); 
            break;
        }
        System.out.println("Music in selected room is now " + state + ".");
    }

    public static void showMusicState() {
        System.out.println("---- Music Status ----");
        System.out.println("H1: Volume " + h1V + " (" + h1M + ")");
        System.out.println("H2: Volume " + h2V + " (" + h2M + ")");
        System.out.println("H3: Volume " + h3V + " (" + h3M + ")");
        System.out.println("Kitchen: Volume " + kitchenV + " (" + kitchenM + ")");
        System.out.println("Living Room: Volume " + livingroomV + " (" + livingroomM + ")");
        System.out.println("Bathroom: Volume " + bathroomV + " (" + bathroomM + ")");
    }

    public static void syncMusicVolumes() {
    double livingVol = livingroomV;
    
    for (int vol = 1; vol <= 6; vol++) {
        switch (vol) {
            case 1:
                h1V = livingVol;
                break;
            case 2:
                h2V = livingVol;
                break;
            case 3:
                h3V = livingVol;
                break;
            case 4:
                kitchenV = livingVol;
                break;
            case 5:
                bathroomV = livingVol;
                break;
            case 6:
                livingroomV = livingVol;
                break;
        }
    }

    System.out.println("All room volumes have been synced to the Living Room volume (" + livingVol + ")");
}
 
    //metodes validacions
    public static int readIntInRange(Scanner sc, String prompt, int min, int max) {
        int value = 0;
        boolean valid = false;
        do {
            System.out.println(prompt);

            if (sc.hasNextInt()) {
                value = sc.nextInt();
                
                if (value >= min && value <= max) {
                    valid = true;
                } else {
                    System.out.println("Invalid range. The value should be between " + min + " and " + max + ".");
                }
            } else {
                System.out.println("Invalid. Enter a valid number.");
                sc.next();
            }
        } while (!valid);
        
        sc.nextLine();
        return value;
    }

    public static double readDoubleInRange(Scanner sc, String prompt, double min, double max) {
        double value = 0;
        boolean valid = false;
        do {
            System.out.println(prompt);

            if (sc.hasNextDouble()) {
                value = sc.nextDouble();

                if (value >= min && value <= max) {
                    valid = true;
                } else {
                    System.out.println("Invalid range. The value should be between " + min + " y " + max + ".");
                }
            } else {
                System.out.println("Invalid enter. Enter a number.");
                sc.next();
            }
        } while (!valid);
        
        sc.nextLine();
        return value;
    }

    public static String readState(Scanner sc, String prompt, String valid1, String valid2) {
    String input;
    boolean valid = false;

    do {
        System.out.println(prompt);
        input = sc.nextLine().toUpperCase();

        if (input.equals(valid1) || input.equals(valid2)) {
            valid = true;
        } else {
            System.out.println("Invalid. Allowed values are: " + valid1 + "/" + valid2);
        }
    } while (!valid);

    return input;
    }
} 