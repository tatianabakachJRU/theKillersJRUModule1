package lecture_15;

public class SingletonExample {
    private static SingletonExample singleton;

    private SingletonExample(){}

    public static SingletonExample getInstance(){
        if(singleton == null){
            singleton = new SingletonExample();
        }
        return singleton;
    }
}
