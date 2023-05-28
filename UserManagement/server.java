import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import java.net.*;
import java.io.*;
import java.util.*;
public class server {
    public static void main(String[] args){
        try{
            ServerSocket ss =new ServerSocket(1111);
            Socket s=ss.accept();
            DataInputStream din=new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            String str=din.readUTF();
            Scanner sc=new  Scanner(System.in);
            String send,end="bye";
               while(true){
              
                System.out.println("Client:" +str);
                send=sc.nextLine();
                dout.writeUTF(send);
                str=din.readUTF();
            }
            ss.close(); 
        }
        catch (Exception e){
            System.out.println(e);
        }
       
    }
}
