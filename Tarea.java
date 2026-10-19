package tareas;

public class Tarea {
	String nombre; 
	boolean completada; 
public Tarea(String nombreTarea) {
	nombre = nombreTarea; 
    completada = false; 
}
public void cambiarAHecha() {
	completada = true; 
}
}
