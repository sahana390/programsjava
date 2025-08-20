class NetworkRunner{

public static void main(String clips[]){
System.out.println("main started");

Network network = new Network();





network. ipAddress="192.168.0.1" ;      
network. macAddress ="00:1A:2B:3C:4D:5E";
network. hostName="my-computer.local"; 
network. port=8080;
network. protocol= "TCP";
network. subnetMask="255.255.255.0";
network. gateway="192.168.0.1";
network. dnsServer="8.8.8.8";
network. isConnected=true;
network. connectionType="WiFi";
network. bandwidth=100.0f;
network.dataTransferred=102400l;
network. networkName="MyWiFi";
network. signalStrength=65;
network. encryptionType="WPA2";
network. uploadSpeed=50.5f;
network. downloadSpeed=100.7f;
network. networkStatus="Online";
network. interfaceName="wlan0";


network.getNetworkInfo();


System.out.println("main ended");



}



}