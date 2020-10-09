public class Iron {
    String manufacturer;
    String model;
    int powerWatts;
    boolean automaticSwitchOff;

    Iron(String manufacturerIn, String modelIn, int powerWattsIn, boolean automaticSwitchOffIn){
        manufacturer = manufacturerIn;
        model = modelIn;
        powerWatts = powerWattsIn;
        automaticSwitchOff = automaticSwitchOffIn;
    }

    void PrintResults(int count, Iron iron){
        System.out.println("Produkt " + count + ":"
                + " producent: " + iron.manufacturer
                + ", model: " + iron.model
                + ", moc: " + iron.powerWatts + "W"
                + ", automatyczne wyłączanie: "+ iron.automaticSwitchOff);
    }
}
