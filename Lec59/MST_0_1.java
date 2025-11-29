package Lec59;

import java.util.*;

public class MST_0_1 {

	static HashMap<Integer, HashSet<Integer>> map;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		map = new HashMap<>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			map.put(i, new HashSet<>());
		}
		for (int i = 1; i <= m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map.get(a).add(b);
			map.get(b).add(a);
		}
		System.out.println(prims());

	}

	public static int prims() {
		PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
		pq.add(new Pair(1, 0));
		HashSet<Integer> visited = new HashSet<>();
		int sum=0;
		while (!pq.isEmpty()) {
			// 1. remove
			Pair rp = pq.poll();
			// 2. Ignore if Already visited
			if(visited.contains(rp.vtx)) {
				continue;
			}
			// 3. Marked visited
			visited.add(rp.vtx);
			// 4. self work
			sum+=rp.cost;
			// 5. Add nbrs
			for(int nbrs=1; nbrs<=map.size(); nbrs++) {
				if(!visited.contains(nbrs)) {
					int cost=0;
					if(map.get(rp.vtx).contains(nbrs)) {
						cost++;
					}
					pq.add(new Pair(nbrs, cost));
				}
				
			}

		}
		return sum;

	}

	static class Pair {
		int vtx;
		int cost;

		public Pair(int vtx, int cost) {
			// TODO Auto-generated constructor stub
			this.cost = cost;
			this.vtx = vtx;
		}
	}

}
