package Heroes;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList <SuperHero> ListaSupers = new ArrayList <SuperHero> ();
		ArrayList <Villanos> ListaVillians = new ArrayList <Villanos> ();
		SuperHero Batman= new SuperHero(null, null, 0, null, null);
		Batman.setNombre("Bruce Wayne");
		Batman.setEdad(30);
		Batman.setCiudad("Gotham City");
		Batman.setNombreS("Batman");
		Batman.setPoder("No tiene poderes");
		ListaSupers.add(Batman);
		
		Villanos Joker = new Villanos (null, null, 0, null, null) ;
		Joker.setNombre("Arthur Fleck");
		Joker.setEdad(40);
		Joker.setCiudad("Gotham City");
		Joker.setNombreS("Joker");
		Joker.setPoder("No tiene poderes");
		ListaVillians.add(Joker);
		
		SuperHero Flash= new SuperHero(null, null, 0, null, null);
		Flash.setNombre("Barry Allen");
		Flash.setEdad(25);
		Flash.setCiudad("Central City");
		Flash.setNombreS("Flash");
		Flash.setPoder("Velocidad");
		ListaSupers.add(Flash);
		
		Villanos Capitan_Frio = new Villanos (null, null, 0, null, null) ;
		Capitan_Frio.setNombre("Leonard Snart");
		Capitan_Frio.setEdad(39);
		Capitan_Frio.setCiudad("Central City");
		Capitan_Frio.setNombreS("Capitan Frio");
		Capitan_Frio.setPoder("Congelar");
		ListaVillians.add(Capitan_Frio);
		
		SuperHero Wonder_Woman= new SuperHero(null, null, 0, null, null);
		Wonder_Woman.setNombre("Diana Prince");
		Wonder_Woman.setEdad(28);
		Wonder_Woman.setCiudad("Themyscira");
		Wonder_Woman.setNombreS("Wonder Woman");
		Wonder_Woman.setPoder("Fuerza, Volar");
		ListaSupers.add(Wonder_Woman);
		
		Villanos Ares = new Villanos (null, null, 0, null, null) ;
		Ares.setNombre("Ares");
		Ares.setEdad(1000);
		Ares.setCiudad("Olimpo");
		Ares.setNombreS("Ares");
		Ares.setPoder("Los de un Dios");
		ListaVillians.add(Ares);
		
		for(int i=0; i<ListaVillians.size(); i++) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("Su nombre de Super Heroe es: " + ListaSupers.get(i).nombreS);
			System.out.println("Su identidad secreta es: " + ListaSupers.get(i).nombre);
			System.out.println("Tiene una edad de: " + ListaSupers.get(i).edad);
			System.out.println("Su lugar de nacimiento es: " + ListaSupers.get(i).ciudad);
			System.out.println("Sus poderes son: " + ListaSupers.get(i).poder);
			System.out.println("-------------------------------------------------------------");
			System.out.println("Su principal villano es: " + ListaVillians.get(i).nombreS);
			System.out.println("Su identidad secreta es: " + ListaVillians.get(i).nombre);
			System.out.println("Tiene una edad de: " + ListaVillians.get(i).edad);
			System.out.println("Su lugar de nacimiento es: " + ListaVillians.get(i).ciudad);
			System.out.println("Sus poderes son: " + ListaVillians.get(i).poder);
			System.out.println("-------------------------------------------------------------");
			
		}

	}

}
