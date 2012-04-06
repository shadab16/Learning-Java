class DbConn {
	public static void main(String[] args) {

		final String url = "jdbc:mysql://localhost:3306/mysql";
		
		// Create database connection
		Connection con = DriverManager.getConnection(url,"root", "");

		
	}
}

