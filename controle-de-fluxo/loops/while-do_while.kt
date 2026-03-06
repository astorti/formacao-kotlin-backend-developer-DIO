fun readBook() = println("Ler um livro")
fun watchMovie() = println("Assistir um filme")

fun main() {
    var booksRead = 0
    var moviesWatched = 0

    while (booksRead < 5) {
        readBook()
        booksRead ++
    }

    do {
        watchMovie()
        moviesWatched++
    } while (moviesWatched < 5)
}
