## Abstract Java

Dalam Java, "abstract" adalah kata kunci yang digunakan untuk mendefinisikan kelas abstrak atau metode abstrak. Kelas abstrak adalah kelas yang tidak dapat diinstansiasi sendiri. Itu berarti tidak dapat membuat objek langsung dari kelas abstrak. Sebaliknya, kelas abstrak dapat memiliki metode abstrak (metode tanpa implementasi) yang harus diimplementasikan oleh kelas turunannya.

## Studi Kasus Sederhana

Mari kita gunakan perumpaan untuk menjelaskan abstraksi dan overriding dalam kode Java tersebut.

Katakanlah kita memiliki sebuah "blueprint" untuk makhluk hidup yang disebut "Hewan." Namun, kita tidak tahu bagaimana suara setiap hewan spesifik. Jadi, kita membuat blueprint abstrak dan memberi tahu setiap hewan untuk mengisi bagaimana suara mereka.

```java
// Blueprint untuk makhluk hidup yang disebut "Hewan"
abstract class Hewan {
    // Suara hewan belum diketahui, kita serahkan pada hewan-hewan spesifik
    abstract void suara();
}

// Kucing adalah contoh hewan spesifik
class Kucing extends Hewan {
    // Kita mengisi bagaimana suara kucing
    public void suara() {
        System.out.println("Meow!");
    }
}

// Anjing adalah contoh hewan spesifik lainnya
class Anjing extends Hewan {
    // Kita mengisi bagaimana suara anjing
    public void suara() {
        System.out.println("Woof!");
    }
}

class Main {
    public static void main(String[] args) {
        // Kita menciptakan instance dari kucing dan anjing
        Kucing kucing = new Kucing();
        Anjing anjing = new Anjing();
        
        // Sekarang kita minta mereka berdua untuk membuat suara mereka
        System.out.println("--- Suara Kucing ---");
        kucing.suara();
        System.out.println("--- Suara Anjing ---");
        anjing.suara();
    }
}
```

Dalam analogi ini, kelas `Hewan` adalah seperti "blueprint" atau "template" untuk makhluk hidup, tetapi kita tidak memberikan detail konkrit tentang suaranya. Kedua kelas turunannya, `Kucing` dan `Anjing`, mengisi detail konkret tentang bagaimana suara setiap jenis hewan tersebut.

Hasilnya, ketika kita membuat instance dari kucing dan anjing dan meminta mereka untuk membuat suara, mereka memberikan respons yang sesuai dengan jenis hewan yang mereka wakili. Dengan cara ini, abstraksi dan overriding membantu dalam menciptakan struktur yang fleksibel dan memungkinkan implementasi yang berbeda untuk metode yang sama di kelas-kelas turunan.

## Note

Buat contekan aja biar gak lupa.
