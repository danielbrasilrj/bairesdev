package com.exercise.jaalamc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class TwoLists {

	List<Integer> C = new ArrayList<>();
	List<Integer> D = new ArrayList<>();

	public List<Integer> getC() {
		return C;
	}

	public List<Integer> getD() {
		return D;
	}

	public void createNewLists(List<Integer> A, List<Integer> B) {
		C.addAll( A );
		C.addAll( B );

		D.addAll( B );
		D.removeAll( A );

		Collections.sort( C );
		Collections.sort( D );
	}

	public static void main(String[] args) {
		List<Integer> A = List.of(1, 3, 5, 7);
		List<Integer> B = List.of(1, 3, 5, 7, 2, 4, 6, 8);

		TwoLists twoLists = new TwoLists();
		twoLists.createNewLists( A, B );

		System.out.println( twoLists.getC() );
		System.out.println( twoLists.getD() );
	}
}
