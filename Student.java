// Clase que representa a un estudiante universitario. Guarda todos sus datos académicos y personales.
public class Student {
    // Edad del estudiante (número entero)
    private int age;
    // Semestre actual en el que está matriculado
    private int semester;
    // Estrato socioeconómico (del 1 al 6)
    private int socioEconomicStratum;
    // Cantidad de materias que ya aprobó
    private int coursesCompleted;
    // Cantidad de materias que aún le faltan por aprobar
    private int coursesPending;
    // Nombre del programa académico (la carrera)
    private String program;
    // ID único del programa (para identificarlo fácilmente)
    private int programId;

    // Constructor: cuando creas un nuevo estudiante, le pasas todos estos datos
    public Student(int age, int semester, int socioEconomicStratum, 
                   int coursesCompleted, int coursesPending, 
                   String program, int programId) {
        this.age = age;
        this.semester = semester;
        this.socioEconomicStratum = socioEconomicStratum;
        this.coursesCompleted = coursesCompleted;
        this.coursesPending = coursesPending;
        this.program = program;
        this.programId = programId;
    }

    // Métodos para leer los valores (getters). No se pueden modificar desde afuera directamente.
    public int getAge() { return age; }
    public int getSemester() { return semester; }
    public int getSocioEconomicStratum() { return socioEconomicStratum; }
    public int getCoursesCompleted() { return coursesCompleted; }
    public int getCoursesPending() { return coursesPending; }
    public String getProgram() { return program; }
    public int getProgramId() { return programId; }

    // Este método imprime toda la info del estudiante en una sola línea, bien organizada
    public void printInfo() {
        System.out.printf("ID: %d | Edad: %d | Semestre: %d | Estrato: %d | " +
                          "Aprobadas: %d | Pendientes: %d | Programa: %s%n",
                          programId, age, semester, socioEconomicStratum,
                          coursesCompleted, coursesPending, program);
    }
}