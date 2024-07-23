public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser Sam = new KidUser(14, "Kids");
        Sam.registerAccount();

        KidUser Abdoul = new KidUser(19, "Fiction");
        Abdoul.requestBook();

        AdultUser Shiao = new AdultUser(8, "Kids");
        Shiao.registerAccount();

        AdultUser Nassirou = new AdultUser(24, "Fiction");
        Nassirou.requestBook();
    }
}
