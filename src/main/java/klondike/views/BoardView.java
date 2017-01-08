package klondike.views;

import klondike.utils.IO;

public class BoardView {
	// este método recibiría la pila de descarte y la lista de pilas de las escaleras-
	void write() {
		IO io = new IO();
		
		io.writeln("===========================");
		io.writeln("Badaja: ");
		io.writeln("Descarte: ");
		
		for(int i=0; i<palos; i++){
			io.writeln("Palo " + CardView);
		}
		
		for(int i=1; i<=escaleras; i++){
			io.writeln("Escalera" + i);
		}
		
	}
	
}
