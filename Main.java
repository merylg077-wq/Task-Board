package tareas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	    EstanteTareas miEstante = new EstanteTareas();
	    Scanner scn = new Scanner(System.in);
	    
	    int numeroTarea;
	    
	    //Ingresar Tareas
	    System.out.println("ㄨ✘✗ﾒ✗•.ᐟ My Task Board ㄨ✘✗ﾒ✗•.ᐟ" );
	    System.out.println("Ingrese Tareas: "); 
	    System.out.println("Ingrese 0 para terminar. ");
	    
	    while(true) {
		    System.out.println("Nombre de la Tarea: ");
		    String nombreTarea = scn.nextLine();
		    
		    if(nombreTarea.equals("0")) {
		    	break;
		    }
		    if (nombreTarea.trim().isEmpty()) {
			    System.out.println("El nombre no puede estar vacio");
			    continue;
		    }
		    
		    miEstante.guardarTarea(nombreTarea);
	    }
	    
	    //Mostrar Tarea Ingresadas
	    if (!miEstante.misEspacios.isEmpty()) {
		    System.out.println("Escribe el numero de las tareas que completaste. Escribe 0 para terminar.");
		    
		    while(true) {
			    System.out.println("Numero de tareas: ");
			    
			    if(!scn.hasNext()) {
				    System.out.println("Ingrese un numero valido");
				    scn.nextLine();
				    continue;
			    }
			    
			    numeroTarea = scn.nextInt();
			    if(numeroTarea == 0) {
			    	break;
			    }
			    miEstante.marcarTareaComoHecha(numeroTarea);
		    }
		    //Resultado
		    System.out.println("ㄨ✘✗ﾒ✗• Estado final ㄨ✘✗ﾒ✗•");
		    miEstante.revisarEstante();
	    } else {
		    System.out.println("No ingreso ninguna tarea.");
	    }
	    System.out.println("ㄨ✘✗ﾒ✗• Terminaste de organizar tus tares ㄨ✘✗ﾒ✗•.");
	    scn.close();
	}
}