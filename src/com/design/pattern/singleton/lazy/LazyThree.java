package com.design.pattern.singleton.lazy;

/**
 * 在外部类被调用的时候内部类才会被加载
 * 内部类一定要在方法调用之前初始化
 * 巧妙地避免了线程安全问题
 * @author Rick
 *
 */
public class LazyThree {
	
	private static boolean initialized = false;
	
	//构造方法私有化，可以避免反射安全
	private LazyThree(){
		synchronized(LazyThree.class){
			if(initialized == false){
				initialized = !initialized;
			}else{
				throw new RuntimeException("单例已被侵犯!");
			}
		}
		
	}
	
	//final保证这个方法不会被重写
	public static final LazyThree getInstance(){
		return LazyHolder.LAZY;
	}

	//静态内部类，只有在被调用的时候才被加载
	private static class LazyHolder{
		private static final LazyThree LAZY = new LazyThree();
	}
	
}
