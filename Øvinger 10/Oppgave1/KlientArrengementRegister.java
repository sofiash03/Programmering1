import java.util.Scanner;
class KlientArrengementRegister {
    public static void main(String[] args) {
        // ARRENGEMENT
        int number = 1;
        String name_1 = "Pizzafest";
        String place_1 = "TIHLDE kontor";
        String organizer_1 = "Kok TIHLDE";
        String type_1 = "fest";
        int date_1 = 231018;
        int time_1 = 1500;

        int number_2 = 2;
        String name_2 = "Kontorvors";
        String place_2 = "TIHLDE kontor";
        String organizer_2 = "Kok TIHLDE";
        String type_2 = "fest";
        int date_2 = 231020;
        int time_2 = 1800;

        int number_3 = 3;
        String name_3 = "Lørdagsplask";
        String place_3 = "Hurtigbåtterminalen Trondheim";
        String organizer_3 = "TIHLDE plask";
        String type_3 = "aktivitet";
        int date_3 = 231020;
        int time_3 = 1200;

        Arrengement pizzafest = new Arrengement(number, name_1, place_1, organizer_1, type_1, date_1, time_1);
        Arrengement kontorfest = new Arrengement(number_2, name_2, place_2, organizer_2, type_2, date_2, time_2);
        Arrengement plask = new Arrengement(number_3, name_3, place_3, organizer_3, type_3, date_3, time_3);

        // ARRENGEMENTREGISTER

        Arrengement[] events = {pizzafest, kontorfest, plask};
        ArrangementRegister arrengementerTIHLDE = new ArrangementRegister(events);

//        Printing a menu
        while (true) {
            System.out.println(" --- MENU ARRENGEMENT REGISTER ---");
            System.out.println("Choose an action: ");
            System.out.println("1: Show coming events");
            System.out.println("2. Register new event");
            System.out.println("3. Find events that are going to be at one given place");
            System.out.println("4. Find events that are going to be at one given date");
            System.out.println("5. Find events of one given type");
            System.out.println("6. Find events between two given dates");
            System.out.println("7. Exit");

            Scanner readChoice = new Scanner(System.in);
            System.out.print("ENTER CHOICE:   ");
            int choice = readChoice.nextInt();

            System.out.println();
//            CHOICES
            if (choice == 1) {
                arrengementerTIHLDE.doPrintEvents();
            }
            if (choice == 2) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter event name:   ");
                String eventName = input.nextLine();

                System.out.print("Enter event place: ");
                String eventPlace = input.nextLine();

                System.out.print("Enter event organizer: ");
                String eventOrganizer = input.nextLine();

                System.out.print("Enter event type: ");
                String eventType = input.nextLine();

                System.out.print("Enter event day (day as DD): ");
                String eventDay = input.nextLine();

                System.out.print("Enter event month (day as MM): ");
                String eventMonth = input.nextLine();

                System.out.print("Enter event year (day as YY): ");
                String eventYear = input.nextLine();

                int eventDate = Integer.parseInt(eventYear + eventMonth + eventDay);

                System.out.print("Enter event time (HHMM): ");
                int eventTime = input.nextInt();

                System.out.print("Enter event number: ");
                int eventNr = input.nextInt();

                Arrengement new_event = new Arrengement(eventNr, eventName, eventPlace, eventOrganizer, eventType, eventDate, eventTime);

                arrengementerTIHLDE.doRegisterEvent(new_event);
            }

            if (choice == 3) {    // find events that are at one place
                Scanner input = new Scanner(System.in);
                String eventPlace = input.nextLine();

                System.out.println(" --- EVENTS AT " + eventPlace.toUpperCase() + " ---");
                Arrengement[] atPlace = arrengementerTIHLDE.doFindEventsAtPlace(eventPlace);
                for (int i = 0; i < atPlace.length; i++) {
                    atPlace[i].doPrintEventInfo();
                }
            }

            if (choice == 4) {    //find events that are all on the same date
                Scanner input = new Scanner(System.in);

                System.out.print("Enter event day (day as DD): ");
                String eventDay = input.nextLine();

                System.out.print("Enter event month (day as MM): ");
                String eventMonth = input.nextLine();

                System.out.print("Enter event year (day as YY): ");
                String eventYear = input.nextLine();

                String formatedDate = eventDay + "." + eventMonth + "." + eventYear;
                int eventDate = Integer.parseInt(eventYear + eventMonth + eventDay);
                System.out.println(eventDate);

                System.out.println(" --- EVENTS AT " + formatedDate + " ---");
                Arrengement[] atPlace = arrengementerTIHLDE.doFindEventsAtPlace(eventDate);

//                for (int i = 0; i < atPlace.length; i++) {
//                    atPlace[i].doPrintEventInfo();
                }

                if (choice == 7) {
                    break;
                }
                System.out.println();
            }
        }
    }

