
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RegisterDao {
	private String dbUrl = "jdbc:mysql://localhost:3306/student";
	private String dbUname = "root";
	private String dbPassword = "";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";

	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public String insert(Student student) {
		loadDriver(dbDriver);
		Connection con = getConnection();
		String sql = "INSERT INTO `student_details` (`student_id`, `name`, `age`, `address`, `grade`) VALUES (NULL, ?, ?, ?, ?);";
		String result = "data enterd successfully";
		PreparedStatement psta;
		System.out.print(student);
		try {
			psta = con.prepareStatement(sql);

			psta.setString(1, student.getName());
			psta.setInt(2, student.getAge());
			psta.setString(3, student.getAddress());
			psta.setInt(4, student.getGrade());
			psta.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not enterd";

		}
		return result;
	}

	public List getStudents() {
		List<Student> students = new ArrayList<>();
		loadDriver(dbDriver);
		Connection con = getConnection();

		String sql = "SELECT * FROM `student_details`;";
		String result = "data enterd successfully";

		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Student student = new Student();

				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setAge(rs.getInt(3));
				student.setGrade(rs.getInt(4));

				students.add(student);
			}

		} catch (Exception exception) {

		}
		return students;
	}

}
