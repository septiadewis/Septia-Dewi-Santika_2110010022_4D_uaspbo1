package pbouas;
import java.util.Scanner;
public class DokterBeraksi {
     public static void main(String[] args) {
        //objek
        //Data dokter = new Data("10200809200301","Septia");
        
        //System.out.println(dokter.displayInfo());
        //System.out.println(dokter.displayInfo("Kandangan"));
        
        //error headling
        try{
        //io sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
       DokterDetail[] dokter = new DokterDetail[2];
        
        //perulangan
        for(int i =0; i<dokter.length;i++){  
        System.out.print(" Masukkan NIP "+(i+1)+" = ");
        String nip = scanner.nextLine();
        System.out.print(" Masukkan NAMADOKTER  "+(i+1)+" = ");
        String namadokter = scanner.nextLine();
        
        //objek
        dokter[i] = new DokterDetail(nip,namadokter);
        }
        
        //perulangan
        for(DokterDetail data : dokter) {
            System.out.println("====================");
            System.out.println("Data Dokter = ");
            System.out.println(data.displayInfo());
       }
    }   catch(NumberFormatException e ) {
            System.out.println("Kesalahan Format Nomor "+e.getMessage());
    }   catch(StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format NIK"+e.getMessage());
    }
        catch (Exception e){
        System.out.println("Kesalahan Umum"+e.getMessage());
    }
  }    
}
