String adornar(String frase) {
    return String.format("<=%s=>", frase);
}
adornar("Java");
adornar("Mundo");
String concatenar(String s1, String s2) {
    return String.format("[%s+%s]", s1,s2);
}
concatenar("Hola", "Mundo");
concatenar("A", "Z");
concatenar("A", "Z");
adornar("Mundo");