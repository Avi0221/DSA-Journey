import java.util.*;

public class ActivityDay {

    // Graph representation using adjacency list
    static class Graph {
        private Map<Integer, List<Integer>> adjList = new HashMap<>();

        // Add activity connection
        public void addConnection(int from, int to) {
            adjList.putIfAbsent(from, new ArrayList<>());
            adjList.get(from).add(to);
        }

        // Remove activity connection
        public void removeConnection(int from, int to) {
            if (adjList.containsKey(from)) {
                adjList.get(from).remove(Integer.valueOf(to));
            }
        }

        // Check if there is a path from source to destination
        public boolean isPathAvailable(int src, int dest) {
            if (src == dest) return true;
            Set<Integer> visited = new HashSet<>();
            Queue<Integer> queue = new LinkedList<>();
            queue.add(src);

            while (!queue.isEmpty()) {
                int current = queue.poll();
                if (current == dest) return true;
                visited.add(current);

                for (int neighbor : adjList.getOrDefault(current, Collections.emptyList())) {
                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);
                    }
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Graph graph = new Graph();

        int n = scanner.nextInt(); // number of activities
        int m = scanner.nextInt(); // number of initial connections

        // Add initial connections
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.addConnection(u, v);
        }

        int q = scanner.nextInt(); // number of queries

        // Process queries
        for (int i = 0; i < q; i++) {
            String action = scanner.next();
            if (action.equalsIgnoreCase("add")) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                graph.addConnection(u, v);
            } else if (action.equalsIgnoreCase("remove")) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                graph.removeConnection(u, v);
            } else if (action.equalsIgnoreCase("check")) {
                int src = scanner.nextInt();
                int dest = scanner.nextInt();
                boolean exists = graph.isPathAvailable(src, dest);
                System.out.println(exists ? "YES" : "NO");
            }
        }
        scanner.close();
    }
}