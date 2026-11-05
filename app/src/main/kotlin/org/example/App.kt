package org.example



import java.util.Date

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

//Thread Utama
//Saat kita menjalankan sebuah process(aplikasi) Kotlin di JVM, secara otomatis proses tersebut akan jalan di sebuah thread utama
//Thread Utama tersebut bernama main thread (JVM)
//Saat kita menjalankan process JUnit, JUnit pun berjalan di thread tersendiri
//Begitu juga jika kita membuat aplikasi kotlin android, aplikasi tersebut akan berjalan di sebuah thread
//Contoh main thread adalah fun main() fungsi yang pasti akan menjadi thread utama dari semua program kotlin yang ada


fun main() {
    // Perbaikan typo dari printl menjadi println
    val app: App = App()
    println(app.greeting)
}