object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        var counter = 0
        if (leftStrand.length == rightStrand.length) {
            var i = 0
            for (letter in leftStrand) {
                if (letter == rightStrand[i]) {
                    counter++
                }
                i++
            }
            return leftStrand.length-counter
        } else{
            println("Left and right strands must be of equal length")
            return 0
        }
    }
}
