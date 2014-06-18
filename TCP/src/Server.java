
import java.io.*;
import java.net.*;
import java.util.Scanner;

class Server
{
   public static void main(String argv[]) throws Exception
      {
        // String clientSentence;
         //String capitalizedSentence;
         ServerSocket welcomeSocket = new ServerSocket(6789);

         while(true)
         {
            Socket connectionSocket = welcomeSocket.accept();
            Scanner s= new Scanner(System.in);
            System.out.print(s.next());
            
         }
      }
} 