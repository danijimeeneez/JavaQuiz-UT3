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
        System.out.println("\nRONDA 2");

        // Pregunta 4
        System.out.println("\nPregunta 4. ¿Cuál es el primer índice de un array en Java?");
        System.out.println("A) 1");
        System.out.println("B) -1");
        System.out.println("C) 0");
        System.out.print("Respuesta: ");
        String resp4 = teclado.nextLine();
        if (resp4.equalsIgnoreCase("C")) {
            System.out.println("¡Correcto!");
            aciertos++;
        } else {
            System.out.println("Incorrecto.");
        }

        // Pregunta 5
        System.out.println("\nPregunta 5. ¿Qué método de la clase String devuelve la longitud de una cadena?");
        System.out.println("A) size()");
        System.out.println("B) length()");
        System.out.println("C) count()");
        System.out.print("Respuesta: ");
        String resp5 = teclado.nextLine();
        if (resp5.equalsIgnoreCase("B")) {
            System.out.println("¡Correcto!");
            aciertos++;
        } else {
            System.out.println("Incorrecto.");
        }

        // Pregunta 6
        System.out.println("\nPregunta 6. ¿Qué bucle en Java se ejecuta siempre al menos una vez?");
        System.out.println("A) do-while");
        System.out.println("B) while");
        System.out.println("C) for");
        System.out.print("Respuesta: ");
        String resp6 = teclado.nextLine();
        if (resp6.equalsIgnoreCase("A")) {
            System.out.println("¡Correcto!");
            aciertos++;
        } else {
            System.out.println("Incorrecto.");
        }
        // FIN RONDA 2 - INTEGRANTE B

        // RESULTADO FINAL - INTEGRANTE B
        System.out.println("\n========== RESULTADO ==========");
        System.out.println("Respuestas correctas: " + aciertos + " de 6");
        System.out.println("Fin del concurso.");
        // Cerrar Scanner
        teclado.close();
    }
}
