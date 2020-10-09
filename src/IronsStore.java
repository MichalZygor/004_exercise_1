public class IronsStore {
    public static void main(String[] args) {
        Iron iron1 = new Iron();
        iron1.manufacturer = "Braun";
        iron1.model = "TextStyle 9";
        iron1.powerWatts = 2800;
        iron1.automaticSwitchOff = true;

        Iron iron2 = new Iron();
        iron2.manufacturer = "Tefal";
        iron2.model = "Easygliss Plus 2";
        iron2.powerWatts = 2500;
        iron2.automaticSwitchOff = false;

        System.out.println("Produkt 1: "
                + " producent: " + iron1.manufacturer
                + ", model: " + iron1.model
                + ", moc: " + iron1.powerWatts + "W"
                + ", automatyczne wyłączanie: "+ iron1.automaticSwitchOff);

        System.out.println("Produkt 2: "
                + " producent: " + iron2.manufacturer
                + ", model: " + iron2.model
                + ", moc: " + iron2.powerWatts + "W"
                + ", automatyczne wyłączanie: "+ iron2.automaticSwitchOff);

    }
}
