package Core_java.InnerClasses;

class OuterCase6{
	public void m1(){
		class Inner{
			public void sum(int x,int y){
				System.out.println("The Sum :- "+(x+y));
			}
		}
		Inner i = new Inner();
		i.sum(10,20);
		i.sum(100,200);
		i.sum(1000,2000);
	}
	public static void main(String[] args) {
		OuterCase6 oc = new OuterCase6();
		oc.m1();
	}
}