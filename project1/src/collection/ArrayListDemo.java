package collection;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list1= new ArrayList<>();
		list1.add(1);
		list1.add(67);
		list1.add(10);
		list1.add(7);
		list1.remove(2);
		list1.add(2,100);
		list1.remove(1);//index ko remove krna
		list1.set(2, 50);//index value replace krne k liye
		list1.remove(Integer.valueOf(1));//specific value ko remove krna
		System.out.println(list1.contains(5));//value ko check krna
		
		System.out.println(list1);
		ArrayList<Integer> list2= new ArrayList<>();
		list2.add(7);
		list2.add(9);
		list2.add(50);
		System.out.println(list1.contains(list2));
		ArrayList<Integer> list3= new ArrayList<>();
		list3.add(100);
		list3.add(50);
		System.out.println(list1.containsAll(list3));
//		for(int i=0;i<list1.size();i++) {
//		System.out.println(list1.get(i));
//		}
//		for(Integer x:list1) {
//			System.out.println(x);
//		}
		

	}

}