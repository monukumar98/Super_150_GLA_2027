package Lec43;

import java.util.ArrayList;

public class Heap {
	private ArrayList<Integer> ll = new ArrayList<>();

	public void add(int item) {
		ll.add(item);
		upheapify(ll.size() - 1);
	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (ll.get(pi) > ll.get(ci)) {
			swap(pi, ci);
			upheapify(pi);
		}

	}

	private void swap(int pi, int ci) {
		// TODO Auto-generated method stub
		int pith = ll.get(pi);
		int cith = ll.get(ci);
		ll.set(pi, cith);
		ll.set(ci, pith);

	}

	public int remove() {
		swap(0, ll.size() - 1);
		int val = ll.remove(ll.size() - 1);
		downheapif(0);
		return val;

	}

	private void downheapif(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < ll.size() && ll.get(mini) > ll.get(lci)) {
			mini = lci;
		}
		if (rci < ll.size() && ll.get(mini) > ll.get(rci)) {
			mini = rci;
		}
		if (mini != pi) {
			swap(mini, pi);
			downheapif(mini);
		}

	}

	public int get() {
		return ll.get(0);
	}

	public int size() {
		return ll.size();
	}

	public void Display() {
		System.out.println(ll);
	}
}



