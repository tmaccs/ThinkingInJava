package com.hyhy.inner.practice;
public class InstanceOfParcel{
	public static void main(String[] args) {
		outerclass pa =new outerclass();
		outerclass.innnerclass pai= pa.new innnerclass();
		
	}
}
class outerclass {
	public class innnerclass{
		{
			System.out.println("内部类初始化");
		}
	}
}
