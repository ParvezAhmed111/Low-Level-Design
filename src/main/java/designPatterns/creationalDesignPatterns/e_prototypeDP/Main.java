package designPatterns.creationalDesignPatterns.e_prototypeDP;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating object using prototype design");

        NetworkConnection networkConnection= new NetworkConnection();
        networkConnection.setIp("192.168.4.4");
        networkConnection.loadVeryImportantData();
        System.out.println(networkConnection);

        // we want new object of netwprk connection
        try {
            NetworkConnection networkConnection1= (NetworkConnection) networkConnection.clone();
            NetworkConnection networkConnection2= (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection1);
            System.out.println(networkConnection2);
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }
    }
}
