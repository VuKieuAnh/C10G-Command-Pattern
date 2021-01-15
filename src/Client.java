public class Client {
    public static void main(String[] args) {
        Account kieuanh = new Account("Kieu Anh");
        Command opend = new OpenAccount(kieuanh);
        Command close = new CloseAccount(kieuanh);
        AppAccount bank = new AppAccount(opend, close);
        bank.clickOpenAccount();
        bank.clickCloseAccount();
    }
}