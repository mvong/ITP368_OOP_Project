package game_logic;

public enum PlayerState {
	IDLE("Player is idle."),
	ATTACKING("Player is attacking."),
	DEAD("Player is dead."),
	STUNNED("Player is stunned.");

	private final String description;
	
	PlayerState(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
}