import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectEx {
    public static void main(String[] args) {
        String Driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/market_db";
        String id = "root";
        String password = "Qwdf3696!";
        Connection conn =null;  //db에 접속
        Statement stmt = null; // sql 명령어 실행(select 같은겅)
        ResultSet rs = null;//select 명령어 실행=> 결과셋

        try{
       // Class.forName(Driver);
        conn = DriverManager.getConnection(url,id, password);// connection 으로 접속
        String sql = "Select * from buy";
        stmt = conn.createStatement(); // sql을 실행시켜주는 객체를 만듦
        rs = stmt.executeQuery(sql); // 쿼리문으로 테이블 전체 불러옴(rs= 테이블 전체를담고 있는 객체)

        while(rs.next()){// rs(테이블 전체 객체)가 내용물이 있을때까지 반복
            // rs.next() 리턴값은 true, false/ but, 한번 실행될때마다 row가 한개씩 내려감
            //처음 next() -첫째줄 , 둘째 next() - 둘째줄

    int num = rs.getInt("num");
    String memId = rs.getString("mem_id");
    String prodName = rs.getString("prod_name");
    String groupName = rs.getString("group_name");
    int price = rs.getInt("price");
    int amount = rs.getInt("amount");
            System.out.println(num+"\t"+memId+"\t"+prodName+"\t"+groupName+"\t"+price+"\t"+amount);

        }

        }catch(Exception e){
e.printStackTrace();
        } finally{
            try{
        if(rs!=null) rs.close();
            }catch(Exception e2){
        e2.printStackTrace();
            }
            try{
                if(stmt!=null) stmt.close();
            }catch(Exception e2){
                e2.printStackTrace();
            }
            try{
                if(conn!=null) conn.close();
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }

    }
}
