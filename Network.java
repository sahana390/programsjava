class Network{


String ipAddress ;            
String macAddress ;     
String hostName;                          
int port;                                
String protocol; 
String subnetMask;                    
String gateway;                       
String dnsServer;                      
boolean isConnected;                         
String connectionType;                  
float bandwidth;                    
int latency;                  
long dataTransferred;    
String networkName;               
int signalStrength;                 
String encryptionType;          
float uploadSpeed;                      
float downloadSpeed;                 
String networkStatus;                     
String interfaceName; 

public void getNetworkInfo(){
	
	System.out.println("The network is "+ipAddress);
System.out.println("The network is "+macAddress);
System.out.println("The network is "+hostName);
System.out.println("The network is "+port);
System.out.println("The network is "+protocol);
System.out.println("The network is "+subnetMask);
System.out.println("The network is "+gateway);
System.out.println("The network is "+dnsServer);
System.out.println("The network is "+isConnected);
System.out.println("The network is "+bandwidth);
System.out.println("The network is "+connectionType);
System.out.println("The network is "+dataTransferred);
System.out.println("The network is "+networkName);
System.out.println("The network is "+signalStrength);
System.out.println("The network is "+encryptionType);
System.out.println("The network is"+uploadSpeed);
System.out.println("The network is"+downloadSpeed);
System.out.println("The network is "+networkStatus);
System.out.println("The network is "+interfaceName);
}      





}