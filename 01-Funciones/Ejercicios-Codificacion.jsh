String adivinaLaPelicula(String emoji1, String emoji2, String emoji3) {
    return String.format("[%s, %s, %s]", emoji1, emoji2, emoji3);
}
adivinaLaPelicula("❄️", "🛳️", "💑")
String emojiTest = "😀";
System.out.println(emojiTest);
adivinaLaPelicula("❄️", "🛳️", "💑")
String konnichiwa(String dare) {
    return String.format("こんにちは %s", dare);
}
konnichiwa("Jorge")
String separador() {
    return "<<<>>>";
}
separador();
String vocales() {
    return "aeiou";
}
vocales();
tituloAdornador("Java");
tituloAdornador(">>> <<<");
tituloAdornador("A + B");
String tituloAdornado(String titulo) {
    return String.format("<<< %s >>>", titulo);
}
tituloAdornado("A + B");
tituloAdornado("Java");