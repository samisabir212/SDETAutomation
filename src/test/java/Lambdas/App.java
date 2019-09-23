//package Lambdas;
//
//import Polymorphism.Human;
//import Polymorphism.Robot;
//import Polymorphism.Walkable;
//
//public class App {
//
//	
//	public static void main(String[] args) {
//
//		Human woman = new Human();
//
//		walker(woman);
//
//		Robot wale = new Robot();
//
//		walker(wale);
//
//		walker(new Walkable() { // java 1.7 closest thing to lambdas
//
//			@Override
//			public void walk() { // this method is not associated to a class
//				// this method is created on the fly ready to use
//
//				System.out.println("custom lambda java 1.7 object walking....");
//			}
//
//		});
//
//		// lambda example java 1.8
//		walker(() ->
//
//		{
//			System.out.println("Custom lambda java 1.8 object walking...");
//
//		});
//		
//		
//		ALambdaInterface aBlockOfCode = () -> {
//			
//			System.out.println("Custom lambda java 1.8 object ran...");
//			System.out.println("Custom lambda java 1.8 object tripped...");
//
//		};
//		
//		
//		walker(() -> System.out.println("Do something i am a lambda"));
//		
//		
//		
//		
//
//	}
//
//	public static void walker(Walkable walkableEntity) {
//
//		walkableEntity.walk();
//
//	}
//
//	
//}
