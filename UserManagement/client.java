import java.net.*;
import java.io.*;
import java.util.*;
public class client {
    public static void main(String[] args){

        try{
            Socket s=new Socket("LocalHost",1111);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            DataInputStream din=new DataInputStream(s.getInputStream());
            Scanner sc=new  Scanner(System.in);
            String send;
            String str;
            do {
                send=sc.nextLine();
                dout.writeUTF(send);
                str=din.readUTF();
                System.out.println("Server:"+str);
            } while (s.isConnected());
           
        }catch(Exception e){
            System.out.println(e);
        }
     


    }
}
