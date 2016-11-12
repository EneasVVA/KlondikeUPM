package klondike.views;

public class CardView {
	private String[] NUMBERS = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	private enum FACE {
		C, P, R, T
	}
	
	
	private String cardToString(){
		
		
		return "[" + number + "," + face "]";
	}
}
