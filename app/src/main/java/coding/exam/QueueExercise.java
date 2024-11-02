package com.exercise.jaalamc;

import java.util.LinkedList;
import java.util.Queue;

public final class QueueExercise {

	private Queue<String> queue = new LinkedList<>();

	/**
	 * Enqueue a person in the queue and return its position in the queue.
	 */
	public int enqueue(String personName) {
		queue.offer( personName );
		return queue.size();
	}

	/**
	 * Dequeue a person from the queue. Return the person name dequeued.
	 */
	public String dequeue() {
		return queue.poll();
	}

	public int getPosition(String personName) {
		for(int i = queue.size() ; i >= 1  ; i--) {
			if(queue.peek().equals( personName )) {
				return i;
			}
		}
		return 0;
	}
}
