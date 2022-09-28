
public class ArrayListDriver {
	// here we create ArrayList Object and test the methods
	public static void main(String[] args) {
		DHArrayList<Integer> list = new DHArrayList<>(1);
		// we have an array list created
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list); // the toString() method is called
		list.add(50);
		System.out.println(list); // the toString() method is called
		list.add(100, 3);
		System.out.println(list); // the toString() method is called
		list.remove(1);
		System.out.println(list);
		Integer value = list.get(3);
		System.out.println("The value at location 3: " + value);
		list.set(99, 0);
		System.out.println(list);
		Integer index = list.indexOf(100);
		System.out.println("The index of value 100 is: " + index);

	}

}
