class ArrangementRegister {
    private Arrengement[] events;

    public ArrangementRegister(Arrengement[] events){
        this.events = events;
    }

    public void doRegisterEvent(Arrengement new_event){
        Arrengement[] new_list = new Arrengement[events.length + 1];

        for(int i = 0; i < events.length; i++){
            new_list[i] = events[i];
        }
        new_list[new_list.length-1] = new_event;

        this.events = new_list;
    }

    public void doPrintListOfEVents(Arrengement[] list){
        for(int i = 0; i < list.length; i++){
            list[i].doPrintEventInfo();
        }
    }

    public Arrengement[] doFindEventsAtPlace(String this_place){
        Arrengement[] events_at = new Arrengement[events.length];
        int mengde = 0;


        for(int i = 0; i < events.length; i++){
            if(events[i].getPlace().equals(this_place)){
                events_at[i] = events[i];
//                System.out.println(events_at[i].getName() + ", " + events_at[i].getPlace());
                mengde += 1;
            }
        }
        Arrengement[] new_list = new Arrengement[mengde];
        int h = 0;


        for(int j = 0; j < events_at.length; j++){
            if(events_at[j] != null){
                new_list[h] = events_at[j];
                h += 1;
            }
        }
        return new_list;
    }
    public Arrengement[] doFindEventsAtDate(int other_date){
        Arrengement[] events_at = new Arrengement[events.length];
        int mengde = 0;
        int new_number = 0;

        for(int i = 0; i < events.length; i++){
            if(events[i].getDate() == other_date){
                events_at[i] = events[i];
                mengde += 1;
                new_number = i;
            }
        }
        Arrengement[] new_list = new Arrengement[mengde];
        int h = 0;

        System.out.println("\n--- EVENTS AT " + events_at[new_number].doFormatDate() + " ---");
        for(int j = 0; j < events_at.length; j++)
            if (events_at[j] != null) {
                new_list[h] = events_at[j];
                h += 1;

                events_at[j].doPrintEventInfo();
            }
        return new_list;
    }
    public Arrengement[] doFindEventsBetween(int start_date,int end_date){
        Arrengement[] events_between = new Arrengement[events.length];
        int mengde = 0;

        for(int i = 0; i < events.length; i++){
            if(events[i].getDate() <= end_date && events[i].getDate() >= start_date){
                events_between[i] = events[i];
                mengde += 1;
            }
        }
        Arrengement[] new_list = new Arrengement[mengde];
        int h = 0;
        int[] rekkefolge = new int[events_between.length];

        for(int j = 0; j < events_between.length; j++) {
            if (events_between[j] != null) {
                new_list[h] = events_between[j];
                h += 1;

            }
        }
        for(int i = 0; i < new_list.length; i++) {
            for (int j = 0; j < new_list.length; j++) {
                if(new_list[i].getDate() < new_list[j].getDate()) {
                    rekkefolge[i] += 1;
                }
                if(new_list[i].getDate() == new_list[j].getDate() && new_list[i].getTime() > new_list[j].getTime()){
                    rekkefolge[i] += 1;
                }
            }
        }
        Arrengement[] sorted_list = new Arrengement[mengde];
        for(int i = 0; i < new_list.length; i++){
            sorted_list[rekkefolge[mengde - 1 - i]] = new_list[i];
            }

//        FORMATERT DATOER
        String start = Integer.toString(start_date);
        String day = start.substring(4,6);
        String month = start.substring(2,4);
        String year = "20" + start.substring(0,2);
        String formated_start = day + "." + month + "." + year;

        String end = Integer.toString(end_date);
        String day_end = end.substring(4,6);
        String month_end = end.substring(2,4);
        String year_end = "20" + end.substring(0,2);
        String formated_end = day_end + "." + month_end + "." + year_end;

        System.out.println("\n--- EVENTS BETWEEN " + formated_start + " AND " + formated_end + " ---");
        for (Arrengement arrengement : sorted_list) {
            arrengement.doPrintEventInfo();
        }
        return sorted_list;
    }

    public Arrengement[] doFindEventsOfType(String other_type){
        Arrengement[] events_at = new Arrengement[events.length];
        int mengde = 0;

        for(int i = 0; i < events.length; i++){
            if(events[i].getType() == other_type){
                events_at[i] = events[i];
                mengde += 1;
            }
        }
        Arrengement[] new_list = new Arrengement[mengde];
        int h = 0;

        System.out.println("\n --- " + other_type.toUpperCase() + " - EVENTS ---");
        for(int j = 0; j < events_at.length; j++){
            if(events_at[j] != null){
                new_list[h] = events_at[j];
                h += 1;

                events_at[j].doPrintEventInfo();
            }
        }
        return new_list;

    }
    public void doPrintEvents(){
        System.out.println("\n --- EVENTS ---");
        for(int i = 0; i < events.length; i++){
            events[i].doPrintEventInfo();
        }
    }
}
