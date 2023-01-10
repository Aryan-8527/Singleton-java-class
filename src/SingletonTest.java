public class SingletonTest {
    public static void main(String[] args) {

        // getinstance () - it always return single instance //
        TestSingleton obj1 = TestSingleton.getInstance();
        TestSingleton obj2 = TestSingleton.getInstance();
        TestSingleton obj3 = TestSingleton.getInstance();

        //different output - Two different type object creates//
        // diff. output new always create new object //
        TestSingleton obj4 = new TestSingleton();
        TestSingleton obj5 = new TestSingleton();
        TestSingleton obj6 = new TestSingleton();


        // tostring refrence of the objcet //

        System.out.println("obj1" + obj1.toString());
        System.out.println("obj2" + obj2.toString());
        System.out.println("obj3" + obj3.toString());
        System.out.println("obj4" + obj4.toString());
        System.out.println("obj5" + obj5.toString());
        System.out.println("obj6" + obj6.toString());
    }
}
class TestSingleton{

    // Static object //
    static TestSingleton aobject = new TestSingleton();

    // Constructor of this class
    // Here private constructor is used to
    // restricted to this class itself
    TestSingleton(){
    }

    //get instatnce method - return object //
    public static TestSingleton getInstance() {
        return aobject;
    }
}