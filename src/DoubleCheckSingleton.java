
//sortout the problem of two object not created //
//only one object is created //

public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton uniqueInsatnce = null ;

    private int data = 0 ;

    private DoubleCheckSingleton()
    {

    }

    public static DoubleCheckSingleton getInstance() {
         if (uniqueInsatnce == null)                   // first execution its true // without locking chcek
            synchronized (DoubleCheckSingleton.class) {           //apply synchronization //
         if (uniqueInsatnce== null)                     //again it willl be check // with lock check inside synchronized
                uniqueInsatnce = new DoubleCheckSingleton();       //then give you object //
            }
        return uniqueInsatnce;
    }
}
