public class HelloWorld
{
	private String displayText = "";

	/**
	 * Constructor. Sets the displayText string.
	 */
	public HelloWorld()
	{
		displayText = "Hello World!";
	}

	/**
	 * Returns the text to display.
	 *
	 * @return  The text to display.
	 */
	private String getTextToDisplay()
	{
		return displayText;
	}

	/**
	 * This is the method that is run when this program is run on the command line.
	 * All it really does is display what getTextToDisplay() returns.
	 * Since the method is static, it creates a HelloWorld object to gain access to the getTextToDisplay() method.
	 *
	 * @param  args The command line arguments when the program is run.
	 */
	public static void main( String[] args )
	{
		HelloWorld hw = new HelloWorld();
		System.out.println( hw.getTextToDisplay() );
	}
}
