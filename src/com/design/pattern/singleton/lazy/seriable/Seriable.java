package com.design.pattern.singleton.lazy.seriable;

import java.io.Serializable;

public class Seriable implements Serializable {

	
	//序列化就是把内存中的状态通过转换成字节码的形式从而
	//转换成一个IO流，写入到其他地方(可以是磁盘、网络IO)
	//内存中状态给永久保存下来了
	
	//反序列化
	//将已经持久化的字节码内容转换为IO流
	//通过IO流的读取，进而将读取的内容转换为java对象
	//在转换过程中重新创建对象
	
	public final static Seriable INSTANCE = new Seriable();

	private Seriable() {

	}

	public static Seriable getInstance() {
		return INSTANCE;
	}

	private Object readResolve() {
		return INSTANCE;
	}

}
