public class Main {
    public static void main(String[] args) {
        Dado d6 = new Dado();
        Dado d10 = new Dado(10);
        Dado d12 = new Dado(12);

        int suma = 0;

        while (suma < 20) {
            int resultadod6 = d6.tirar();
            int resultadod10 = d10.tirar();
            int resultadod12 = d12.tirar();

            suma = resultadod6 + resultadod10 + resultadod12;

            System.out.println("Resultados de los dados: " + resultadod6 + ", " + resultadod10 + ", " + resultadod12);
        }
        System.out.println("La suma de los dados es mayor o igual a 20: " + suma);
    }
}