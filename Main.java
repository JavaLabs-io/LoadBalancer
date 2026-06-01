public class Main {

    public static void main(String[] args) {

        LoadBalancer lb = new LoadBalancer();

        lb.addServer("Server A");
        lb.addServer("Server B");
        lb.addServer("Server C");

        System.out.println("\nRequest 1 -> " + lb.getNextServer());
        System.out.println("Request 2 -> " + lb.getNextServer());
        System.out.println("Request 3 -> " + lb.getNextServer());
        System.out.println("Request 4 -> " + lb.getNextServer());
        System.out.println("Request 5 -> " + lb.getNextServer());
        System.out.println("Request 6 -> " + lb.getNextServer());
    }
}
