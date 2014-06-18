import java.io.*;
import java.net.*;

class Client
{
	
 public static void main(String argv[]) throws Exception
 {
  String sentence;
  BufferedReader inFromUser = new BufferedReader( new InputStreamReader(System.in));
  Socket clientSocket = new Socket("localhost", 6789);
  DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
  sentence = inFromUser.toString();
  outToServer.writeBytes(sentence);
  clientSocket.close();
 }
} 