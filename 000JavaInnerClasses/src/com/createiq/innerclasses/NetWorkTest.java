package com.createiq.innerclasses;

public class NetWorkTest {
	public static void main(String[] args) {
		
		// anonymous block
		Network network=new Network() {
			
			@Override
			public void test() {
			System.out.println(" net work test method.........");
				
			}
		};
		
//		jvm is created
		network.test();
	}

}
