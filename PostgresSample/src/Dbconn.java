import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Connection c = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/testdb",
	            "postgres", "a");
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
	   }
	}


