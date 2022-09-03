package com.sample;



public class A {
	
	 
	
	
	
	
	int id =10;
	
	private void m1() {
		id=100;
		System.out.println(id);
		
	}
		private void m2() {
			System.out.println(id);
		}
		
		public static void main(String[] args) {
			A s=new A();
			s.m1();
			s.m2();
			
			A e=new A();
			e.m2
			();
			e.m1();
			
			
		}
	}


