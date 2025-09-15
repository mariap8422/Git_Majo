// Esta es la clase principal. Aquí empieza todo. Creo los estudiantes, los ordeno, los busco, y muestro resultados.
public class Main {
    public static void main(String[] args) {
        // Creo un arreglo con 10 estudiantes. Cada uno tiene datos reales y una de las profesiones que pediste.
        Student[] students = {
            new Student(20, 3, 2, 8, 4, "Programmer", 101),
            new Student(19, 2, 3, 6, 6, "Biologist", 102),
            new Student(22, 5, 1, 12, 2, "Engineer", 103),
            new Student(21, 4, 4, 10, 4, "Journalist", 104),
            new Student(18, 1, 5, 4, 8, "Writer", 105),
            new Student(25, 7, 2, 16, 1, "Nurse", 106),
            new Student(20, 3, 3, 9, 3, "Architect", 107),
            new Student(23, 6, 1, 14, 2, "Translator", 108),
            new Student(19, 2, 6, 5, 7, "Chef", 109),
            new Student(24, 8, 2, 18, 0, "Pilot", 110)
        };

        // Primero muestro cómo están originalmente
        SortingAlgorithms.printStudents(students, "Lista Original");

        // Hago copias para no alterar el original en cada prueba
        Student[] studentsForBubble = students.clone();
        Student[] studentsForSelection = students.clone();

        // Aplico Bubble Sort por edad (menor a mayor) y muestro el resultado
        System.out.println("\n--- Ordenando por EDAD con Bubble Sort (menor a mayor) ---");
        SortingAlgorithms.bubbleSortByAge(studentsForBubble);
        SortingAlgorithms.printStudents(studentsForBubble, "Después de Bubble Sort por Edad");

        // Aplico Selection Sort por semestre (mayor a menor) y muestro el resultado
        System.out.println("\n--- Ordenando por SEMESTRE con Selection Sort (mayor a menor) ---");
        SortingAlgorithms.selectionSortBySemesterDesc(studentsForSelection);
        SortingAlgorithms.printStudents(studentsForSelection, "Después de Selection Sort por Semestre");

        // Busco un estudiante por su ID (busco al 105, que es "Writer")
        System.out.println("\n--- Buscando por ID de programa (105) con Búsqueda Lineal ---");
        int targetId = 105;
        int linearIndex = SearchAlgorithms.linearSearchByProgramId(students, targetId);
        if (linearIndex != -1) {
            System.out.println("✅ ¡Encontrado! Datos del estudiante:");
            students[linearIndex].printInfo();
        } else {
            System.out.println("❌ No se encontró ningún estudiante con ID " + targetId);
        }

        // Busco por edad (22) usando búsqueda binaria. Primero ordeno por edad.
        System.out.println("\n--- Buscando por EDAD (22) con Búsqueda Binaria (requiere ordenar antes) ---");
        Student[] studentsForBinary = students.clone();
        SortingAlgorithms.bubbleSortByAge(studentsForBinary); // Ordeno primero

        int targetAge = 22;
        int binaryIndex = SearchAlgorithms.binarySearchByAge(studentsForBinary, targetAge, 0, studentsForBinary.length - 1);
        if (binaryIndex != -1) {
            System.out.println("✅ ¡Encontrado! Datos del estudiante:");
            studentsForBinary[binaryIndex].printInfo();
        } else {
            System.out.println("❌ No se encontró ningún estudiante con edad " + targetAge);
        }
    }
}