import java.util.Scanner;

public class SystemEx {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(java.lang.System.in);
        String opcion;

        do {
            java.lang.System.out.println("\n=== Sistema Experto de Diagnóstico de Fallas en Automóviles ===");
            java.lang.System.out.println("Responde con 'si' o 'no' a las siguientes preguntas.\n");

            java.lang.System.out.print("¿El auto arranca? ");
            String arranca = sc.nextLine().toLowerCase();

            if (arranca.equals("no")) {
                java.lang.System.out.print("¿Las luces del tablero encienden? ");
                String luces = sc.nextLine().toLowerCase();

                if (luces.equals("no")) {
                    java.lang.System.out.println("➡ Posible causa: Batería descargada.");
                } else {
                    java.lang.System.out.println("➡ Posible causa: Fallo en el motor de arranque.");
                }
            } else { // si arranca
                java.lang.System.out.print("¿El auto se apaga al acelerar? ");
                String seApaga = sc.nextLine().toLowerCase();

                if (seApaga.equals("si")) {
                    java.lang.System.out.println("➡ Posible causa: Problema en el suministro de combustible.");
                } else {
                    java.lang.System.out.print("¿El auto tiene humo negro por el escape? ");
                    String humoNegro = sc.nextLine().toLowerCase();

                    if (humoNegro.equals("si")) {
                        java.lang.System.out.println("➡ Posible causa: Mezcla rica de combustible.");
                    } else {
                        java.lang.System.out.print("¿El auto tiene humo blanco constante? ");
                        String humoBlanco = sc.nextLine().toLowerCase();

                        if (humoBlanco.equals("si")) {
                            java.lang.System.out.println("➡ Posible causa: Falla en la junta de culata.");
                        } else {
                            java.lang.System.out.println("➡ No se encontró una causa en la base de conocimiento.");
                        }
                    }
                }
            }

            // Preguntar si desea reiniciar
            java.lang.System.out.print("\n¿Desea realizar otro diagnóstico? (si/no): ");
            opcion = sc.nextLine().toLowerCase();

        } while (opcion.equals("si"));

        java.lang.System.out.println("\nGracias por usar el sistema experto. ¡Hasta luego!");
        sc.close();
    }
}
