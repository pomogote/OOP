import java.io.File;
import java.util.Stack;

public class CatalogStack {
    public static void main(String[] args) {
        String catalogPath = "./for_stack";

        Stack<String> stack = new Stack<>();
        stack.push(catalogPath);

        while (!stack.isEmpty()) {
            String currentPath = stack.pop();
            File currentFile = new File(currentPath);

            if (currentFile.isDirectory()) {
                File[] files = currentFile.listFiles();

                if (files != null) {
                    for (File file : files) {
                        stack.push(file.getAbsolutePath());
                    }
                }
            }

            System.out.println(currentPath); // Действия с элементом каталога
        }
    }
}

//LAB-3 VAR-4
//        File directory = new File("../the1stLab/dir");
//        if (directory.mkdirs()) {
//            System.out.println("Directory created successfully");
//        }
//
//        int filecount = 10;
//
//        try {
//            for (int i = 0; i < filecount; i++) {
//                File text = new File("../the1stLab/dir/txt" + i + ".txt");
//                if (text.createNewFile()) {
//                    System.out.println("file " + i + " created successfully");
//
//                } else {
//                    System.out.println("File already exists.");
//                }
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        Stack list = new Stack();
//
//
//        FileInputStream afseg;
//        for (int i = 0; i < filecount; i++) {
//            try {
//                afseg = new FileInputStream("../the1stLab/dir/txt" + i + ".txt");
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//            list.push(afseg);
//        }
//
//        for (int i = 0; i < filecount; i++) {
//            System.out.println(i + " file = " + list.pop().toString());
//        }
