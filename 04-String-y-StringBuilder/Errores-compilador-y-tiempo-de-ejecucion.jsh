boolean empiezaConMinuscula(String s) {
    var primerCaracter = s.charAt(0);
    return Character.isLowerCase(primerCaracter);
}
String pluralizar(int conteo, String s) {
    return (conteo < 2) ? s : s.format("%d %ss", conteo, s);
}
empiezaConMinuscula("manzana")
empiezaConMinuscula("Manzana")
pluralizar(1, "codigo")
pluralizar(2, "codigo")
boolean esVocal(char letra) {
    var letraMinuscula = Character.toLowerCase(letra);
    return "aeiou".contains(Character.toString(letraMinuscula));
}
esVocal('a')
esVocal('f')
esVocal('A')
esVocal('c')
esVocal('@')
esVocal('i')
esVocal('I')