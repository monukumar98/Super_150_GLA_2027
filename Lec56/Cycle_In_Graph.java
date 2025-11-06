package Lec56;

import java.util.*;


public class Cycle_In_Graph {

	private HashMap<Integer, List<Integer>> map;

	public Cycle_In_Graph(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 0; i < v; i++) {
			map.put(i, new ArrayList<>());
		}
	}

	public void Addedge(int v1, int v2) {
		map.get(v1).add(v2);

	}

	public int[] indegree() {
		int[] in = new int[map.size()];
		for (int v1 : map.keySet()) {
			for (int v2 : map.get(v1)) {
				in[v2]++;
			}
		}
		return in;
	}

	public boolean isCycle() {
		Queue<Integer> q = new LinkedList<>();
		int[] in = indegree();
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}
		int c=0;
		while (!q.isEmpty()) {
			int r = q.poll();
			c++;
			for(int nbrs:map.get(r)) {
				in[nbrs]--;
				if(in[nbrs]==0) {
					q.add(nbrs);
				}
			}

		}
		return c!=map.size();
		

	}

}
