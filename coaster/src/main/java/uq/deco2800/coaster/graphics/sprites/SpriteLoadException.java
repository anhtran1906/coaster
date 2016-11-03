package uq.deco2800.coaster.graphics.sprites;

/**
 * An exception that indicates an issue with loading or retrieving a sprite.
 */
public class SpriteLoadException extends RuntimeException {

	/**
	 * Default serialVersionUID, generated by Eclipse
	 */
	private static final long serialVersionUID = 1L;

	// Without custom error message
	public SpriteLoadException() {
		super();
	}

	// With string passed for error message
	public SpriteLoadException(String message) {
		super(message);
	}


}