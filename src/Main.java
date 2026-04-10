void main(String[] args) {
    // Pruebas para el método valorAbsoluto
    double numeroNegativo = -15.5;
    double resultadoAbsoluto = miniCalculadora.valorAbsoluto(numeroNegativo);
    System.out.println("El valor absoluto de " + numeroNegativo + " es: " + resultadoAbsoluto);

    // Pruebas para el método raizCuadrada
    double numeroParaRaiz = 25.0;
    double resultadoRaiz = miniCalculadora.raizCuadrada(numeroParaRaiz);
    System.out.println("La raíz cuadrada de " + numeroParaRaiz + " es: " + resultadoRaiz);

    // Prueba extra con un número positivo para valor absoluto
    System.out.println("El valor absoluto de 10 es: " + miniCalculadora.valorAbsoluto(10));
}
