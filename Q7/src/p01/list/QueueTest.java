package p01.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// 큐가 인터페이스이므로, 구현은 linkedlist로
		Queue<String> queue = new LinkedList<String>();

		queue.add("JAVA");
		queue.add("SCRIPT");
		queue.add("JSP");
		while (!queue.isEmpty()) {
			System.out.println(queue.remove());

		}

	}
}
