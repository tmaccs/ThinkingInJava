package com.hyhy.HoldingYourObjects.practice;

import java.util.ArrayList;

public class Practice1 {
	public static ArrayList<Gerbil> Gerbils;

	public static void main(String[] args) {
		Gerbils = new ArrayList<Gerbil>();
		//ÐÞ¸Ä
		for (int i = 0; i < 10; i++) {
			Gerbils.add(new Gerbil(i));
		}
		for (int i = 0; i <Gerbils.size(); i++) {
			Gerbils.get(i).hop();
		}
		/*Gerbils.add(new Gerbil(1));
		Gerbils.add(new Gerbil(2));
		Gerbils.add(new Gerbil(3));
		Gerbils.add(new Gerbil(4));*/
		for (Gerbil g : Gerbils) {
			g.hop();
		}
	}

}

class Gerbil {
	private int gerbilId;

	public Gerbil(int gerbilNumber) {
		this.gerbilId = gerbilNumber;
	}

	public void hop() {

		System.out.println("Gerbil"+gerbilId+"ºÅ"+"ÕýÔÚÌøÔ¾");
	}
	/*
	 * private int gerbilNumber;
	 * 
	 * public int gerbilNumber() { return gerbilNumber; }
	 */
}