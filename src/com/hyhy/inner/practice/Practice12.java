package com.hyhy.inner.practice;

public class Practice12 {
	private int num=1;

	private void f1() {
		System.out.println("调用外部类的方法");
	}
	public void f2(){
		new Object(){
			void modify() {
				Practice12 p = new Practice12();
				num++;
				p.f1();
			}
		}.modify();
		System.out.println(num);

	}
		/*class InnerClass {
			public void modify() {
			Practice12 p = new Practice12();
			p.num=p.num+3;
			p.f1();
			System.out.println(p.num);
		}*/
	

	public static void main(String[] args) {
		Practice12 p2 = new Practice12();
		p2.f2();

	}

}
