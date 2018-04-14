package com.design.pattern.singleton.lazy;

public class LazyTwo {
	
	private LazyTwo(){
		
	}
	
	private static LazyTwo lazyTwo = null;
	
	/**
	 * 方法加锁保证了线程的安全问题，
	 * 缺点是：虽然保证了线程的安全问题，但降低了性能
	 * @return
	 */
	public static synchronized LazyTwo getInstance(){
		if(lazyTwo == null){
			lazyTwo = new LazyTwo();
		}
		return lazyTwo;
	}

}
