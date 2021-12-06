package p01.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
        
        //LinkedList => LinkedList<T>

		List<Character> list = new LinkedList<Character>();
        
        list.add(new Character('a'));
        list.add(new Character('b'));
        list.add(new Character('c'));
        
        for (int j = 0; j<2; j++) {
        	for (int i =0; i<list.size();i++){
            System.out.print(list.get(i)+"\t");
        	}
            System.out.println();
        }

	}

}
