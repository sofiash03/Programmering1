class TestingNewString {
    public static void main(String[] args) {
        NyString setning = new NyString("Denne setningen kan forkortes");

        NyString forkortetSetning = setning.doFrokorting();
        System.out.println(forkortetSetning.getTekst());

        NyString fjernetSetning = setning.doFjernTegn('e');
        System.out.println(fjernetSetning.getTekst());
    }
    
}
