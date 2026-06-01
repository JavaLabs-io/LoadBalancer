import java.util.ArrayList;
import java.util.List;

public class LoadBalancer {

    private List<String> servers;
    private int currentIndex;

    public LoadBalancer() {
        servers = new ArrayList<>();
        currentIndex = 0;
    }

    public void addServer(String server) {
        servers.add(server);
        System.out.println("Added: " + server);
    }

    public String getNextServer() {
        if (servers.isEmpty()) {
            return "No servers available";
        }

        String server = servers.get(currentIndex);

        currentIndex = (currentIndex + 1) % servers.size();

        return server;
    }

    public void displayServers() {
        System.out.println("\nServers:");
        for (String server : servers) {
            System.out.println(server);
        }
    }
}