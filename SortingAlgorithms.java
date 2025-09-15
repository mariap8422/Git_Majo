// Esta clase tiene métodos estáticos para ordenar estudiantes. No necesitas crear objetos de esta clase.
public class SortingAlgorithms {

    // Bubble Sort: ordena los estudiantes de menor a mayor según su edad.
    // Va comparando de a dos, y si el de la izquierda es mayor, los cambia de lugar.
    // Es lento para muchos datos, pero fácil de entender y perfecto para pocos estudiantes.
    public static void bubbleSortByAge(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].getAge() > students[j + 1].getAge()) {
                    // Intercambio: guardo uno en una variable temporal
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort: ordena los estudiantes de mayor a menor según su semestre.
    // Busca el que tiene el semestre más alto en lo que queda del arreglo y lo pone en la posición actual.
    // Hace menos intercambios que Bubble Sort, pero igual es bueno para conjuntos pequeños.
    public static void selectionSortBySemesterDesc(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i; // Empiezo asumiendo que el mayor está en la posición i
            for (int j = i + 1; j < n; j++) {
                if (students[j].getSemester() > students[maxIndex].getSemester()) {
                    maxIndex = j; // Si encuentro uno mayor, actualizo el índice
                }
            }
            // Ahora intercambio el mayor con el que está en la posición i
            Student temp = students[i];
            students[i] = students[maxIndex];
            students[maxIndex] = temp;
        }
    }

    // Este método solo sirve para imprimir cualquier lista de estudiantes con un título arriba.
    // Lo uso para mostrar el original, el ordenado por edad, el ordenado por semestre, etc.
    public static void printStudents(Student[] students, String title) {
        System.out.println("\n=== " + title + " ===");
        for (Student s : students) {
            s.printInfo();
        }
    }
}