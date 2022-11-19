package lab5.task_5_3.menu;

public class MenuView {
	public final static String MENU = "1) encode input\n" + "2) encode file\n" + "3) decode file\n" + "4) exit\n";
	public final static String MENU_INPUT_FIELD = "Enter a corresponding number to continue: ";

	public final static String ENCODED_DATA_INPUT_FIELD = "Enter a data to encode: ";
	public final static String ENCODED_FILE_INPUT_FIELD = "Enter a name of file to encode: ";
	public final static String DECODED_FILE_INPUT_FIELD = "Enter a name of file to decode: ";
	public final static String TARGET_FILE_INPUT_FIELD = "Enter a name of a file to save: ";
	
	public final static String OPERATION_SUCCESS = "Successfully complete...\n\n";

	public final static String COMMAND_ERROR = "Error! Invalid command!\n\n";

	public static final String FILE_ERROR = "Error! Error while attemptiong to read file!\n";

	public final static String EXIT = "Exiting the program...\n\n";

	public void showMessage(String msg) {
		System.out.print(msg);
	}

	public void showException(String msg, Exception exception) {
		System.out.println(msg);
		System.out.println(exception.getMessage() + "\n");
	}
}
