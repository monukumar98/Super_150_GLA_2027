package Lec58;

import java.util.LinkedList;
import java.util.Queue;

public class Longest_Cycle_in_a_Graph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] edges = { 3, 3, 4, 2, 3 };

	}

	public static int longestCycle(int[] edges) {
		int[] in = new int[edges.length];
		for (int i = 0; i < edges.length; i++) {
			if (edges[i] != -1) {
				in[edges[i]]++;
			}
		}
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}
		boolean[] visited = new boolean[edges.length];
		while (!q.isEmpty()) {
			int e = q.poll();
			visited[e] = true;
			if (edges[e] != -1) {
				in[edges[e]]--;
				if (in[edges[e]] == 0) {
					q.add(edges[e]);
				}
			}
		}
		int ans = -1;
		for (int i = 0; i < visited.length; i++) {
			if (visited[i] == false) {
				int c = 1;
				visited[i] = true;
				int nbrs = edges[i];
				while (nbrs != i) {
					c++;
					visited[nbrs] = true;
					nbrs = edges[nbrs];
				}
				ans = Math.max(ans, c);

			}

		}
		return ans;
	}

}
