/**
 * @author linzhiji
 * @description
 * @date 2021/1/30
 **/

public class Singleton {
    private static Singleton instance;
    public static Singleton sharedInstance(){
        if(null == instance){
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }

    public void showNumber(){
        System.out.println(10);
    }
}
