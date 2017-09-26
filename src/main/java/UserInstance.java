import java.sql.*;
public class UserInstance {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/user_0925","root","password");
        Statement stm = connection.createStatement();
        String sql = "select * from user_0925.user_id where 1=1";
        ResultSet resultSet = stm.executeQuery(sql);
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
    }
}
