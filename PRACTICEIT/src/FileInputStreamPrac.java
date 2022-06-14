import java.io.*;



//FileReader로 경로 지정하고 BufferedReader 로 파일 읽어오기
public class FileInputStreamPrac {




    public static void main(String[] args) throws IOException {
File file = new File("PRACTICEIT/src/IOSample.txt");
// 절대경로, 저장소 루트 경로를 써야 작동함
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line ="";

            while((line= br.readLine()) != null){
                System.out.println(line);

            }

        System.out.println("===================================================\n");


            //FileInputStream 으로 텍스트파일 읽어오기

        FileInputStream fis = new FileInputStream(new File("PRACTICEIT/src/IOSample.txt"));
       int data = 0;
       while((data= fis.read())!=-1){//-1 은 이제 읽을게 없다는뜻= 그럼 while 루프 멈춤
           System.out.println((char)data);

           fis = new FileInputStream("PRACTICEIT/src/IOSample.txt");
           byte [] buf = new byte[fis.available()];
           while((data= fis.read(buf,0, buf.length))!= -1){
               System.out.println(new String(buf,0,data));
           }
       }




    }





    }
