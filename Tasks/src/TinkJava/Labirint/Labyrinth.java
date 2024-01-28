package TinkJava.Labirint;

import java.util.*;
import java.io.*;

public class Labyrinth {
    static int n;
    static Map<Integer, List<Integer>> graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        graph = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            String[] parts = br.readLine().split(" ");
            int u = Integer.parseInt(parts[0]);
            int v = Integer.parseInt(parts[1]);

            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        int q = Integer.parseInt(br.readLine());
        while (q-- > 0) {
            String[] query = br.readLine().split(" ");
            int from = Integer.parseInt(query[0]);
            int to = Integer.parseInt(query[1]);

            System.out.println(findMinPath(from, to));
        }
    }

    private static int findMinPath(int start, int end) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        int[] distance = new int[n + 1];

        queue.offer(start);
        visited[start] = true;
        distance[start] = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == end) {
                return distance[current];
            }

            for (int neighbor : graph.getOrDefault(current, Collections.emptyList())) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    distance[neighbor] = distance[current] + 1;
                    queue.offer(neighbor);
                }
            }
        }

        return -1;
    }
}

class Result {

    private static ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
    private static int[] parent;

    private static void buildGraph(int n, Scanner scanner) {
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[adjList.size()];
        queue.add(start);
        visited[start] = true;
        parent[start] = -1;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int neighbor : adjList.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                    parent[neighbor] = node;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        parent = new int[n];
        buildGraph(n, scanner);

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int start = scanner.nextInt() - 1;
            int end = scanner.nextInt() - 1;

            bfs(start);
            int nextRoom = end;
            while (parent[nextRoom] != start) {
                nextRoom = parent[nextRoom];
            }
            System.out.println(nextRoom + 1);
        }
        scanner.close();
    }

}
