package Core_java.InnerClasses.Anonymous;

class OuterStaticDemo2{
	static class Nested{
		public static void main(String[] args) {
			System.out.println("static nested class main method");
		}
	}
	public static void main(String[] args) {
		System.out.println("Outer class main method");
	}
}