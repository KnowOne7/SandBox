package FAANG;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijkstras {
    public static void main(String[] args) {
        int[][] times = new int[7][2];
        times = new int[][] {{1, 2, 9}, {1, 4, 2}, {2, 5, 1}, {4, 2, 4}, {5, 4, 6}, {3, 2, 3}, {5, 3, 7}, {3, 1, 5}};
        // k is the starting node
        // n number of nodes
        networkDelayTime(times, 5, 1);

        int[][] times2 = {{2,1,1},{2,3,1},{3,4,1}};
        networkDelayTime(times2, 4, 2);

        }

        public static int networkDelayTime ( int [][] times, int n, int k){
            // Create Distances Array to hold min distance between Adjacency
            int[] distance = new int[n];
            Arrays.fill(distance, Integer.MAX_VALUE);
            distance[k - 1] = 0;

            // Create Adjacency list and fill
            int[][] graph = new int[n][n];
            for(int i = 0; i < n ; i++)
                Arrays.fill(graph[i], Integer.MAX_VALUE);
            // Fill Graph. Make graph at times Amount fit index. Make indexes of graph produce time.
            for( int[] rows : times)
                graph[rows[0] - 1][rows[1] - 1] =  rows[2];

//            [i, i, 2, i, i]
//            [i, 9, i, i, i]
//            [i, 3, i, i, 1]
//            [5, 4, i, i, i]
//            [i, i, 7, 6, i]

            // Create Boolean based on index if visited or not. Default to false;
            boolean[] visited = new boolean[n];

            // path variables.
            int[] path = new int[n];
            int countPath = 0;

            // for each node in Matrix, find the least time to each node.
            for(int i = 0; i < n ; i++){

                int v = minIndex(distance, visited);
                if(v == -1)continue; // if can't reach node, continue to start. Will complete distances but ultimately return -1;
                visited[v] = true;

                // record paths taken
                path[countPath] = v;
                countPath++;

                System.out.println(Arrays.toString(visited));

                // if new value to next closest node is < previous number, use minimal number.
                for(int j = 0; j < n; j++){
                    if(graph[v][j] != Integer.MAX_VALUE){
                        int newDist = graph[v][j] + distance[v];
                        if(newDist < distance[j])
                            distance[j] = newDist;
                    }
                }
            }
            int result = 0;
//            [0, 6, 14, 2, 7]
            for(int dist : distance){
                if(dist == Integer.MAX_VALUE) return -1; // base case for non connected graph.
                result = Math.max(result, dist);
            }
            // Print path taken
            for(Integer i : path)
                System.out.println(i+1);
            return result;
        }


        // finds next closest node value and iterates. Min index above will lower value if necessary.
        private static int minIndex(int[] distance, boolean[] visited){
            int min = Integer.MAX_VALUE; // set min to max.
            int minIndex = -1;  // set index to not visited
            for(int i = 0; i < distance.length; i++){
                if(!visited[i] && distance[i] < min){
                    min = distance[i];
                    minIndex = i;
                    System.out.println(Arrays.toString(distance));
                }
            }
            System.out.println(minIndex);
            return minIndex;
        }
    }




    /*
    class PriorityQueue {
  constructor(comparator = (a, b) => a > b) {
    this._heap = [];
    this._comparator = comparator;
  }

  size() {
    return this._heap.length;
  }

  peek() {
    return this._heap[0];
  }

  isEmpty() {
    return this._heap.length === 0;
  }

  _parent(idx) {
    return Math.floor((idx - 1) / 2);
  }

  _leftChild(idx) {
    return idx * 2 + 1;
  }

  _rightChild(idx) {
    return idx * 2 + 2;
  }

  _swap(i, j) {
    [this._heap[i], this._heap[j]] = [this._heap[j], this._heap[i]];
  }

  _compare(i, j) {
    return this._comparator(this._heap[i], this._heap[j]);
  }

  push(value) {
    this._heap.push(value);
    this._siftUp();

    return this.size();
  }

  _siftUp() {
    let nodeIdx = this.size() - 1;

    while (0 < nodeIdx && this._compare(nodeIdx, this._parent(nodeIdx))) {
      this._swap(nodeIdx, this._parent(nodeIdx));
      nodeIdx = this._parent(nodeIdx);
    }
  }

  pop() {
    if (this.size() > 1) {
      this._swap(0, this.size() - 1);
    }

    const poppedValue = this._heap.pop();
    this._siftDown();
    return poppedValue;
  }

  _siftDown() {
    let nodeIdx = 0;

    while (
      (this._leftChild(nodeIdx) < this.size() &&
        this._compare(this._leftChild(nodeIdx), nodeIdx)) ||
      (this._rightChild(nodeIdx) < this.size() &&
        this._compare(this._rightChild(nodeIdx), nodeIdx))
    ) {
      const greaterChildIdx =
        this._rightChild(nodeIdx) < this.size() &&
        this._compare(this._rightChild(nodeIdx), this._leftChild(nodeIdx))
          ? this._rightChild(nodeIdx)
          : this._leftChild(nodeIdx);

      this._swap(greaterChildIdx, nodeIdx);
      nodeIdx = greaterChildIdx;
    }
  }
}

 const t = [[1, 2, 9], [1, 4, 2], [2, 5, 1], [4, 2, 4], [4, 5, 6],[3, 2, 3], [5, 3, 7], [3, 1, 5]]

const networkDelayTime = function(times, N, k) {
  const distances = new Array(N).fill(Infinity);
  const adjList = distances.map(() => []);
  distances[k - 1] = 0;

  const heap = new PriorityQueue((a, b) => distances[a] < distances[b]);
  heap.push(k - 1);

  for(let i = 0; i < times.length; i++) {
    const source = times[i][0];
    const target = times[i][1];
    const weight = times[i][2];
    adjList[source - 1].push([target - 1, weight]);
  }

  while(!heap.isEmpty()) {
    const currentVertex = heap.pop();

    const adjacent = adjList[currentVertex];
    for(let i = 0; i < adjacent.length; i++) {
      const neighboringVertex = adjacent[i][0];
      const weight = adjacent[i][1];
      if(distances[currentVertex] + weight < distances[neighboringVertex]) {
          distances[neighboringVertex] = distances[currentVertex] + weight;
          heap.push(neighboringVertex);
      }
    }
  }

  const ans = Math.max(...distances);

  return ans === Infinity ? -1 : ans;
};

console.log(networkDelayTime(t, 5, 1))

     */

/* Python

from collections import defaultdict
import heapq


class Solution:
    def networkDelayTime(self, times, n, k):
        """
        :type times: List[List[int]]
        :type n: int
        :type k: int
        :rtype: int
        """
        delay_list = {}
        done_list = set()
        graph = defaultdict(list)
        for src, dst, time in times:
            graph[src].append((dst, time))
        for i in range(1, n + 1):
            delay_list[i] = float('inf')
        heap = []
        # Use a min-heap to take min timed value among the next set of nodes
        heapq.heappush(heap, (0, k))
        # Once we are done with exploring all the nodes, add it to done_list.
        done_list.add(k)
        while heap:
            time, next_node = heapq.heappop(heap)
            # Check if we have visited this node with lower time already, then do not
            # Overwrite, else update the value
            if delay_list[next_node] > time:
                delay_list[next_node] = time
            if next_node not in graph:
                continue
            adj_list = graph[next_node]
            for adj_node, adj_node_time in adj_list:
                # If the node is already in done_list,
                # then do not add it again.
                if adj_node not in done_list:
                    heapq.heappush(heap, (time + adj_node_time, adj_node))
            done_list.add(next_node)
        max_value = max(delay_list.values())
        if max_value == float('inf'):
            return -1
        return max_value



sol = Solution()
n = 5
k = 1
nodes = [1, 2, 3, 4, 5]
times = [[1, 2, 9], [1, 4, 2], [2, 5, 1], [4, 2, 4], [4, 5, 6], [3, 2, 3], [5, 3, 7], [3, 1, 5]]
print(sol.networkDelayTime(times, n, k))
 */