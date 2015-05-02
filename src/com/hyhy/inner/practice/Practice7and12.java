package com.hyhy.inner.practice;

public class Practice7and12 {
	private int num=1;

	private void f1() {
		System.out.println("调用外部类的方法");
	}

	class InnerClass {
		public void modify() {
			Practice7and12 p = new Practice7and12();
			num++;
			p.f1();
		}
	}
	public void f2(){
		InnerClass pi = new InnerClass();
		pi.modify();
		System.out.println(num);

	}

	public static void main(String[] args) {
		Practice7and12 p2 = new Practice7and12();
		p2.f2();
		
	}

}
