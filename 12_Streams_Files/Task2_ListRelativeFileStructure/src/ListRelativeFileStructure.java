
import java.io.File;
import java.util.Scanner;


public class ListRelativeFileStructure {
public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        File file = new File(scan.nextLine());
        String path = file.toString()+ "\\";
        getDir(file,path);
    }

    public static void getDir(File file, String path) {

       
        String relativePath = file.getPath().replace(path, "");
        System.out.println(relativePath);
        if (file.isDirectory()) {
            String[] folder = file.list();
            for (String fileName : folder) {
                File files = new File(file, fileName);
                getDir(files,path);
            }
        }

    }

}
