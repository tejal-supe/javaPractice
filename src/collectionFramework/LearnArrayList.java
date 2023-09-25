package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> students = new ArrayList<String>();
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> listAll = new ArrayList<Integer>();
		students.add("Tejal");
		students.add("Abc");
		students.add("Xya");
		students.add("jhwgd");
		students.add("qwerty");
		students.add("Tejaa");
		students.add("ji");
		students.add("miula");
		
		list.add(1);
		list.add(2);
		list.add(3);
//		System.out.println(list);
		list.add(4);
		
		list.add(2,7);
		System.out.println(list);
		
		listAll.add(50);
		listAll.add(100);
		list.addAll(listAll);
		System.out.println(list);
		System.out.println(list.get(5));

	}

}


/* ArrayList - can allot memory dynamically which is not the case with normal Arrays(as they give out of bound exception )
 * 	-- upon creation it is an empty and when we add 1st element it allots the 10 element size if the size increment is needed
 * 		 then it increases by n + n/2+1
 *
 * 
 * */
 