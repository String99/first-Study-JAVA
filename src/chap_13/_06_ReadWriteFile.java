package chap_13;

import java.io.*;

public class _06_ReadWriteFile {
    public static void main(String[] args) throws IOException {
        //파일 읽고 쓰기

        // BufferedReader : 파일에서 내용을 읽어올 때
        // BufferedWriter : 팡리에 내용을 쓸 때

        //파일 쓰기

//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt", true))) {
//        bw.write("이제 거의 끝이 보여요");
//bw.newLine();
//
//bw.write("조금만 더 힘내요");
//bw.write("여기까지 오사ㅣㄴ");
//        }catch (IOException e){
//            throw new RuntimeException(e);
//        }


        try(BufferedReader br = new BufferedReader(new FileReader("goodjob.txt"))){
            String line;
            while((line = br.readLine()) !=null){
                System.out.println(line);
            }

        }catch (IOException e){
            throw new RuntimeException( e);
        }



    }
}
