package com.hyhy.inner.practice;

public class Practice9 {

	public IPractice9 f2() {
		class innerClass implements IPractice9 {
			public void f1() {
				System.out.println("内部类实现接口IPractice");

			}
		}
		return new innerClass();
	}

	public static void main(String[] args) {
		IPractice9 p = new Practice9().f2();
		p.f1();
	}

}
