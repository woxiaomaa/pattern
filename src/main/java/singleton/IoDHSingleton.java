package singleton;

//使用静态内部类
public class IoDHSingleton {
	private IoDHSingleton() {};
	
	private static class HolderClass { 
		private final static IoDHSingleton insatnce = new IoDHSingleton();
	}
	
	public static IoDHSingleton getInstance() {
		return HolderClass.insatnce;
	}
	
	public static void main(String[] args) {
		IoDHSingleton s1;
		IoDHSingleton s2;
		s1 = IoDHSingleton.getInstance();
		s2 = IoDHSingleton.getInstance();
		System.out.println(s2 == s1);
		
	}

}
