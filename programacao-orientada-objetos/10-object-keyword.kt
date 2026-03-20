class Timer {                                  //1 
    companion object Counter {                   //2
        fun timer(counter: Int) {             //3
            for(i in 1 .. counter) {
                println(i)
            }
        }
    }
}

fun main() {
    Timer.timer(10)                         //4
}