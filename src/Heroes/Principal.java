package Heroes;

		import java.util.ArrayList;

		public class Principal {

			public static void main(String[] args) {
				ArrayList <Persona> ListaSupers = new ArrayList <Persona> ();
				
				SuperHero Batman= new SuperHero(null, null, 0, null, null);
				Batman.setNombre("Bruce Wayne");
				Batman.setEdad(30);
				Batman.setCiudad("Gotica");
				Batman.setNombreS("Batman");
				Batman.setPoder("No tiene poderes");
				Villanos Joker = new Villanos (null, null, 0, null, null) ;
				Joker.setNombre("Arthur Fleck");
				Joker.setEdad(40);
				Joker.setCiudad("Gotica");
				Joker.setNombreS("Joker");
				Joker.setPoder("No tiene poderes");
				SuperHero Flash= new SuperHero(null, null, 0, null, null);
				Flash.setNombre("Barry Allen");
				Flash.setEdad(25);
				Flash.setCiudad("Central City");
				Flash.setNombreS("Flash");
				Flash.setPoder("Velocidad");
				Villanos Capitan_Frio = new Villanos (null, null, 0, null, null) ;
				Capitan_Frio.setNombre("Leonard Snart");
				Capitan_Frio.setEdad(39);
				Capitan_Frio.setCiudad("Central City");
				Capitan_Frio.setNombreS("Capitan Frio");
				Capitan_Frio.setPoder("Congelar");
				SuperHero Wonder_Woman= new SuperHero(null, null, 0, null, null);
				Wonder_Woman.setNombre("Ares");
				Wonder_Woman.setEdad(28);
				Wonder_Woman.setCiudad("Themyscira");
				Wonder_Woman.setNombreS("Wonder Woman");
				Wonder_Woman.setPoder("Fuerza, Volar");
				Villanos Ares = new Villanos (null, null, 0, null, null) ;
				Capitan_Frio.setNombre("Ares");
				Capitan_Frio.setEdad(1000);
				Capitan_Frio.setCiudad("Olimpo");
				Capitan_Frio.setNombreS("Ares");
				Capitan_Frio.setPoder("Dios");
				
	}

}
