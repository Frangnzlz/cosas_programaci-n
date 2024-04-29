
import java.util.Scanner;

public class MainGestoEmpleados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GestorEmpleados empl = new GestorEmpleados();
		String nombre;
		Double salario;
		int opcion = 0;
		
		do {
			System.out.println("1.Nuevo empleado");
			System.out.println("2.Eliminar empleado");
			System.out.println("3.mostar lista empleados");
			System.out.println("4.modificar salario");
			System.out.println("5.salir");
			
			try {
				opcion = Integer.valueOf(sc.nextLine());
	
				
				switch(opcion) {
				case 1:
					empl.nuevoEmpleado();
					break;
				case 2:
					System.out.println("Nombre del empleado a eliminar");
					nombre = sc.nextLine();
					empl.eliminarEmpleado(nombre);
					break;
				case 3:
					empl.mostrarListaEmpleados();
					break;
				case 4:
					System.out.println("Nombre del empleado");
					nombre = sc.nextLine();
					
					System.out.println("Nuevo sueldo del empleado");
					salario = Double.valueOf(sc.nextLine());
					
					empl.modificarSalario(nombre, salario);
					break;
				case 5:
					System.out.println("gracias por usar nuestro programa");
					break;
				default:
					System.out.println("Opcion no valida");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("formato de numero errado");
			}
			
		}while(opcion != 5);
		sc.close();
		
	}
}
