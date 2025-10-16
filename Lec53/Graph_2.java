package Lec53;

import java.util.*;

public class Graph_2 {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph_2(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public boolean BFS(int src, int des) {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		q.add(src);
		while (!q.isEmpty()) {
			// 1. remove
			int r = q.poll();
			// 2. Ignore if Already visited
			if (visited.contains(r)) {
				continue;
			}
			// 3. Makred visited
			visited.add(r);
			// 4. self work
			if (r == des) {
				return true;
			}
			// 5. Add unvisited nbrs
			for (int nbrs : map.get(r).keySet()) {
				if (!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		return false;

	}

	public boolean DFS(int src, int des) {
		Stack<Integer> st = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		st.push(src);
		while (!st.isEmpty()) {
			// 1. remove
			int r = st.pop();
			// 2. Ignore if Already visited
			if (visited.contains(r)) {
				continue;
			}
			// 3. Makred visited
			visited.add(r);
			// 4. self work
			if (r == des) {
				return true;
			}
			// 5. Add unvisited nbrs
			for (int nbrs : map.get(r).keySet()) {
				if (!visited.contains(nbrs)) {
					st.push(nbrs);
				}
			}
		}
		return false;

	}

	public void BFT() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {
				// 1. remove
				int r = q.poll();
				// 2. Ignore if Already visited
				if (visited.contains(r)) {
					continue;
				}
				// 3. Makred visited
				visited.add(r);
				// 4. self work
				System.out.print(r + " ");
				// 5. Add unvisited nbrs
				for (int nbrs : map.get(r).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		System.out.println();

	}

	public void DFT() {
		Stack<Integer> st = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if(visited.contains(src)) {
				continue;
			}
			st.push(src);
			while (!st.isEmpty()) {
				// 1. remove
				int r = st.pop();
				// 2. Ignore if Already visited
				if (visited.contains(r)) {
					continue;
				}
				// 3. Makred visited
				visited.add(r);
				// 4. self work
				System.out.print(r + " ");
				// 5. Add unvisited nbrs
				for (int nbrs : map.get(r).keySet()) {
					if (!visited.contains(nbrs)) {
						st.push(nbrs);
					}
				}
			}
		}
		System.out.println();

	}
}
