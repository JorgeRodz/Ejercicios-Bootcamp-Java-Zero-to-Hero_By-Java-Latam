"java".substring(0, 1)
String titleCase(String texto) {
    var primeraLetra = texto.substring(0, 1);
    var restoDelTexto = texto.substring(1);
    return String.format("%S%s", primeraLetra, restoDelTexto.toLowerCase());
}
titleCase("java")
titleCase("Java")
titleCase("JAVA")
boolean terminaEnS(String texto) {
    var ultimoCaracter = texto.charAt(texto.length() - 1);
    return (ultimoCaracter == 's') || (ultimoCaracter == 'S');
}
terminaEnS("miercoles")
terminaEnS("jueves")
terminaEnS("sabado")
boolean esDeDosLetras(String texto) {
    return texto.length() == 2;
}
esDeDosLetras("aaa")
esDeDosLetras("aa")
esPalindrome("aaa")
boolean esPalindrome(String texto) {
    if (!esDeDosLetras(texto)) {
        System.out.println("El texto no contiene exactamente dos letras - Bye");
        return false;
    }
    
    var primera = Character.toLowerCase(texto.charAt(0));
    var segunda = Character.toLowerCase(texto.charAt(1));
    
    return primera == segunda;
}
esPalindrome("aaa")
esPalindrome("ab")
esPalindrome("ee")
esPalindrome("Aa")
boolean esExterno(String enlace) {
    return enlace.startsWith("http://") || enlace.startsWith("https://");
}
esExterno("/no-es-externo")
esExterno("https://www.java.com")
esExterno("http://please-dont-go.com")
String extension(String ruta) {
    int punto = ruta.lastIndexOf('.');
    if (punto == -1 || punto == ruta.length() - 1) {
        return "";
    }
    return ruta.substring(punto + 1);
}
extension("no-extension")
extension("/the.dot/file.java")
extension("/path/to/debug.sh")
extension("debug.sh")
extension("/java-latam/bootcamp-zero-to-hero/certificado-definalizacion")
domain("enlace-no-externo")
String domain(String url) {
    if (!esExterno(url)) {
        System.out.println("¿Qué más pues, mi llave? No me tire carreta, ese link no es externo, hagale pues!");
        return "";
    }
    
    String sinProtocolo = url.substring(url.indexOf("//") + 2);
    
    int slashIndex = sinProtocolo.indexOf('/');
    
    if (slashIndex == -1) {
        return sinProtocolo;
    } else {
        return sinProtocolo.substring(0, slashIndex);
    }
}
domain("enlace-no-externo")
domain("https://www.java.com/end/")
domain("http://jcp.org")
String domingoDePascua(int anio) {
        int a = anio % 19;
        int b = anio / 100;
        int c = anio % 100;
        int d = b / 4;
        int e = b % 4;
        int g = ((8 * b) + 13) / 25;
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 19 * l) / 433;
        int n = (h + l - 7 * m + 90) / 25;        
        int p = (h + l - 7 * m + (33 * n) + 19) % 32;
    
        return String.format("%04d/%02d/%02d", anio, n, p);
}
domingoDePascua(2024)
domingoDePascua(2025)
domingoDePascua(2026)
domingoDePascua(2013)
String hexString(int r, int g, int b) {
    return String.format("%02X%02X%02X", r, g, b);
}
hexString(0,0,0)
hexString(255, 255, 255)
hexString(12,15,77)