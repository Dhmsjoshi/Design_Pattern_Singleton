package Design_Pattern_Singleton;

public class Cliet {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        Singleton s4 = Singleton.getInstance();

        s1.makeConnection();
        s2.makeConnection();
        s3.makeConnection();
        s2.makeConnection();
        s2.makeConnection();
        s3.makeConnection();

    }
}
