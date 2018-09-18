
public class Objects {
	
	public static void main (String[] args) {
		game g = new game();
		g.setName("Victor");
		System.out.println(g.getName());
	}
}
class game{
	public String gameName = "";
	
	public String getGameName() {
		
	}
	
	class user{
		public int Health = 0;
		
		public int getHealth() {
			return Health; 
		}
	}
	
}