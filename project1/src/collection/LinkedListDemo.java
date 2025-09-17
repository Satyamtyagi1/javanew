package collection;
import java.util.LinkedList;
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> ll1=new LinkedList<>();
		ll1.add(1);
		ll1.add(2);
		ll1.add(3);
		ll1.add(2);
		ll1.addFirst(0);
		ll1.getFirst();
		System.out.println(ll1);
	}

}