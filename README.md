## Laporan Praktikum PBO - Rizky Zahran Ramadhan (2401092020)
### Latihan 4.11
## 4.11.1
4.11.1 menjelaskan bagaimana cara mendefinisikan sebuah metode utama (`main`), yaitu titik awal eksekusi program saat dijalankan. Di dalam metode ini, dibuat empat variabel dengan tipe data berbeda: 
- `number` bertipe `int` untuk menyimpan angka 10,
- `letter` bertipe `char` untuk menyimpan karakter 'a',
- `result` bertipe `boolean` untuk menyimpan nilai logika true,
- dan `str` bertipe `String` untuk menyimpan teks "hello".
  
Setelah semua variabel dideklarasikan dan diisi nilainya, program menggunakan perintah `System.out.println()` untuk menampilkan isi dari masing-masing variabel ke layar.
Hasil yang ditampilkan ke pengguna adalah gabungan teks deskriptif seperti `"Number = "` dengan nilai dari variabelnya, sehingga outputnya menjadi deretan informasi seperti `Number = 10`, `Letter = a`, dan seterusnya.

## 4.11.2
4.11.2 diawali dengan metode `main`, yang merupakan titik awal eksekusi program. Di dalamnya, terdapat tiga variabel bertipe `int` yang masing-masing menyimpan nilai 10, 20, dan 45. Variabel tersebut dinamai `number1`, `number2`, dan `number3`. Selanjutnya, program mencetak nilai dari ketiga variabel tersebut ke layar menggunakan  `System.out.println()`, yang akan menampilkan teks deskriptif diikuti dengan nilai variabel. 

Setelah itu, program menghitung rata-rata dari ketiga angka tersebut dengan menjumlahkan semua nilainya, lalu membaginya dengan 3. 

Hasil dari perhitungan ini juga ditampilkan ke layar dengan label `"Average is :"`.

## 4.11.3
4.11.3 dimulai dengan metode `main`, sebagai titik awal program dijalankan. Di dalam metode tersebut, terdapat lima variabel bertipe `int`: `num1`, `num2`, dan `num3` menyimpan angka 10, 23, dan 5. 
Sementara itu, `num4` dan `result` diinisialisasi dengan nilai 0. Program kemudian menggunakan operator ternary (`? :`) untuk membandingkan dua angka. 

- Pertama, `num1` dibandingkan dengan `num2`; jika `num1` lebih besar, maka nilainya disimpan ke `num4`, jika tidak, `num2` yang disimpan. 
- Setelah itu, nilai `num4` dibandingkan dengan `num3` untuk mencari angka yang paling besar di antara ketiganya, dan hasil akhirnya disimpan ke variabel `result`. 

Terakhir, program mencetak hasil perbandingan tersebut ke layar dengan menampilkan teks "`Angka terbesar adalah : `" diikuti nilai `result`.

## 4.11.4
4.11.4 menjelaskan 3 soal:
- Soal 1 menunjukkan ekspresi `a/b^c^d-e+f-g*h+1`, dan jawabannya dituliskan sebagai urutan operasi yang benar: `(a/((b^c)^d))-e+f-(g*h)+1`.
- Soal 2 adalah ekspresi numerik `3*10*2/15-2+4^2^2`, yang hasil operasinya dituliskan sebagai `(((3*10)*2)/15)-2+((4^2)^2)`.
- Soal 3 menampilkan ekspresi `r^s*t/u-v+w^x-y++`, dan diubah ke bentuk yang lebih jelas secara urutan operasi menjadi `(((r^s)*t)/u)-v+(w^x)-y++`.

4.11.4 hanyalah sebagai dokumentasi atau latihan pemahaman tentang urutan operasi dalam ekspresi matematika.

---

### Latihan 5.1
## 5.1.1
5.1.1 bertujuan untuk membaca tiga buah kata yang diketik oleh pengguna melalui keyboard, lalu mencetak ketiga kata tersebut dalam satu baris. Di dalam metode `main`, dibuat objek `BufferedReader` yang digunakan untuk membaca input dari pengguna. Objek ini disambungkan ke `System.in` menggunakan `InputStreamReader`, sehingga bisa membaca teks dari keyboard.

Tiga variabel bertipe `String` (`word1`, `word2`, dan `word3`) disiapkan untuk menyimpan kata-kata yang dimasukkan. Di dalam blok `try`, program meminta pengguna untuk memasukkan masing-masing kata satu per satu dengan `System.out.print()`, dan input tersebut dibaca menggunakan `dataIn.readLine()`, lalu disimpan ke variabel yang sesuai.

Jika terjadi kesalahan saat membaca input (misalnya ada masalah dengan aliran input), maka blok `catch` akan menangani kesalahan itu dan mencetak pesan **"Error in getting input"**.

Setelah semua input berhasil dibaca, program mencetak ketiga kata tersebut dalam satu baris, dipisahkan dengan spasi, menggunakan `System.out.println()`.

## 5.1.2
5.1.2 merupakan program Java yang menggunakan JOptionPane, yaitu komponen dari pustaka `javax.swing`, untuk mengambil input dari pengguna melalui jendela pop-up (bukan lewat terminal) dan menampilkannya kembali juga dalam jendela pop-up. Program dimulai dengan mendeklarasikan tiga variabel string bernama `word1`, `word2`, dan `word3`, yang akan digunakan untuk menyimpan kata-kata yang dimasukkan oleh pengguna.

Selanjutnya, program menggunakan `JOptionPane.showInputDialog()` untuk menampilkan kotak input yang meminta pengguna memasukkan masing-masing kata. Setiap kata yang dimasukkan akan disimpan ke dalam variabel yang sesuai.

Setelah ketiga kata berhasil dikumpulkan, program menggabungkannya menjadi satu kalimat dengan memberi spasi di antara ketiganya. Hasil gabungan ini disimpan ke dalam variabel `msg`.

Terakhir, program menampilkan isi variabel `msg` ke dalam kotak dialog **(pop-up)** menggunakan `JOptionPane.showMessageDialog(null, msg)`.

---

### Latihan 6.5
## 6.5.1
6.5.1 adalah program Java yang menghitung rata-rata dari tiga nilai menggunakan dua metode input: melalui keyboard (console) dengan `BufferedReader`, dan melalui jendela pop-up dengan `JOptionPane`. Program ini juga akan menampilkan apakah nilai rata-rata tersebut lulus atau tidak, berdasarkan batas lulus yaitu 60.

- Bagian 1: Input dengan `BufferedReader` (melalui terminal)
Pertama, program mendeklarasikan tiga variabel `nilaia`, `nilaib`, dan `nilaic` untuk menyimpan nilai yang akan dimasukkan oleh pengguna. Program kemudian meminta pengguna untuk memasukkan ketiga nilai tersebut satu per satu menggunakan `System.out.print()` dan membacanya dengan `dataIn.readLine()`. Nilai yang dibaca berupa teks, lalu diubah ke dalam bentuk angka dengan `Integer.parseInt()`.

    Setelah semua nilai dimasukkan, program menghitung rata-rata dengan rumus `(nilaia + nilaib + nilaic) / 3` dan menyimpannya ke variabel `rata1`. Kemudian program memeriksa apakah `rata1` lebih besar atau sama dengan 60. Jika ya, maka dianggap lulus dan menampilkan pesan dengan wajah senyum `:-)`. Jika tidak, maka dianggap tidak lulus dan menampilkan pesan dengan wajah sedih `:-(`.

- Bagian 2: Input dengan `JOptionPane` (melalui jendela pop-up)
Selanjutnya, bagian kedua dari program melakukan hal yang sama, tapi kali ini menggunakan komponen GUI `JOptionPane` untuk meminta pengguna memasukkan tiga nilai melalui kotak input pop-up. Nilai-nilai tersebut dibaca sebagai teks dan diubah menjadi angka dengan `Integer.parseInt()`.

    Rata-rata dari ketiga nilai dihitung dan disimpan dalam `rata2`. Lalu, program menampilkan hasilnya menggunakan kotak dialog `JOptionPane.showMessageDialog()`, dengan format pesan yang sama: wajah senyum jika lulus `(rata2 >= 60)` dan wajah sedih jika tidak.

## 6.5.2
6.5.2 merupakan program untuk menerjemahkan angka ke dalam bentuk teks (kata), yaitu dari angka 1 hingga 10. Program ini juga menunjukkan dua cara berbeda untuk melakukan hal tersebut: menggunakan `if-else` dan `switch-case`.

Program dimulai dengan membuat objek `BufferedReader` agar bisa membaca input angka dari keyboard. Kemudian program meminta pengguna untuk memasukkan angka pertama (`angka1`). Nilai yang dimasukkan akan dibaca dan dikonversi menjadi integer menggunakan `Integer.parseInt()`.

Setelah itu, program memeriksa nilai `angka1` menggunakan rangkaian `if-else if`. Jika angka sama dengan 1, maka akan ditampilkan `"1 = Satu"`, jika 2 maka `"2 = Dua"`, dan seterusnya hingga angka 10. Jika pengguna memasukkan angka selain 1–10, maka program akan menampilkan `"Invalid number"`.

Setelah bagian pertama selesai, program kembali meminta pengguna untuk memasukkan angka kedua (`angka2`) yang akan diuji menggunakan struktur `switch-case`. Sama seperti sebelumnya, jika angka antara 1 sampai 10, maka akan dicetak dalam bentuk kata. Namun kali ini, pengecekannya menggunakan `switch`, di mana setiap `case` mewakili satu angka. Jika tidak ada yang cocok (default), maka akan ditampilkan `"Invalid number"`.

## 6.5.3
6.5.3 bertujuan untuk mencetak nama **"Rizky Zahran Ramadhan"** sebanyak 100 kali, menggunakan tiga jenis perulangan (looping) dalam Java: `while`, `do-while`, dan `for`.

- Pertama, program menyimpan nama `"Rizky Zahran Ramadhan"` ke dalam variabel `name`.
- Kemudian, menggunakan `while loop`, program memulai pencetakan nama sebanyak 100 kali. Variabel penghitung `whilevar` dimulai dari 0, dan selama nilainya kurang dari 100, program akan terus mencetak nama dan menambah nilai `whilevar` setiap kali perulangan berlangsung.
- Setelah selesai, program mencetak baris kosong dan melanjutkan ke `do-while loop`. Dalam bentuk ini, perintah `System.out.println(name)` dijalankan terlebih dahulu minimal satu kali, lalu kondisi `dovar < 100` dicek. Jika masih memenuhi, maka perulangan dilanjutkan sampai mencapai 100 kali.
- Terakhir, program menggunakan `for loop`, yang merupakan cara paling ringkas dan terstruktur. Di sini, variabel `forvar` digunakan sebagai penghitung, dimulai dari 0 hingga kurang dari 100. Setiap kali perulangan, nilai `forvar` bertambah satu, dan nama akan dicetak.

## 6.5.4
6.5.4  merupakan program Java yang menghitung pangkat dari sebuah angka (misalnya `angka^pangkat`) menggunakan tiga jenis perulangan: `while`, `do-while`, dan `for`. Program menggunakan `BufferedReader` untuk membaca dua input dari pengguna melalui keyboard, yaitu:

- `angka` → bilangan yang ingin dipangkatkan,
- `pangkat` → eksponen atau jumlah pengali.

**Cara Kerja :**
1. Input
Program meminta pengguna memasukkan dua nilai (angka dan pangkat) melalui console. Nilai yang dibaca diubah menjadi tipe `int` menggunakan `Integer.parseInt()`.

2. Perhitungan dengan `while` loop
Program menghitung hasil pangkat menggunakan loop `while`. Variabel `hasil` diinisialisasi dengan 1, lalu dikalikan dengan `angka` sebanyak `pangkat` kali. Setiap kali pengulangan, variabel penghitung `i` ditambah 1.

3. Perhitungan dengan `do-while` loop
Selanjutnya, `hasil2` juga dikalikan seperti sebelumnya, namun menggunakan `do-while`. 

4. Perhitungan dengan `for` loop
Perulangan `for` dihitung secara benar dengan `i` dimulai dari 0, dikalikan hingga pangkat kali ke variabel `hasil3`.

5. Output
Terakhir, program mencetak hasil dari ketiga metode tersebut. Tapi ada kesalahan di bagian output: meskipun tiga metode berbeda sudah dilakukan (`while`, `do-while`, `for`), semua hasil yang ditampilkan menggunakan variabel `hasil`, yang hanya berisi hasil dari `while`.

---

### Latihan 7.7
## 7.7.1
7.7.1 bertujuan untuk menampilkan nama-nama hari dari Senin sampai Minggu, menggunakan tiga jenis perulangan (`while`, `do-while`, dan `for`). Program dimulai dengan membuat sebuah array `days[]` yang berisi nama-nama hari dalam bahasa Inggris, dari `"Monday"` hingga `"Sunday"`.

1. Perulangan `while`
Variabel `i` diinisialisasi dengan nilai 0. Selama nilai `i` masih lebih kecil dari panjang array (`days.length`), program mencetak hari ke-(i+1) dan isi dari `days[i]`. Nilai `i` kemudian ditambah 1 setiap kali perulangan. Ini akan mencetak seluruh hari dalam urutan.

2. Perulangan `do-while`
Setelah baris kosong dan teks `"WHEN USE DO WHILE"` ditampilkan, program memulai perulangan `do-while` dengan variabel `j`, yang juga dimulai dari 0. `do-while` akan mencetak isi array seperti sebelumnya, dengan jaminan bahwa **perulangan minimal dilakukan satu kali**. Perulangan terus berjalan hingga `j` mencapai panjang array.

3. Perulangan `for`
Terakhir, bagian `"WHEN USE FOR"` mencetak nama hari menggunakan perulangan `for`, yang paling ringkas. Di sini, `i` diatur kembali ke 0, dan perulangan dilakukan hingga `i`kurang dari `days.length`, mencetak hari sesuai indeks array.

## 7.7.2
7.7.2 merupakan program Java yang bertujuan untuk menginput 10 buah nilai, menampilkan seluruh nilai tersebut, serta mencari dan menampilkan nilai tertinggi. Program menggunakan dua metode input: melalui keyboard (console) menggunakan `BufferedReader`, dan melalui jendela pop-up menggunakan `JOptionPane`.

- Bagian 1 – Input dan Proses dengan `BufferedReader` (console)
  Pertama, program mendeklarasikan dua array integer: `nilaiBR dan nilaiJOR`, masing-masing berukuran 10 elemen. Variabel `nilaiBR` digunakan untuk menyimpan nilai yang dimasukkan lewat console.

  Program menggunakan perulangan `for` untuk meminta pengguna memasukkan 10 nilai satu per satu. Nilai-nilai ini kemudian disimpan ke dalam array `nilaiBR`. Setelah semua nilai dimasukkan, program mencetak seluruh isi array ke satu baris menggunakan perulangan lagi.

  Kemudian program mencari nilai tertinggi dari array `nilaiBR` dengan membandingkan setiap elemen menggunakan perulangan `for` dan menyimpan nilai terbesar ke dalam variabel `max`. Setelah proses pencarian selesai, nilai tertinggi ditampilkan di console dengan `System.out.println()`.

- Bagian 2 – Input dan Proses dengan  `JOptionPane` (GUI)
  Setelah bagian console selesai, program beralih ke proses yang sama tapi menggunakan antarmuka grafis (GUI). Program menampilkan 10 jendela input (popup) menggunakan `JOptionPane.showInputDialog()`, lalu menyimpan nilainya ke dalam array `nilaiJOR`.

  Setelah itu, program menggunakan perulangan `for` untuk mencari nilai tertinggi dalam array `nilaiJOR`, dengan logika yang sama seperti sebelumnya. Hasil akhir ditampilkan menggunakan `JOptionPane.showMessageDialog()` dalam bentuk popup yang menampilkan nilai tertinggi dari 10 angka yang dimasukkan.

## 7.7.3
7.7.3 merupakan program Java yang digunakan untuk menampilkan data kontak yang tersimpan dalam bentuk array dua dimensi. Variabel `data` adalah array 2D bertipe `String`, yang menyimpan tiga baris data, masing-masing berisi nama, nomor telepon, dan alamat dari tiga orang: Florence, Joyce, dan Becca.

Program menggunakan perulangan `for` untuk membaca setiap baris data. Dalam setiap iterasi, program mencetak:

- Nama (`data[i][0]`)
- Nomor telepon (`data[i][1]`)
- Alamat (`data[i][2]`)
  
Setiap baris data ditampilkan dalam format rapi ke layar menggunakan `System.out.println()`, dan diberikan baris kosong setelahnya untuk memisahkan setiap kontak.

---

### Latihan 8.4
## 8.4.1
8.4.1 merupakan program java yang akan menampilkan `"hello"`, `"world"`, `"that"`, `"is"`, `"all"`. Yang dimana kata-kata itu didapat dari input user melalui `argument line`

## 8.4.2
8.4.2 merupakan program java yang akan memproses semua operasi aritmatik di dalam kode, yang dimana angkanya didapat dari input user melalui `argument line`

---

### Latihan 9.6
## 9.6.1
***Sudah ada filenya didalam folder project dengan judul `"Tugas 9.6.1.txt"`***

---

### Latihan 10.10
## 10.10.1
10.10.1 mendefinisikan sebuah class Java bernama `BukuAlamat` yang berfungsi untuk merepresentasikan data buku alamat seseorang, yaitu menyimpan informasi nama, alamat, nomor telepon, dan email.

1. Atribut:
Terdapat empat atribut (variabel) di dalam class ini:

- `nama` → nama orang
- `alamat` → alamat tempat tinggal
- `noTelp` → nomor telepon
- `email` → alamat email

  Atribut `nama` diinisialisasi sebagai string kosong, sementara atribut lainnya belum diberi nilai awal.

2. Konstruktor (Constructor):
Bagian berikutnya adalah constructor, yaitu method khusus yang akan dipanggil saat objek `BukuAlamat` dibuat. Konstruktor ini menerima 4 parameter (`nama`, `alamat`, `noTelp`, dan `email`) dan langsung menyimpan nilainya ke dalam atribut yang sesuai menggunakan keyword `this`.

3. Accessor Methods (Getter):
Terdapat 4 method getter (`getNama()`, `getAlamat()`, `getNoTelp()`, dan `getEmail()`) yang digunakan untuk mengambil (membaca) nilai dari masing-masing atribut. Ini sesuai dengan prinsip enkapsulasi, yaitu data disimpan secara privat dan hanya bisa diakses lewat method.

4. Mutator Methods (Setter):
Terdapat juga 4 method setter (`setNama()`, `setAlamat()`, `setNoTelp()`, dan `setEmail()`) yang digunakan untuk mengubah (mengatur) nilai dari atribut yang bersangkutan. Ini memungkinkan data objek bisa diubah setelah objek dibuat.

## 10.10.2
10.10.2 berisi `main` method, yang di mana di dalamnya terdapat berbagai macam fitur, seperti: `menambah`, `menghapus`, `menampilkan`, dan juga `mengupdate`, yang dimana datanya diambil dari array yang terdapat pada class `BukuAlamat`, oleh karena itulah kedua kode ini saling berkaitan.

---

### Latihan 11.6
## 11.6.1
11.6.1 berisi `StudentRecord`, yang di mana, kita harus membuat satu buah extend dari student record, di dalam project terdapat hasil dari extend student record dengan nama class `academic`, yang dimana data datanya merupakan turunan dari `StudentRecord`, dan juga terdapat di dalamnya main `method` untuk menjalankan programnya.

## 11.6.2
11.6.2 berisi beberapa kode, yaitu:

1. Kode 1 – Class `Shape` (Abstract Class)
Kode ini membuat class abstrak bernama `Shape`, yang berfungsi sebagai template (kerangka dasar) untuk berbagai bentuk (seperti lingkaran, persegi, dll). Class ini tidak dapat dibuat objek langsung, karena bersifat abstrak.

      Terdapat dua method abstrak:
      - `getArea()` → untuk menghitung luas bentuk.
      - `getName()` → untuk mendapatkan nama bentuk.

      Method abstrak harus diimplementasikan ulang oleh class turunannya.

2. Kode 2 – Class `Square` (Turunan dari `Shape`)
Class ini merupakan class turunan dari `Shape` yang merepresentasikan persegi:

      - Memiliki atribut `side` (sisi).
      - Konstruktor menerima panjang sisi dan menyimpannya.
      - Method `getArea()` menghitung luas dengan rumus sisi × sisi.
      - Method `getName()` mengembalikan `string` "Square".

3. Kode 3 – Class `Circle` (Turunan dari `Shape`)
Class ini juga turunan dari `Shape`, dan merepresentasikan lingkaran:

      - Memiliki atribut `radius`.
      - `getArea()` menggunakan rumus luas lingkaran: `π × r`.
      - `getName()` mengembalikan `"Circle"`.

4. Kode 4 – Class `Example` (Main Class)
Class ini adalah program utama yang:

      4.1 Membuat dua objek:
      - `circle` dari `Circle(5)`
      - `square` dari `Square(7)`

      4.2 Meminta input dari user (pilih bentuk 1 atau 2).

      4.3 Berdasarkan input:
      - Jika 1 → cetak nama dan luas lingkaran.
      - Jika 2 → cetak nama dan luas persegi.
      - Jika selain itu → tampilkan pesan error.

***Hubungan antar kode***
- `Shape` -> Fungsinya: Class abstrak dasar yang mendefinisikan bentuk umum.
- `Square`, `Circle` -> Fungsinya: Class turunan yang mengimplementasikan detail dari `Shape`.
- `Example` -> Fungsinya: Program utama yang membuat objek `Shape` dan menggunakan **polimorfisme** untuk memanggil method.

---

### Big Project : Pengembalian
Di project ini kita memiliki 4 `model`, `form`, `dao`, dan juga `controller`, yaitu:
- Anggota
- Buku
- Peminjaman
- Pengembalian

Anggota berisikan data para `anggota`, begitu pula dengan `buku`, `peminjaman`, dan `pengembalian`.

`Primary key` dari peminjaman saya atur dari `id_anggota`, `id_buku`, dan `tgl_pinjam`. Sedangkan `primary key` untuk pengembalian saya atur dia memiliki `id` primary sendiri dan `auto increment`.

***Cara Kerja:***
1. Pertama kita memerlukan `model` terlebih dahulu untuk menampung data data yang nantinya akan diinputkan oleh user, `model` juga lah yang akan langsung berhubungan dengan database
2. Kita perlu membuat sebuah `form` agar user dpt menginputkan data-datanya
3. Tidak lupa kita memerlukan `controller`, agar data yang diinputkan oleh user bisa diambil dan diberikan ke `model`
4. Di sini kita memiliki `dao` sebagai penengah antara `controller` dengan `model`, perintah perintah sql akan dicatat di dalam `dao`
    
    Sehingga untuk aplikasi `Pengembalian`, seseorang harus menjadi anggota dari perpustakaan terlebih dahulu, setelah itu ia mesti menginputkan buku apa yang ia pinjam dan harus mengembalikannya sebelum terlambat, dikarenakan jika ada yang terlambat dalam mengembalikan buku, dendanya sudah disetting sebanyak 1M.

   Peminjaman sangat bergantung kepada `buku` dan `anggota`, tidak ada nya `anggota` dan `buku`, maka aplikasi tidak akan bisa berjalan dengan lancar.


***Created by Zahran***
