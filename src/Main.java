import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


//        FileWriter ss=new FileWriter("MyFile");
//        ss.append("A");
//        ss.append("a");
//        ss.append("D");
//        ss.append("d");
//        ss.append("\n");
//        ss.append("учим китайский");
//        ss.close();
//
//        FileReader ff=new FileReader("MyFile");
//        Scanner scanner=new Scanner(ff);
//        StringBuilder a =new StringBuilder();
//        while (scanner.hasNextLine()){
//
//
//            a.append(scanner.nextLine());
//
//        }
//        System.out.println(a);


        StringBuilder ss=new StringBuilder("StrinBelder это тип для тустовых значени");
        ss.append("a также можно добавляет сколко угодно значение разного типа в эту же переменную");
        ss.append("\nA");

        ss.append("б");
        ss.append("в");
        ss.append("г");
        ss.append("д");
        ss.append("е");
        ss.append("е");
        ss.append("ж");
        ss.append("з");
        ss.append("л");
        ss.append("м");
        ss.append("н");
        ss.append("о");
        ss.append("р");
        ss.append("с");
        ss.append("т");

        System.out.println(ss.length());
        System.out.println(ss);
        int[]massiv ={100,2,45,43,4,5,6,};
//        ss.append(massiv[0]);
//        ss.append(massiv[1]);
//        ss.append(massiv[2]);
//        ss.append(massiv[3]);
//        ss.append(massiv[4]);
//        ss.append(massiv[5]);
        for (int i = 0;i  <= 5; i++) {
            ss.append(massiv [i]);
        }

        System.out.println(ss);













    }

}