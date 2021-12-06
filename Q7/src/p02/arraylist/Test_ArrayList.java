package p02.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Test_ArrayList {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i<5; i++) {
			System.out.println("list1의 원소를 입력하세요");
			list1.add(input.nextInt());
			
			System.out.println("list2의 원소를 입력하세요");
			list2.add(input.nextInt());
		}
		
		Set<Integer> set = new HashSet<Integer>(union(list1, list2));
		System.out.println(set);
		
	}

	public static ArrayList<Integer> union(List<Integer> list1, List<Integer> list2) {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i : list1) {
			list.add(i);
		}
		for (int i : list2) {
			list.add(i);
		}
		return (ArrayList<Integer>) list;
		
		
	}
	
	

}
