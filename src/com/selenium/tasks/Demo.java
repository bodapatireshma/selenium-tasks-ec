package com.selenium.tasks;

public class Demo {
	public Demo() {
		System.out.println("1.Constructor");
	}
	private void stuId(int id) {
		System.out.println("2.stuID :"+id);
	}
	public void stuName() {
		System.out.println("3.JACK");
	}
	static {
		System.out.println("4.static block");
	}
	public static void demoD() {
		System.out.println("5.static method");
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		d.stuId(15545);
		d.stuName();
		demoD();
	}
}
