import java.util.Scanner;

public class JavaQuiz {
    public static void main(String[] args) {
        
        // Scanner para leer las respuestas del usuario
        Scanner teclado = new Scanner(System.in);

        // Variable compartida para contar los aciertos
        int aciertos = 0;

        // Presentación del concurso
        System.out.println("========== JAVAQUIZ ==========");
        System.out.println("Concurso de preguntas sobre Java");
        System.out.println("Responde escribiendo A, B o C.");

        // INICIO RONDA 1 - INTEGRANTE A
        System.out.println("\nRONDA 1");

        // Pregunta 1
        System.out.println("\nPregunta 1. ¿Qué tipo de dato almacena números enteros?");
        System.out.println("A) double");
        System.out.println("B) int");
        System.out.println("C) String");
        System.out.print("Respuesta: ");
        String resp1 = teclado.nextLine();
        if (resp1.equalsIgnoreCase("B")) {
            System.out.println("¡Correcto!");
            aciertos++;
        } else {
            System.out.println("Incorrecto.");
        }

        // Pregunta 2
        System.out.println("\nPregunta 2. ¿Cuál es el valor por defecto de una variable boolean en Java?");
        System.out.println("A) true");
        System.out.println("B) 0");
        System.out.println("C) false");
        System.out.print("Respuesta: ");
        String resp2 = teclado.nextLine();
        if (resp2.equalsIgnoreCase("C")) {
            System.out.println("¡Correcto!");
            aciertos++;
        } else {
            System.out.println("Incorrecto.");
        }

        // Pregunta 3
        System.out.println("\nPregunta 3. ¿Qué palabra clave se utiliza para declarar una constante en Java?");
        System.out.println("A) final");
        System.out.println("B) const");
        System.out.println("C) static");
        System.out.print("Respuesta: ");
        String resp3 = teclado.nextLine();
        if (resp3.equalsIgnoreCase("A")) {
            System.out.println("¡Correcto!");
            aciertos++;
        } else {
            System.out.println("Incorrecto.");
        }
        // FIN RONDA 1 - INTEGRANTE A

        // INICIO RONDA 2 - INTEGRANTE B
        // FIN RONDA 2 - INTEGRANTE B
        // RESULTADO FINAL - INTEGRANTE B
        // Cerrar Scanner
        teclado.close();
    }
}
