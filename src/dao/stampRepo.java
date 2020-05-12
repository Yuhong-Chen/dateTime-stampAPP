package dao;
import java.sql.*;
import bean.stamp;
public class stampRepo {
    private Connection con = null;
    public stampRepo () {
        String url="jdbc:mysql://aak9c18ya9dhbz.cxtpq9s3htbt.eu-west-2.rds.amazonaws.com:3306/ebdb?user=dateAppAdmin&password=dateAppAdmin";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.print(e);
        }
        if (con == null) {
            System.out.println("DB not connected");
        }else {
            System.out.println("DB connected successfully");
        }
    }

    public void create(stamp stamp) {
        String sql = "insert into stamps (time) values (?)";

        try {
            PreparedStatement pt = (PreparedStatement) con.prepareStatement(sql);
            pt.setString(1, stamp.getTime());
            pt.executeUpdate();
            System.out.println("Stamp added to the database");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
