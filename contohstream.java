import java.util.stream.*;
import java.util.Arrays;
import java.util.List;

public class contohstream{
    public static void main(String[] args) {
        List<String> daftarNama = Arrays.asList("Alice", "Bob", "Anna", "David");
        List<String> namaAwalA = daftarNama.stream()
                                        .filter(nama -> nama.startsWith("A"))
                                        .collect(Collectors.toList());

        System.out.println("Nama yang dimulai dengan 'A': " + namaAwalA);

        // List<Integer> angka = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // int jumlahGenap = angka.stream()
        //                       .filter(x -> x % 2 == 0)
        //                       .mapToInt(Integer::intValue)
        //                       .sum();

        // System.out.println("Jumlah bilangan genap: " + jumlahGenap);
    }
}

// //list
// List<String> daftarNama = Arrays.asList("Alice", "Bob", "Charlie", "David");
// // Membuat Stream dari List
// Stream<String> streamNama = daftarNama.stream();

// //array
// int[] angka = {1, 2, 3, 4, 5};
// // Membuat Stream dari Array
// IntStream streamAngka = Arrays.stream(angka);

// //FILTER
// Stream<String> streamNama = daftarNama.stream();
// // Menyaring nama yang panjangnya lebih dari 4 karakter
// Stream<String> namaPanjang = streamNama.filter(nama -> nama.length() > 4);

// //MAP
// Stream<String> streamNama = daftarNama.stream();
// // Mengubah semua nama menjadi huruf besar
// Stream<String> namaBesar = streamNama.map(nama -> nama.toUpperCase());

// //REDUCE
// Stream<Integer> streamAngka = Stream.of(1, 2, 3, 4, 5);
// // Menghitung jumlah semua angka dalam stream
// int jumlah = streamAngka.reduce(0, (a, b) -> a + b);
// //

// //Contoh :
// //Menghitung Jumlah Bilangan Genap
// List<Integer> angka = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
// int jumlahGenap = angka.stream()
//                       .filter(x -> x % 2 == 0)
//                       .mapToInt(Integer::intValue)
//                       .sum();
// System.out.println("Jumlah bilangan genap: " + jumlahGenap);

// //Menemukan Nama yang Dimulai dengan "A"
// List<String> daftarNama = Arrays.asList("Alice", "Bob", "Anna", "David");
// List<String> namaAwalA = daftarNama.stream()
//                                    .filter(nama -> nama.startsWith("A"))
//                                    .collect(Collectors.toList());

// System.out.println("Nama yang dimulai dengan 'A': " + namaAwalA);
