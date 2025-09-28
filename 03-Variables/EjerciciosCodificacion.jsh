mod(3, 2)
mod(4, 2)
mod(3, 2)
mod(4, 2)
mod(3, 2)
mod(4, 2)
mod(3, 2)
mod(4, 2)
mod(3, 2)
mod(3, 2)
int mod(int p, int q) {
    var d = p / q;
    int r = d * q;
    int m = p - r;
    return m;
}
mod(3, 2)
mod(4, 2)
int diferenciaDeCuadrados(int a, int b) {
    var cuadradoDeA = a * a;
    var cuadradoDeB = b * b;
    var diferenciaDeCuadrados = cuadradoDeA - cuadradoDeB;
    return diferenciaDeCuadrados;
}
diferenciaDeCuadrados(3, 4)
diferenciaDeCuadrados(2, 2)
double distancia(double x1,double y1,double x2,double y2) {
    double xSubstraction = x2 - x1;
    double ySubstraction = y2 - y1;
    double xSquared = xSubstraction * xSubstraction;
    double ySquared = ySubstraction * ySubstraction;
    return Math.sqrt(xSquared + ySquared);
}
distancia(0.0, 0.0, 1.0, 1.0)
distancia(0.0, 3.0, 4.0, 0.0)
double fahrenheitACelsius(double f) {
    return (f - 32) * (5.0 / 9.0);
}
fahrenheitACelsius(60.0)
fahrenheitACelsius(32.0)
double gravedadSuperficial(double masa, double radio) {
    double G = 6.67430e-11;
    double radioAlCuadrado = radio * radio;
    return (G * masa) / radioAlCuadrado;
}
gravedadSuperficial(5.972e24, 6.378e6)
gravedadSuperficial(6.421e23, 3.3972e6)
gravedadSuperficialDeLaTierra()
double gravedadSuperficialDeLaTierra() {
    return gravedadSuperficial(5.972e24, 6.378e6);
}
double gravedadSuperficialDeMarte() {
    return gravedadSuperficial(6.421e23, 3.3972e6);
}
double pesoEnMarte(double pesoTierra) {
    return (gravedadSuperficialDeMarte() / gravedadSuperficialDeLaTierra()) * pesoTierra;
}
pesoEnMarte(80.0)
pesoEnMarte(65.0)
pesoEnMarte(105)