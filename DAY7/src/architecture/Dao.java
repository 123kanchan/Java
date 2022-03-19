package architecture;

import java.util.List;

public class Dao implements IDao {
	public Dao() {
		System.out.println("Connection to database is ready.");
	}

	@Override
	public List<String> getAllRecords() throws CustomException {
		System.out.println("Method getAllRecords() from Dao has been executed.");
		return null;
	}

}
