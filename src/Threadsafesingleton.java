
//its sortout the problem of get multiple instance within (eksath) //
public class Threadsafesingleton {


    //static refrence pass instance in other his class
    public static class LoadSingleton{
        static final Threadsafesingleton instance = new Threadsafesingleton();

    }
    Threadsafesingleton(){

    }
          //get instance found instnace on particual single class
    public static Threadsafesingleton getInstance(){
        return LoadSingleton.instance;
    }
}
