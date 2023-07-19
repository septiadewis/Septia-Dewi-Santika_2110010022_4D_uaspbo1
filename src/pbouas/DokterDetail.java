package pbouas;//inheritance
public class DokterDetail extends Dokter{
      //overriding
    public DokterDetail(String nip, String namadokter) {
        super(nip, namadokter);
    }
    
    public String getDokter(){
        String kodeDokter = getNip().substring(0, 4);
        //seleksi swicth
        switch(kodeDokter) {
            case "1020":
                return "Dokter Gigi";
            case "1021":
                return "Dokter Spesialis";
            case "1022":
                return "Dokter Umum";
            default:
                return "Dokter Lain";
        }
    }
    
    public int getTanggalLahir(){
          return Integer.parseInt(getNip().substring(4, 12));   
    }
    
    public String getPendidikan(){
        String pendidikan = getNip().substring(12, 14);
        //seleksi swicth
        switch(pendidikan) {
            case "01":
                return "S1";
            case "02":
                return "S2";
            case "03":
                return "S3";
            default:
                return "Dan Seterusnya";
         }
    }
   //polymortisme(override)
    @Override
    public String displayInfo(){
            return super.displayInfo()+
            "\nDokter = "+getDokter()+
            "\nTanggal Lahir = "+getTanggalLahir()+
            "\nPendidikan = "+getPendidikan();
        }
    }



