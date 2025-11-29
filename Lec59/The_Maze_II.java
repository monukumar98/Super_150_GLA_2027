package Lec59;

import java.util.PriorityQueue;

public class The_Maze_II {
	class Solution {
		public int shortestDistance(int[][] maze, int[] start, int[] destination) {
			PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
			boolean[][] visited = new boolean[maze.length][maze[0].length];
			pq.add(new int[] { start[0], start[1], 0 });
			int[] r = { -1, 1, 0, 0 };
			int[] c = { 0, 0, 1, -1 };
			while (!pq.isEmpty()) {
				// 1. remove
				int [] curr=pq.poll();
				// 2. Ignore if already visited;
				if(visited[curr[0]][curr[1]]==true) {
					continue;
				}
				// 3. marked visited
				visited[curr[0]][curr[1]]=true;
				// 4. self work
				if(curr[0]==destination[0] && curr[1]==destination[1]) {
					return curr[2];
				}
				// 5. add nbrs
				for (int i = 0; i <4; i++) {
					int x=curr[0];
					int y=curr[1];
					while(x+r[i]>=0 && x+r[i]<maze.length && y+c[i]>=0 && y+c[i]<maze[0].length && maze[x+r[i]][y+c[i]]==0) {
						x+=r[i];
						y+=c[i];
					}
					if(x!=curr[0] || y!=curr[1]) {
						int cost=Math.abs(x-curr[0])+Math.abs(y-curr[1]);
						pq.add(new int [] {x,y,curr[2]+cost});
					}
					
				}

			}
			return -1;

		}
	}

}
