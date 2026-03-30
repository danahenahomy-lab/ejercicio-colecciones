import java.util.HashMap;
import java.util.Scanner;

public class EjercicioColecciones {

    public static void main(String[] args) {
        HashMap<String, Double> estudiantes = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== MENÚ ===");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Eliminar estudiante");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese nota: ");
                    double nota = sc.nextDouble();
                    estudiantes.put(nombre, nota);
                    System.out.println("✅ Estudiante agregado\n");
                    break;

                case 2:
                    if (estudiantes.isEmpty()) {
                        System.out.println("No hay estudiantes\n");
                    } else {
                        System.out.println("📋 Lista de estudiantes:");
                        for (String key : estudiantes.keySet()) {
                            System.out.println(key + ": " + estudiantes.get(key));
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Ingrese nombre a buscar: ");
                    String buscar = sc.nextLine();
                    if (estudiantes.containsKey(buscar)) {
                        System.out.println("🔍 Nota: " + estudiantes.get(buscar) + "\n");
                    } else {
                        System.out.println("❌ No encontrado\n");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese nombre a eliminar: ");
                    String eliminar = sc.nextLine();
                    if (estudiantes.containsKey(eliminar)) {
                        estudiantes.remove(eliminar);
                        System.out.println("🗑️ Eliminado\n");
                    } else {
                        System.out.println("❌ No encontrado\n");
                    }
                    break;

                case 5:
                    System.out.println("👋 Saliendo...");
                    break;

                default:
                    System.out.println("❌ Opción inválida\n");
            }

        } while (opcion != 5);

        sc.close();
    }
}
