package org.testleaf.week4.day1;

public class JavaConnections implements Interface {
        public void connect() {
        System.out.println("Connected to the db");
    }

       public void disconnect() {
        System.out.println("Disconnected from the db");
    }

       public void executeUpdate() {
        System.out.println("Executed the update");
    }

    public static void main(String[] args) {
        JavaConnections connections = new JavaConnections();
        connections.connect();
        connections.disconnect();
        connections.executeUpdate();
    }

}
