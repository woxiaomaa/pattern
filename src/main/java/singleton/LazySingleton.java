package singleton;

public class LazySingleton {
    private volatile static LazySingleton instance = null;   //必须用volatile修饰
    
    private LazySingleton() { }   //构造函数必须为private
  
    public static LazySingleton getInstance() {   
        //第一重判断  
        if (instance == null) {  
            //锁定
            synchronized (LazySingleton.class) {  
                //第二重判断  
                if (instance == null) {  
                    instance = new LazySingleton(); //创建单例实例  
                }  
            }  
        }  
        return instance;   
    }  
}
