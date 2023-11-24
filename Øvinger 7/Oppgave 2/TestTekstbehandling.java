class TestTekstbehandling {
    public static void main(String[] args) {
        String tekst = "de siste bokstavene! i alphabetet. er æøå";
        Tekstbehandling test = new Tekstbehandling(tekst);

        System.out.println(test.finnGjennomsnittAntallOrd());
        System.out.println(test.finnAntallOrd());
        System.out.println(test.findAndReplace("bokstavene", "bokst."));
        System.out.println(test.finnGjennomsnittOrdLengde());
        System.out.println(test.getTekst());
        System.out.println(test.toUppercase());
        
    }
    
}
