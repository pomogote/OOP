
import java.io.IOException;
import java.util.*;
import java.io.*;
import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MyServerSocket {
    public static void main(String[] args) throws Exception {
        Socket s = null;
        try {
            ServerSocket server = new ServerSocket(8030);
            s = server.accept();
            PrintStream ps = new PrintStream(s.getOutputStream());
            Random random = new Random(System.currentTimeMillis());
            int a = random.nextInt(105) + 1;

            String buf = new String(Files.readAllBytes(Paths.get("sonet.txt")));

            Pattern pattern = Pattern.compile( (int)a + "\\D+");
            Matcher matcher = pattern.matcher(buf);

            buf = buf.replaceAll("\r"," ");
            buf = buf.replaceAll("\n","R");

            while (matcher.find())
                ps.println(buf.substring(matcher.start(), matcher.end()));

        } catch (IOException e) {
            System.out.println("ошибка :" + e);
        }
    }
}

//LAB5 - VAR4

//        Socket s = null;
//        try {
//            ServerSocket server = new ServerSocket(8030);
//            s = server.accept();
//            PrintStream ps = new PrintStream(s.getOutputStream());
//
//            {
//                Random random = new Random(System.currentTimeMillis());
//                int SonetRandomNumber = random.nextInt(105) + 1;
//
//                String sonets = new String(Files.readAllBytes(Paths.get("sonet.txt")));
//
//                String regex = "(^" + SonetRandomNumber + "\\..*?$).*?(\\S.*?)" + (SonetRandomNumber + 1);
//                Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE | Pattern.DOTALL);
//                Matcher matcher = pattern.matcher(sonets);
//
//                if (!(matcher.find())) {
//                    ps.println("ошибка поиска" + " " + SonetRandomNumber + " " + regex);
//
//                } else {
//                    String RequestedSonetFormated = matcher.group(1) + "\n\n\t\t" + matcher.group(2).trim();
//                    ps.println(RequestedSonetFormated);
//                    System.out.println(RequestedSonetFormated); //test
//                }
//            }
//
//            ps.flush();
//            s.close(); // разрыв соединения
//        } catch (IOException e) {
//            System.out.println(" ошибка : " + e);
//        }


