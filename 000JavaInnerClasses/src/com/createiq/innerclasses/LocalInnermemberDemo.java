package com.createiq.innerclasses;

public class LocalInnermemberDemo {

	public void display(int waitTime) {
		class LocalMember {
			public void msg() {
				if (waitTime > 30) {
					System.out.println(" i'm local member inner class method....s.");
				} else {
					System.out.println(" you have to wait for more time");
				}
			}
		}
		LocalMember lm = new LocalMember();
		lm.msg();

	}

	public static void main(String[] args) {
		LocalInnermemberDemo demo = new LocalInnermemberDemo();
		demo.display(20);
	}
}
