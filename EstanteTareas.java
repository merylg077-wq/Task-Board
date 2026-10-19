package tareas;

import java.util.ArrayList;

public class EstanteTareas {
	ArrayList<Tarea> misEspacios = new ArrayList<>();
	
public void guardarTarea(String nombre) {
	Tarea nuevaTarea = new Tarea(nombre);
	misEspacios.add(nuevaTarea);
	
	System.out.println("Guardado");
}

public void marcarTareaComoHecha(int numeroTarea) {
	if (numeroTarea >= 1 && numeroTarea <= misEspacios.size()) {
		misEspacios.get(numeroTarea - 1).cambiarAHecha();
		System.out.println("Tarea completada");
	} else {
		System.out.println("Esta Tarea no existe.");
	}
}
	//ver lo que hay en el estante 
public void revisarEstante() {
	System.out.println("====Revisando mis tareas===="); 
	for (int i=0; i<misEspacios.size(); i++) {
		String estado = misEspacios.get(i).completada 
				?"Listo": 
				"Pendiente:";
		System.out.println((i+1) +"." + misEspacios.get(i).nombre + "("+ estado + ")");
	 }
  }

}
