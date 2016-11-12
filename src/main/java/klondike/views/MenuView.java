package klondike.views;

import klondike.utils.IO;

public class MenuView {

	public void menu(){
		IO io = new IO();
		int option = 0;
		
		io.writeln("---------------------------");
		io.writeln("1. Mover de baraja a descarte");
		io.writeln("2. Mover de descarte a baraja");
		io.writeln("3. Mover de descarte a palo");
		io.writeln("4. Mover de descarte a escalera");
		io.writeln("5. Mover de escalera a palo");
		io.writeln("6. Mover de escalera a escalera");
		io.writeln("7. Mover de palo a escalera");
		io.writeln("8. Voltear en escalera");
		io.writeln("9. Salir");
		io.write("Opcion? [1-9]: ");
			
	}
	
	
}
