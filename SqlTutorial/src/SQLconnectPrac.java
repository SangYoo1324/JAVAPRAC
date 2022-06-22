import java.sql.*;

public class SQLconnectPrac {

   /* JDBC.Driver = com.mysql.jdbc.Driver
    URL = jdbc:mysql//url주소:포트번호( mysql 홈스크린에 둘이 쌍으로 붙어있음)/db명(커넥션 서버명 아님 데이타베이스임)
*/
    public static void main(String[] args) throws SQLException  {
        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/market_db";
        String USER_NAME = "root";
        String PASSWORD = "Qwdf3696!";
        Connection conn = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("Select * FROM buy");
        resultSet.next();
        String name = resultSet.getString("mem_id");
        System.out.println(name);

        resultSet.close();
        statement.close();
        conn.close();
    }

}
