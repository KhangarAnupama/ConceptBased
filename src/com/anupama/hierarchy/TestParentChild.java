package com.anupama.hierarchy;

public class TestParentChild {
	
	public static void main(String[] args) {
		
		Parent parent = new Parent();
		parent.m1();
		
		Child child = new Child();
		child.m1();
		
		Parent alwaysCallChild = new Child();
		alwaysCallChild.m1();
		
	}

}
