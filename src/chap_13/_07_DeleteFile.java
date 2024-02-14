package chap_13;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {

        File file = new File("text.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("파일삭제 성공 : " + file.getName());
            } else {
                System.out.println("파일삭제 실패 : " + file.getName());
            }


        }

        File folder = new File("A");
        if(folder.exists()){
            if(folder.delete()){
                System.out.println("폴더 삭제 성공 : " +folder.getAbsolutePath());
            }
        }
    }
}
