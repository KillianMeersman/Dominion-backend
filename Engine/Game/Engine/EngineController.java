package Engine;

public class EngineController {
	private EngineController() {};
	private EngineController instance = new EngineController();
	
	public EngineController getInstance() {
		return instance;
	}
	
	public void initGame(int players) {
		
	}
}
