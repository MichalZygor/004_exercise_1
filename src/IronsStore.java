public class IronsStore {
    public static void main(String[] args) {
        Iron iron1 = new Iron("Braun", "TextStyle 9", 2800,true);
        Iron iron2 = new Iron("Tefal","Easygliss Plus 2", 2500, false);

        iron1.PrintResults(1, iron1);
        iron2.PrintResults(2, iron2);
    }
}
