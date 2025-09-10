// Aquí van los métodos para buscar estudiantes. También son estáticos, no necesitas instanciar esta clase.
public class SearchAlgorithms {

    // Búsqueda lineal: busca un estudiante por su ID de programa.
    // Simplemente recorre toda la lista hasta encontrarlo. No necesita que esté ordenado.
    // Con 10 estudiantes, es super rápido y fácil de entender.
    public static int linearSearchByProgramId(Student[] students, int targetId) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getProgramId() == targetId) {
                return i; // Si lo encuentra, devuelve la posición
            }
        }
        return -1; // Si no lo encuentra, devuelve -1
    }

    // Búsqueda binaria: busca un estudiante por su edad.
    // IMPORTANTE: el arreglo TIENE que estar ordenado por edad (de menor a mayor) antes de usar esto.
    // Funciona dividiendo el arreglo a la mitad cada vez. Es mucho más rápido que la búsqueda lineal en listas grandes.
    // Aquí lo hago recursivo (se llama a sí mismo) para que sea más claro el concepto de "divide y vencerás".
    public static int binarySearchByAge(Student[] students, int targetAge, int left, int right) {
        // Si el límite izquierdo pasó al derecho, es porque no está
        if (left > right) {
            return -1;
        }

        // Calculo el punto medio
        int mid = left + (right - left) / 2;

        // Si la edad del estudiante en el medio es la que busco, ¡listo!
        if (students[mid].getAge() == targetAge) {
            return mid;
        }
        // Si la edad del medio es mayor que la que busco, busco en la mitad izquierda
        else if (students[mid].getAge() > targetAge) {
            return binarySearchByAge(students, targetAge, left, mid - 1);
        }
        // Si es menor, busco en la mitad derecha
        else {
            return binarySearchByAge(students, targetAge, mid + 1, right);
        }
    }
}