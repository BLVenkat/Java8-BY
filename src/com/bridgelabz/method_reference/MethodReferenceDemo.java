package com.bridgelabz.method_reference;

import com.bridgelabz.functional_interface.IMath;

public class MethodReferenceDemo {
	
 public static void main(String[] args) {
	
	 //Refering predefined class
	 IMath math = Integer::sum;
	 
	 System.out.println(math.add(1, 2));
	 
	 //Refering custom static class
	 IMath customImath = MyInteger::sum;
	 System.out.println(customImath.add(2, 3));
	 
	 //Refering custom non-static class
	 MyIntegerNonStatic nonStaticRefer = new MyIntegerNonStatic();
	 
	 IMath nonStaticOperation = nonStaticRefer::sum;
	 System.out.println(nonStaticOperation.add(22,22));
	 
	 //IMath nonStaticOperation1 = new MyIntegerNonStatic()::sum;

	 IConst constReference = MyConstReference::new;
	 constReference.add(2, 4);
 }
}
