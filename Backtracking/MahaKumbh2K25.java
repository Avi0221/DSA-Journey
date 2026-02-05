import java.util.*;

public class MahaKumbh2K25 {

    static class RailwayNetwork {
        private final Map<Integer, Set<Integer>> graph = new HashMap<Integer, Set<Integer>>();

        // Add bidirectional connection
        void addConnection(int from, int to) {
            graph.putIfAbsent(from, new HashSet<Integer>());
            graph.putIfAbsent(to, new HashSet<Integer>());
            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        // Remove bidirectional connection
        void removeConnection(int from, int to) {
            if (graph.containsKey(from)) graph.get(from).remove(to);
            if (graph.containsKey(to)) graph.get(to).remove(from);
        }

        // Find shortest path using BFS; returns empty list if none
        List<Integer> findRoute(int src, int dest) {
            if (!graph.containsKey(src) || !graph.containsKey(dest)) return Collections.emptyList();
            if (src == dest) return Collections.singletonList(src);

            Queue<Integer> queue = new LinkedList<Integer>();
            Map<Integer, Integer> parent = new HashMap<Integer, Integer>();
            Set<Integer> visited = new HashSet<Integer>();

            queue.add(src);
            visited.add(src);
            parent.put(src, -1);

            while (!queue.isEmpty()) {
                int curr = queue.poll();
                for (Integer neighbor : graph.getOrDefault(curr, Collections.<Integer>emptySet())) {
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        parent.put(neighbor, curr);
                        queue.add(neighbor);
                        if (neighbor == dest) {
                            return reconstructPath(parent, dest);
                        }
                    }
                }
            }

            return Collections.emptyList();
        }

        private List<Integer> reconstructPath(Map<Integer, Integer> parent, int dest) {
            List<Integer> path = new ArrayList<Integer>();
            for (int at = dest; at != -1; at = parent.get(at)) {
                path.add(at);
            }
            Collections.reverse(path);
            return path;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RailwayNetwork network = new RailwayNetwork();

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }

        int numStations = scanner.nextInt();
        int initialConnections = scanner.nextInt();

        for (int i = 0; i < initialConnections; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            network.addConnection(from, to);
        }

        int q = 0;
        if (scanner.hasNextInt()) q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            String type = scanner.next();
            if ("connect".equals(type)) {
                int from = scanner.nextInt();
                int to = scanner.nextInt();
                network.addConnection(from, to);
            } else if ("disconnect".equals(type)) {
                int from = scanner.nextInt();
                int to = scanner.nextInt();
                network.removeConnection(from, to);
            } else if ("check".equals(type)) {
                int src = scanner.nextInt();
                int dest = scanner.nextInt();
                List<Integer> path = network.findRoute(src, dest);
                if (!path.isEmpty()) {
                    System.out.print("YES -> Path: ");
                    for (int j = 0; j < path.size(); j++) {
                        System.out.print(path.get(j));
                        if (j < path.size() - 1) System.out.print(" -> ");
                    }
                    System.out.println();
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("Invalid command: " + type);
            }
        }

        scanner.close();
    }
}