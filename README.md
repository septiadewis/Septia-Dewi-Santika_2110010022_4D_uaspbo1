# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data dokter menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa NIP dan NamaDokter, dan memberikan output berupa informasi detail dari NIP tersebut seperti dokter, tanggalLahir, pendidikan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Dokter`, `DokterDetail`, dan `DokterBeraksi` adalah contoh dari class.

```bash
public class Dokter {
    ...
}

public class DokterDetail extends Dokter {
    ...
}

public class DokterBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `dokter[i] = new DokterDetail(nip, namadokter);` adalah contoh pembuatan object.

```bash
dokter[i] = new DokterDetail(nip, namadokter);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nip` dan `namadokter` adalah contoh atribut.

```bash
String nip;
String namadokter;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Dokter` dan `DokterDetail`.

```bash
public Dokter(String nip, String namadokter) {
    this.nip = nip;
    this.namadokter = namadokter;
}

public DokterDetail(String nip, String namadokter) {
    super(nip, namadokter);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNip` dan `setNama` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.namadokter = namadokter;
}

public void setNip(String nip) {
    this.nip = nip;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNip`, `getNamaDokter` adalah contoh method accessor.

```bash
public String getNip() {
    return nip;
}

public String getNamaDokter() {
    return namadokter;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nip` dan `nama` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nip;
private String nama;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `DokterDetail` mewarisi `Dokter` dengan sintaks `extends`.

```bash
public class DokterDetail extends Dokter {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Dokter` merupakan overloading method `displayInfo` dan `displayInfo` di `DokterDetail` merupakan override dari method `displayInfo` di `Dokter`.

```bash
public String displayInfo(String alamat) {
    return displayInfo() + "\nAlamat: " + alamat;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `case` dalam method `getDokter`,getTanggalLahir dan seleksi `switch` dalam method `getPendidikan`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i =0; i<dokter.length;i++) { 
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print(" Masukkan NIP "+(i+1)+" = ");
String nip = scanner.nextLine();
System.out.print(" Masukkan NAMADOKTER  "+(i+1)+" = ");
String namadokter = scanner.nextLine();

System.out.println("====================");
System.out.println("Data Dokter = ");
System.out.println(data.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `DokterDetail[] dokter = new DokterDetail[2];` adalah contoh penggunaan array.

```bash
DokterDetail[] dokter = new DokterDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Septia Dewi Santika
NPM: 2110010022
