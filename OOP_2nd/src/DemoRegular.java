import java.util.regex.*;
public class DemoRegular {
    public static void main(String[] args) {

        String regex = "(https?(:\\/\\/www\\.|:\\/\\/))?[a-zA-Z0-9]{2,}(\\.[a-zA-Z0-9]{2,})(\\.[a-zA-Z0-9]{2,})?(:\\d{2,5})?(\\/[a-zA-Z0-9\\-._~:/?#\\[\\]@!$&'()*+,;=]*)?" ;
        String s = "– пример правильных выражений: \n" +
                "\n" +
                "https://www.example.com , http://example.com. example.com#sad www.asd.com\n" +
                "– пример неправильных выражений: Just Text, http://a.com. x.com https://x.com/ ꓸ.com\n" +
                "Примеры правильных выражений, которые должны быть опознаны:\n" +
                "\n" +
                "https://www.example.com\n" +
                "http://example.com\n" +
                "http://subdomain.example.com\n" +
                "http://example.com:8080\n" +
                "http://example.com/path?param1=value1&param2=value2\n" +
                "http://example.com/path/to/folder\n" +
                "http://example.com/#section\n" +
                "Примеры неправильных выражений:\n" +
                "\n" +
                "Just Text\n" +
                "http://a.com";

        Pattern p2 = Pattern. compile (regex);
        Matcher m2 = p2.matcher(s);

        while (m2.find()) {
            System.out.println("URL: " + m2.group());
        }

    }
}


//LR-2 VAR-4
        /*Scanner console = new Scanner(System.in);

        System.out.println("ТЕКСТ:");
        *//*                  протокол            субдомен          домен2лвл    домен верхнего лвл    /папки/          .для папки      ГЕТ запрос      ГЕТ запрос 2+       #якорь *//*
        String regex = "(((https|http)://)?([A-Za-z0-9]+\\.)?([A-Za-z0-9]{2,}\\.[A-Za-z0-9]+)(/[A-Za-z0-9]+)*(\\.[A-Za-z0-9]+)?(\\?([A-Za-z0-9]+)(\\&[A-Za-z0-9]+)*)?(#[A-Za-z0-9]+)*)+";
        String s = "– пример правильных выражений: http://www.example.com, http://example.com.\n" +
                "– пример неправильных выражений: Just Text, http://a.com." +
                "https://example.url#anchor \n" +
                "вовпрк енк г ЫЫ\n" +
                "домена. При составлении регулярного выражения ориентируйтесь на список правильных и неправильных выражений заданных ниже.\n" +
                "– пример правильных выражений: http://www.example.com, http://example.com.\n" +
                "– пример неправильных выражений: Just Text, http://a.com.\n" +
                "http://www.example.com/index/index/index/index/index.html#anchor";
        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(s);
        while (m2.find()) {
            System.out.println("URL: " + m2.group());
        }*/
