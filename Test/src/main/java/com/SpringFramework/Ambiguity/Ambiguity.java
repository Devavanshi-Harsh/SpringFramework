package com.SpringFramework.Ambiguity;

public class Ambiguity {
		int a;
		int b;
		public Ambiguity(int a, int b) {
			System.out.println("This is int constructor");
			this.b = b;
			this.a = a;
		};
		public Ambiguity(String a, String b) {
			System.out.println("This is String constructor");
			this.b = Integer.parseInt(b);
			this.a = Integer.parseInt(b);
		};
		public Ambiguity(double a, double b) {
			System.out.println("This is double constructor");
			this.b = (int) b;
			this.a = (int) a;
		}
		@Override
		public String toString() {
			return "Ambiguity [a=" + a + ", b=" + b + "]";
		};
		
		
}
