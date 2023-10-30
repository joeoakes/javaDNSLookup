import java.net.InetAddress;
import java.net.UnknownHostException;

public class DNSLookup {
    public static void main(String[] args) {
        // Hostname to IP Address
        String hostname = "www.cnn.com"; // Replace with the hostname you want to resolve

        try {
            InetAddress[] addresses = InetAddress.getAllByName(hostname);

            System.out.println("IP Addresses for " + hostname + ":");
            for (InetAddress address : addresses) {
                System.out.println(address.getHostAddress());
            }
        } catch (UnknownHostException e) {
            System.err.println("Unable to resolve hostname: " + hostname);
            e.printStackTrace();
        }

        System.out.println();

        // IP Address to Hostname
        String ipAddress = "93.184.216.34"; // Replace with the IP address you want to resolve

        try {
            InetAddress address = InetAddress.getByName(ipAddress);

            System.out.println("Hostname for " + ipAddress + ": " + address.getHostName());
        } catch (UnknownHostException e) {
            System.err.println("Unable to resolve IP address: " + ipAddress);
            e.printStackTrace();
        }
    }
}

