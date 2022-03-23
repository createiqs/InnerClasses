package com.createiq.innerclasses;

public  class OuterClass {

	private int oid;
	private static String OUTER_NAME = "my name is outer";
	private final int value = 100;

	public void display() {
		System.out.println(" i'm outer method........."  );
	}

	// a non-static nested class---> Inner class
	 class InnerClass {
		private String innerValue;
//		private static String INNER_NAME=" INNER NAME";
//		private final String INNER_NAME=" INNER NAME";
		public  void innerMethod() {
//			System.out.println(" i'm innner class method..." + oid + " " + OUTER_NAME + " " + value);
//			System.out.println(innerValue);
		}

	}

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		outer.display();

//		OuterClass.InnerClass inner=new OuterClass.InnerClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.innerMethod();
		inner.innerValue = "inner variable";
	}

}
