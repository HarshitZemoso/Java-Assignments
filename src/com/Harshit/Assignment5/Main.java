package  com.Harshit.Assignment5;

public class Main {

    public static void main(String[] args) {
        Data data = new Data();
        data.print();
        data.error();

        Singleton s = Singleton.getter("Harshit Sachdeva");
        s.getString();
    }
}
