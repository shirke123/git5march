package jdbc;

import java.sql.*;

public class SelectDemo {
    public static void main(String[] args) throws ClassNotFoundException,SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver"); //register driver

        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/fullstack10feb","root","root");
        //establish connection

        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from employee");
        ResultSetMetaData res=resultSet.getMetaData();

        System.out.println(res.getTableName(1));
        System.out.println(res.getColumnName(1)+" "+res.getColumnName(2)+" "+res.getColumnName(3));

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)
                    +" "+resultSet.getString(3));
        }
    }
}
