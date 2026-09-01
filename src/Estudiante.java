/**
 * Clase Estudiante.
 * Representa a un estudiante con su nombre y sus notas académicas,
 * aplicando encapsulamiento y validaciones de seguridad sobre las notas.
 *
 * @author Nombre Norlan Gago - 20-53-8721
 */
public class Estudiante {

    private String nombre;
    private double[] notas;

    /**
     * Constructor de la clase Estudiante.
     *
     * @param nombre nombre del estudiante
     * @param notas  arreglo con las notas del estudiante
     */
    public Estudiante(String nombre, double[] notas) {
        this.nombre = nombre;
        setNotas(notas);
    }

    /**
     * Obtiene el nombre del estudiante.
     *
     * @return nombre del estudiante
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el arreglo de notas al estudiante, validando que cada nota
     * se encuentre en el rango permitido [0.0, 100.0]. Si una nota está
     * fuera de rango, se reasigna automáticamente a 0.0 como medida de
     * seguridad.
     *
     * @param notas arreglo de notas a validar y asignar
     */
    public void setNotas(double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 0.0 || notas[i] > 100.0) {
                notas[i] = 0.0;
            }
        }
        this.notas = notas;
    }

    /**
     * Obtiene el arreglo de notas del estudiante.
     *
     * @return arreglo de notas
     */
    public double[] getNotas() {
        return notas;
    }

    /**
     * Calcula el promedio de las notas almacenadas en el arreglo.
     *
     * @return promedio de las notas
     */
    public double calcularPromedio() {
        double suma = 0.0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    /**
     * Determina si el estudiante está aprobado según su promedio final.
     *
     * @return true si el promedio es mayor o igual a 71.0, false en caso contrario
     */
    public boolean estaAprobado() {
        if (calcularPromedio() >= 71.0) {
            return true;
        } else {
            return false;
        }
    }
}
