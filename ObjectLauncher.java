public class ObjectLauncher{
	public static void main(String[] args){
		System.out.println("test");
		ObjectLauncher launcher = new ObjectLauncher();
		
		launcher.launch();
	}
	
	public void launch(){
		ReturnObjectImpl object1 = new ReturnObjectImpl("abc");
		ReturnObjectImpl object2 = new ReturnObjectImpl(345);
		System.out.println(object1.getReturnValue());
		System.out.println(object2.getReturnValue());
		System.out.println(object1.getReturnValue());
		System.out.println(object1.hasError());
		System.out.println(object1.getError());
	
		ArrayList array1 = new ArrayList();
		System.out.println(array1.isEmpty());
		System.out.println(array1.size());
		System.out.println(array1.get(0));
		System.out.println(array1.get(0).getError());
		System.out.println(array1.add(0, "abc").getError());
		System.out.println(array1.add(1, "abd").getError());
		System.out.println(array1.add(2, "abc").getReturnValue());
		System.out.println(array1.add(-1, "abc").getError());
		System.out.println(array1.add(-1, "abc").getReturnValue());
		System.out.println(array1.add(2, null).getError());
		System.out.println(array1.get(0).getReturnValue());
		System.out.println(array1.size());
		System.out.println(array1.remove(0).getError());
		
		
		array1.add(3, "aaa");
		array1.add(4, "aaaa");
		array1.add(5,"aaaaa");
		System.out.println(array1.size());
		System.out.println(array1.add(7, "abc").getError());
		System.out.println(array1.add(4, "abc").getError());
		System.out.println(array1.size());
		System.out.println(array1.get(3).getReturnValue());
		System.out.println(array1.remove(3).getError());
		System.out.println(array1.get(3).getReturnValue());
		System.out.println(array1.add("abcd").getReturnValue());
		System.out.println(array1.size());
		System.out.println(array1.get(6).getReturnValue());
		System.out.println(array1.add("abcde").getReturnValue());
		System.out.println(array1.get(array1.size()-1).getReturnValue());
		System.out.println(array1.add("abcd").getReturnValue());
		System.out.println("");
		System.out.println("");
		System.out.println(array1.size());
		System.out.println(array1.add("NEW ITEM IN BIGGER ARRAY").getReturnValue());
		System.out.println(array1.get(array1.size()-1).getReturnValue());
		System.out.println(array1.size());
		
		
	LinkedList list1 = new LinkedList();
	System.out.println(list1.remove(-1).getError());
	System.out.println(list1.isEmpty());
	System.out.println(list1.size());
	System.out.println(list1.get(0).getError());
	System.out.println(list1.get(-1).getError());
	System.out.println(list1.add(0,null).getError());
	System.out.println(list1.add(0,"a0").getError());
	System.out.println(list1.get(0).getReturnValue());
	System.out.println(list1.add(1,"a1").getError());
	System.out.println(list1.get(1).getReturnValue());
	System.out.println(list1.add(2,"a2").getError());
	System.out.println(list1.get(2).getReturnValue());
	System.out.println(list1.add(0,"a4").getError());
	System.out.println(list1.get(0).getReturnValue());
	System.out.println(list1.get(1).getReturnValue());
	System.out.println(list1.get(2).getReturnValue());
	System.out.println(list1.get(3).getReturnValue());
	System.out.println(list1.add(2,"a5").getError());
	System.out.println(list1.add(4,"a6").getError());
	
	System.out.println(list1.get(2).getReturnValue());
	System.out.println("");
	System.out.println(list1.get(0).getReturnValue());
	System.out.println(list1.get(1).getReturnValue());
	System.out.println(list1.get(2).getReturnValue());
	System.out.println(list1.get(3).getReturnValue());
	System.out.println(list1.get(4).getReturnValue());
	System.out.println(list1.get(5).getReturnValue());
	System.out.println(list1.size());
	System.out.println(list1.add("a7").getError());
	System.out.println(list1.get(6).getReturnValue());
	System.out.println(list1.add(10, "a8").getError());
	System.out.println(list1.get(10).getReturnValue());
	System.out.println(list1.get(0).getReturnValue());
	System.out.println(list1.get(1).getReturnValue());
	System.out.println(list1.get(2).getReturnValue());
	System.out.println(list1.get(3).getReturnValue());
	System.out.println(list1.get(4).getReturnValue());
	System.out.println(list1.get(5).getReturnValue());
	System.out.println(list1.get(6).getReturnValue());
	System.out.println(list1.remove(-1).getError());
	System.out.println(list1.remove(0).getError());
		System.out.println(list1.size());
		System.out.println(list1.get(0).getReturnValue());
		System.out.println("");
		
	System.out.println(list1.get(0).getReturnValue());
	System.out.println(list1.get(1).getReturnValue());
	System.out.println(list1.get(2).getReturnValue());
	System.out.println(list1.get(3).getReturnValue());
	System.out.println(list1.get(4).getReturnValue());
	System.out.println(list1.get(5).getReturnValue());
	System.out.println("");
	System.out.println(list1.remove(2).getError());
	System.out.println(list1.get(0).getReturnValue());
	System.out.println(list1.get(1).getReturnValue());
	System.out.println(list1.get(2).getReturnValue());
	System.out.println(list1.get(3).getReturnValue());
	System.out.println(list1.get(4).getReturnValue());
	System.out.println(list1.get(5).getReturnValue());
	System.out.println(list1.size());
	System.out.println("");
	System.out.println("");
	System.out.println("");
	FunctionalArrayList array2 = new FunctionalArrayList();
	System.out.println(array2.head().getError());
	System.out.println(array2.add("b1").getReturnValue());
	System.out.println(array2.add("b2").getReturnValue());
	System.out.println(array2.add("b3").getReturnValue());
	System.out.println(array2.add("b4").getReturnValue());
	System.out.println(array2.add("b5").getReturnValue());
	System.out.println(array2.head().getReturnValue());
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println(array2.rest().get(2).getReturnValue());
	
	System.out.println("");
	System.out.println("");
	System.out.println("");
	FunctionalLinkedList list2 = new FunctionalLinkedList();
	System.out.println(list2.head().getError());
	System.out.println(list2.add("c1").getReturnValue());
	System.out.println(list2.add("c2").getReturnValue());
	System.out.println(list2.add("c3").getReturnValue());
	System.out.println(list2.add("c4").getReturnValue());
	System.out.println(list2.add("c5").getReturnValue());
	System.out.println(list2.head().getReturnValue());
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println(list2.head().getError());
	System.out.println(list2.get(0).getReturnValue());
	System.out.println(list2.get(1).getReturnValue());
	System.out.println(list2.get(2).getReturnValue());
	System.out.println(list2.get(3).getReturnValue());
	System.out.println(list2.get(4).getReturnValue());
	System.out.println(list2.head().getReturnValue());
	System.out.println(list2.rest().get(2).getReturnValue());
	System.out.println("");
	System.out.println("");
	System.out.println("");
	
	System.out.println(list2.get(0).getReturnValue());
	System.out.println(list2.rest().get(0).getReturnValue());
	System.out.println(list2.rest().get(1).getReturnValue());
	
	System.out.println("");
	System.out.println("");
	System.out.println("");
	SampleableList list3 = new SampleableListImpl();
	
	System.out.println(list3.add("d1").getReturnValue());
	System.out.println(list3.add("d2").getReturnValue());
	System.out.println(list3.add("d3").getReturnValue());
	System.out.println(list3.add("d4").getReturnValue());
	System.out.println(list3.add("d5").getReturnValue());
	System.out.println(list3.sample().get(0).getReturnValue());
	System.out.println(list3.sample().get(1).getReturnValue());
	System.out.println(list3.sample().get(2).getReturnValue());
	System.out.println("");
	System.out.println("");
	System.out.println("");
	Stack stack = new StackImpl(list1);
	System.out.println(stack.isEmpty());
	System.out.println(stack.size());
	System.out.println(stack.top().getReturnValue());
	stack.push("1st push");
	
	System.out.println(stack.top().getReturnValue());
	
	ReturnObject obj = stack.pop();
	System.out.println(stack.top().getReturnValue());
	ReturnObject obj1 = stack.pop();
	System.out.println(stack.top().getReturnValue());
	
	System.out.println(stack.size());
	
	System.out.println("");
	System.out.println("");
	System.out.println("");
	
		
	}
}