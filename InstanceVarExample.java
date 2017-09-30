/*Each instance(objects) of class has its own copy of instance variable. Unlike static variable, 
instance variables have their own separate copy of instance variable. We have changed the 
instance variable value using object obj2 in the following program and when we displayed 
the variable using all three objects, only the obj2 value got changed, others remain unchanged. 
This shows that they have their own copy of instance variable.*/

public class InstanceVarExample {

	String myInstanceVar="instance variable";

	public static void main(String args[]){
		InstanceVarExample obj = new InstanceVarExample();
		InstanceVarExample obj2 = new InstanceVarExample();
		InstanceVarExample obj3 = new InstanceVarExample();

		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);

		obj2.myInstanceVar = "Changed Text";

		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);

	}
}