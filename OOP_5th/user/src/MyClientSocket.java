import java.io.*;
import java.net.*;

public class MyClientSocket {
    public static void main(String[] args) {
        Socket socket = null;
        try {// получение строки клиентом
            socket = new Socket( "127.0.0.1" , 8030);
            BufferedReader dis = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
            String msg = dis.readLine();

            msg = msg.replaceAll("R","\n");

            System.out.println(msg);

//            try(FileWriter test = new FileWriter("test.txt")) {
//                test.write(msg);
//                test.flush();
//            }

        } catch (IOException e) {
            System. out.println( "error: " + e);
        }
    }
}