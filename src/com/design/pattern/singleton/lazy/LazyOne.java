package com.design.pattern.singleton.lazy;

/**
 * 在外部需要时才进行实例化
 * lazyOne不是线程安全的
 * @author Rick
 *
 */
public class LazyOne {
	
	private LazyOne(){
		
	}
	
	private static LazyOne lazy = null;
	
	public static LazyOne getInstance(){
		//调用方法前先判断
		//如果没有实例化，将其初始化并且复制
		if(lazy == null){
			//缺点是两个线程可能都先判断为空，都进行初始化
			lazy = new LazyOne();
		}
		return lazy;
	}

}
