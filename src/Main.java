import java.io.IOException;
import java.lang.System;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("ContohFile.txt");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            int [] nim = {2,1,4,1,7,6,2,1,4,3};
            int tinggi = 4;
            int t = 0;
            int index = 0;
            while( t<tinggi){
                int s=t;
                while( s<=nim.length){
                    System.out.print(" ");
                    bw.write(" ");
                    s++;
                }
                int n=0;
                while(n<=t){
                    System.out.print(nim[index]+" ");
                    bw.write(nim[index]+" ");
                    n++;
                    index++;
                }
                System.out.println(); 
                bw.newLine();
                t++;
            }
        }catch(FileNotFoundException ex){
            System.out.println("File "+file.getName()+" Tidak Ditemukan"); 
        }catch(IOException ex){
            System.out.println("File "+file.getName()+" Tidak Dapat DIbaca");
        }

        // try{
            
        //     //Inisialisasi Objek dan Mendefinisikan Path Lokasi File Yang akan Dibaca
        //     File file2 = new File("ContohFile.txt");
            
        //     //Inisialisasi Objek Scanner dan memasang objek file yang akan dibaca
        //     Scanner scan = new Scanner(file2);
            
        //     //Menggunakan perulangan untuk membaca semua data didalam objek Scanner
        //     String getDataString[];
        //     while(scan.hasNextLine()){
        //         int i=0;i++;
        //         getDataString[i] = scan.nextLine();
                
        //     }
        //     scan.close();
        //     char[] ch = new char[4];
        // }catch(FileNotFoundException ex){
        //     System.out.println("File Tidak Ditemukan"); 
        // }
        jumlah();

        
        
    }
    public static void jumlah(){
        int[] nim = {2,1,4,1,7,6,2,1,4,3};
        int jum = 0;
        for(int i = 0 ; i < nim.length ; i++){
            jum += nim[i];
        }
        System.out.print("Jumlah NIM : " + jum);
    }
}
