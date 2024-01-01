package Design_Pattern_Singleton;

public class Singleton {
    private static Singleton instance;
    private int counter;
    private Singleton(){}

    public static Singleton getInstance(){
         if(instance == null){
             instance = new Singleton();
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

//Problem:
//If we are using Singleton in a multithreaded application,
//there is a high chance  of multiple threads creating multiple objects at the same time.

//Solution:
//1. Egar Loading/ Egar Execution
    //->If there are multiple singleton classes in app. app start time will increase
    //->Obj. will remain even if don't use it ever
//2. Synchronized(method)
    // -> Synchronized decreases performance
        //scene-1
            //No Obj. is created and multiple threads call getObject().
        //scene - 2
            // Obj. is created and multiple threads call getObject().
    //-> So, if after one obj. creation, anyway multiple thread can not make any object,
    // why to reduce performance with synchronization?
    // So no synchronization required

//3. final solution: Double Check Locking
        //In getInstance() method:
    //public static Singleton getInstance(){
//            if(instance == null){
//                Synchronized(this){
//                    if(instance==null){
//                        instance = new Singleton();
//                    }
//                }
//            }
        //return instance;
    //?

//Here first if check is for scene-1 performance (When object already created) &
// second for scene-2 (object crated first time / not created)
//So there is a double check.....

//Check SingletonMultiThreaded class

