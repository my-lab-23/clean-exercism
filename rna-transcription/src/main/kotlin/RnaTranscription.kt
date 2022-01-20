fun transcribeToRna(cs: String): String {
    var s = ""
    for(c in cs) { s += of(c) }
    return s
}

fun of(c: Char): Char {
    when(c) {
        'C' -> return 'G'
        'G' -> return 'C'
        'T' -> return 'A'
        'A' -> return 'U'
    }
    return '_'
}
