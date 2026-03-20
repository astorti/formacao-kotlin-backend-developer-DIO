sealed class Person(val name: String)                                                   // 1

class Writer(val writerName: String, val bookName: String) : Person(writerName)                                        // 2
class Composer(val composerName: String, val musicName: String) : Person(composerName)

fun toIntroduceSomeone(person: Person): String {
    when (person) {                                                                     // 3
        is Writer -> return "Hello, this is ${person.name}, author of the book ${person.bookName}"    // 4
        is Composer -> return "Hello, this is ${person.name}, composer of the music ${person.musicName}"                                         // 5     
    }                                                                                   // 6
}

fun main() {
    println(toIntroduceSomeone(Writer("Isaac Asimov", "Foundation")))
    println(toIntroduceSomeone(Composer("Mozart", "Die Zauberflote")))
}