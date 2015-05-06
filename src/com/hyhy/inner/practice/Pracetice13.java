package com.hyhy.inner.practice;

public class Pracetice13 {
	public IPractice9 f2() {
		/*class innerClass implements*/ return new IPractice9() {
			public void f1() {
				System.out.println("内部类实现接口IPractice");

			}
		};
		/*return new innerClass();*/
	}

	public static void main(String[] args) {
		IPractice9 p = new Practice9().f2();
		p.f1();
	}
}
