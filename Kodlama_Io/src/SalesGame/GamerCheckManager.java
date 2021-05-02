package SalesGame;

public class GamerCheckManager implements GamerCheckService{

	@Override
	public boolean control(Gamer gamer) {
		
		if(gamer.getAge()>17) {
			return true;
		}
		return false;
	}

}
