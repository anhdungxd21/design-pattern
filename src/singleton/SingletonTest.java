package singleton;

public class SingletonTest {
    private static volatile SingletonTest uniqueInstance;

    private SingletonTest(){}

    public static SingletonTest getInstance(){
        if(uniqueInstance==null) {
            synchronized (SingletonTest.class) {
                if(uniqueInstance==null) {
                    uniqueInstance = new SingletonTest();
                }
            }
        }
        return uniqueInstance;
    }
}
