// We list all the methods that the array list will need
public interface BareBonesArrayList <E> {
	public void add(E a); // adds to the end of the list
	public void add(E a, int index); // adds to given index
	public E remove(int index); // delete the element at given index
	public E get(int index); // returns the element without deleting 
	public void set(E a, int index); //updates the element
	public int getsize(); // returns how many elements are in array list
	public int indexOf(E a); // search for element, return -1 if not found
	
}
