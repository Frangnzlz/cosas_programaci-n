import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class GestorEmpleados {
	private HashMap<String, Double> empleados;
	private static Scanner sc = new Scanner(System.in);
	
	public GestorEmpleados() {
		empleados = new HashMap<>();
	}
	
	//añadir empleado
	public void nuevoEmpleado() {

		String nombre;
		Double salario;
		
		System.out.println("Introduce el nombre del empleado");
		nombre = sc.nextLine();
		
		System.out.println("Introduce el salario del empleado");
		salario = Double.valueOf(sc.nextLine());
		
		empleados.put(nombre, salario);
	}
	
	
	//eliminar Empleado
	public void eliminarEmpleado(String nombre) {
		if(empleados.containsKey(nombre)) {
			empleados.remove(nombre);
			System.out.println(nombre + " borrado");
		}else {
			System.out.println("No existe ese empleado");
		}
	}
	
	//mostrar Empleados
	public void mostrarListaEmpleados() {
		ArrayList<String> salarios = new ArrayList<>();
		
		salarios.addAll(Arrays.asList(empleados.toString().split(",")));
		for (String string : salarios) {
			System.out.println(string);
		}
		
		
	}
	
	//modificar Salario
	public void modificarSalario(String nombre, double nuevoSalario) {
		if(empleados.containsKey(nombre)) {
			empleados.put(nombre, nuevoSalario);
			System.out.println("Salario acutalizado");
		}else {
			System.out.println("no existe ese empleado");
		}
	}
	
	
}
