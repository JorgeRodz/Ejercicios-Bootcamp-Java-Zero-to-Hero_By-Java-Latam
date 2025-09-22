int truncado(int n) {
    return n / 10;
}
truncado(123)
truncado(456)
truncado(9)
truncado(0)
int ultimoDigito(int n) {
    return n % 10;
}
ultimoDigito(123)
ultimoDigito(456)
ultimoDigito(9)
ultimoDigito(0)
boolean unicoDigito(int n) {
    return (n >= 0) && (n < 10);
}
unicoDigito(0)
unicoDigito(1)
unicoDigito(5)
unicoDigito(9)
unicoDigito(10)
unicoDigito(88)
String signo(int n) {
    return (n >- 0) ? "no-negativo" : "negativo";
}
signo(1)
signo(0)
signo(-1)
signo(10)
signo(0)
boolean esPar(int n) {
    return n % 2 == 0;
}
esPar(2)
esPar(3)
esPar(13)
esPar(15)
boolean esImpar(int n) {
    return n % 2 != 0;
}
esImpar(3)
esImpar(2)
esImpar(5)
int diferenciaDeCuadrados(int numero1, int numero2) {
    return (numero1*numero1) - (numero2*numero2);
}
diferenciaDeCuadrados(3,2)
diferenciaDeCuadrados(8,3)
diferenciaDeCuadrados(1,1)
tercerAngulo(60.0, 60.0)
tercerAngulo(45.0, 90.0)
double tercerAngulo(double a, double b) {
    return 180.0 - (a + b);
}
tercerAngulo(60.0, 60.0)
tercerAngulo(45.0, 90.0)
tercerAngulo(35.0, 50.0)
boolean validarMultiploDe7(int n) {
    return (n > 0) && (n < 1000) && (n % 7 == 0);
}
validarMultiploDe7(-7)
validarMultiploDe7(0)
validarMultiploDe7(91)
validarMultiploDe7(9100)
validar(0,1,2)
validar(1,1,2)
validar(2,1,3)
validar(0,3,3)
validar(1,3,5)
validar(0,1,2)
boolean validar(int inicio, int mitad, int tamano) {
    return (inicio >= 0) && (inicio < mitad) && (mitad < tamano);
}
validar(0,1,2)