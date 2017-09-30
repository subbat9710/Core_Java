public class StaticVarExample {

	public static String myClassVar="class or static variable";

	public static void main(String args[]){
		StaticVarExample obj = new StaticVarExample();
		StaticVarExample obj2 = new StaticVarExample();
		StaticVarExample obj3 = new StaticVarExample();

		//all theree will display "class or static variable"
		System.out.println(obj.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);

		//changing the value of static variable using obj2
		obj2.myClassVar = "Changed Text";

		//all theree will display "changed text"
		System.out.println(obj.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);
	}
}

/*Static variables are also known as class variable because they are associated with the class 
and common for all the instances of class.*/