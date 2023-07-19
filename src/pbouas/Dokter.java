package pbouas;
//class
public class Dokter {
   
    //atribut dan encapculation
    private String nip;
    private String namadokter;

    //construktor
    public Dokter(String nip, String namadokter) {
        this.nip = nip;
        this.namadokter = namadokter;
    }

    //setter
    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.namadokter = namadokter;
    }

 
    //getter
    public String getNip() {
        return nip;
    }

    public String getNamadokter() {
        return namadokter;
    }
    
    
    public String displayInfo() {
        return "NIP = "+getNip()+ "\nNama = "+getNamadokter();
    }
    
    //polymortisme(overloding)
    public String displayInfo(String alamat){
        return displayInfo()+"\nAlamat = "+alamat;
    } 
}
