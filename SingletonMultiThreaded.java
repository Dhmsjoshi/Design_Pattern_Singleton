package Design_Pattern_Singleton;

public class SingletonMultiThreaded {
    private static SingletonMultiThreaded instance;
    private int counter;
    private SingletonMultiThreaded(){
        counter=0;
    }

    public static SingletonMultiThreaded getInstance(){
        if(instance == null){
            synchronized (SingletonMultiThreaded.class){
                // Take the lock using class, as "this" (which can be used in case of object) can not be used here
                //Because this method is static . Which is class level method. In static we can not access object
                //So we are using class for lock.
                //This keyword and class, both works same way for lock.
                if(instance == null){
                    instance = new SingletonMultiThreaded();
                }
            }

        }
        return instance;
    };

    public void makeConnection(){
        if(counter <3){
            counter++;
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }

}
