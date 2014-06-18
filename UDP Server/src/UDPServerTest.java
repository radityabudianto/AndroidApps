import java.io.*;
import java.net.*;
	
public class UDPServerTest {
//	import java.io.*;
	//import java.net.*;
	final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();
	   public static void main(String args[]) throws Exception
	      {
	         DatagramSocket serverSocket = new DatagramSocket(5001);
	            byte[] receiveData = new byte[188];
	            //byte[] sendData = new byte[1024];
	            while(true)
	               {
	                  DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
	                  serverSocket.receive(receivePacket);
	                  System.out.println(bytesToHex(receivePacket.getData()));
	               }
	      }
	   
	   public static String bytesToHex(byte[] bytes) {
		    char[] hexChars = new char[bytes.length * 2];
		    for ( int j = 0; j < bytes.length; j++ ) {
		        int v = bytes[j] & 0xFF;
		        hexChars[j * 2] = hexArray[v >>> 4];
		        hexChars[j * 2 + 1] = hexArray[v & 0x0F];
		    }
		    return new String(hexChars);
		}
	} //- See more at: http://systembash.com/content/a-simple-java-udp-server-and-udp-client/#sthash.MUgp0VTm.dpuf

