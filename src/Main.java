/**
 * Clase Main.
 * Punto de entrada del programa. Realiza la evaluación académica exprés
 * de un estudiante de prueba, mostrando su promedio y su estado final.
 *
 * @author Nombre Apellido - Cédula
 */
public class Main {

    /**
     * Método principal del programa.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        double[] notasPrueba = {90.0, 85.0, 150.0}; // 150.0 es una nota inválida

        Estudiante estudiante = new Estudiante("Carlos Pérez", notasPrueba);

        double promedio = estudiante.calcularPromedio();
        boolean aprobado = estudiante.estaAprobado();

        System.out.println("=== EVALUACIÓN ACADÉMICA EXPRÉS UTP ===");
        System.out.println("Estudiante: " + estudiante.getNombre());
        System.out.printf("Promedio Final: %.2f%n", promedio);
        System.out.println("Estado: " + (aprobado ? "✅ APROBADO" : "❌ REPROBADO"));
    }
}
