package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {


        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir(); // A에 해당하는 폴더 만들기
        if(folder.exists()){
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        }

        folderName = "A/B/C";
        folder = new File(folderName);
        //folder.mkdir -> 1개 폴더만 생성할때
        folder.mkdirs();
        if (folder.exists()){
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        }else{
            System.out.println("폴더 생성 실패");
        }

    }
}
