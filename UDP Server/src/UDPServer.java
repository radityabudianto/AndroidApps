import java.io.*;
import java.net.*;
import java.nio.ByteBuffer;

class UDPServer
{
	final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();
   public static void main(String argv[]) throws Exception  
   {
	  
	   DatagramSocket datagramSocket = new DatagramSocket(80);

	   byte[] buffer = new byte[512];
	  // DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

	   datagramSocket.receive(packet);
	   while (true) {
		   datagramSocket.receive(packet);
		   buffer = packet.getData();   
		   System.out.print(bytesToHex(buffer));
		   
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

}
