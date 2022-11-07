fun main() {
    var line="This is my website"
    var Vowels=0
    var consonent=0
    var space=0
    var digits=0
    line.map {

        when(it)
        {
            'a','e','i','o','u'->Vowels++
            in '0'..'9' ->digits++
            in 'a'..'z'-> consonent++
            ' ' -> space++
            else-> println()
        }

    }

    println("Vowels => $Vowels")
    println("Space => $space")
    println("Consoents => $consonent")
}