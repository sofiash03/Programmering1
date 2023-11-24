public class Arrengement {
    private int number; 
    private String name;
    private String place; 
    private String organizer; 
    private String type; 
    private int date; // På formen ÅÅMMDD

    private int time; //På formen TTMM

    public Arrengement(int number, String name, String place, String organizer, String type, int date, int time){
        this.number = number; 
        this.name = name; 
        this.place = place;
        this.organizer = organizer; 
        this.type = type; 
        this.date = date;
        this.time = time;
    }
//    GET metoder
    public int getNumber(){
        return number;
        }
    
    public String getName() {
        return name;
        }
    
    public String getPlace() {
        return place;
        }
    
    public String getOrganizer() {
        return organizer;
        }
    
    public String getType() {
        return type;
        }
    
    public int getDate(){
        return date;
    }

    public int getTime() {
        return time;
    }
//    SET metoder
    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setDate(int date) {
        this.date = date;
    }
    public void setTime(int time) {
        this.time = time;
    }

//    Metoder
    public String doFormatDate(){
        // Dato er på formen ÅÅDDMM
        String dtg_string = Integer.toString(date);
        String day = dtg_string.substring(4,6);
        String month = dtg_string.substring(2,4);
        String year = "20" + dtg_string.substring(0,2);

        return day + "." + month + "." + year;

    }
    public String doFormatTime(){
        // Tid er på formen TTMM
        String time_string = Integer.toString(time);
        String hour = time_string.substring(0, 2);
        String minute = time_string.substring(2,4);

        return hour + ":" + minute;
    }

    public void doPrintEventInfo(){
        Arrengement event = new Arrengement(number, name, place, organizer, type, date, time);

        System.out.println("\n" + name.toUpperCase());
        System.out.println("sted: " + place);
        System.out.println("type: " + type);
        System.out.println("når: " + event.doFormatDate() + ", " + event.doFormatTime());
        System.out.println("arrengert av: " + organizer);
    }
}
