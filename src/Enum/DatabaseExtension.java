package Enum;

public class DatabaseExtension {

	public static String getDatabaseName(Database database){
		switch(database){
		case USJT:
			return "USJT";
		default:
			return "Outros";
		}
	}
	
}
