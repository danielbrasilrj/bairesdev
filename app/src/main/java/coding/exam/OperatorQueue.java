package coding.exam;

import java.util.LinkedList;
import java.util.Queue;

public final class OperatorQueue {

	final Queue<Person> queue = new LinkedList<>();

	public Queue<Person> getQueue() {
		return queue;
	}

	public void enqueue(Person person) {
		queue.add( person );
	}

	public Person dequeue() {
		return queue.poll();
	}

	public record Person(String name, String surname) {}
}
