public class Account {
    private String name;

    public Account(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println("Tai khoan "+ name + " da duoc mo");
    }

    public void close(){
        System.out.println("Tai khoan "+ name +" da vo hieu hoa");
    }
}