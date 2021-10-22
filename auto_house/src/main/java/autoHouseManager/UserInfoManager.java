package autoHouseManager;

import java.sql.*;
import java.util.Scanner;

public class UserInfoManager {
    Scanner scanner = new Scanner(System.in);
    private static final String connectionUrl = "jdbc:sqlserver://DESKTOP-9IOR8E5;intedasatedSecurity=false;username=sa;password=Password123!;database=autoHousee2";

    private static final String CREATE_USER_PROCEDURE = "EXEC CreateUser ?, ?, ?, ?";
    private static final String DELETE_USER_PROCEDURE = "EXEC DeleteUser ?, ?, ?";
    private static final String UPDATE_USER_PROCEDURE = "EXEC UpdateUser ?, ?, ?, ?, ?";
    private static final String GET_USER_PROCEDURE = "EXEC GetUser ?, ?, ?";

    public static void createUser(String username, float personalId, float userNumber, String userPassword){

        try (Connection conn = DriverManager.getConnection(connectionUrl);
             CallableStatement sta = conn.prepareCall(CREATE_USER_PROCEDURE)) {


            sta.setString(1, username);
            sta.setFloat(2, personalId);
            sta.setFloat(3, userNumber);
            sta.setString(4, userPassword);

            sta.execute();

        }
        catch (SQLException ex) {
            System.out.println("Error while creating user with personalId: " + personalId);
        }
    }

    public static void deleteUser(float personalId, float userNumber, String userPassword) {

        try (Connection conn = DriverManager.getConnection(connectionUrl);
             CallableStatement sta = conn.prepareCall(DELETE_USER_PROCEDURE)) {

            sta.setFloat(1, personalId);
            sta.setFloat(2, userNumber);
            sta.setString(3, userPassword);

            sta.execute();

        }
        catch (SQLException ex) {
            System.out.println("Error while deleting user with personalId: " + personalId);
        }
    }

    public static void updateUser(int userId, String username, float personalId, float userNumber, String userPassword){

        try (Connection conn = DriverManager.getConnection(connectionUrl);
             CallableStatement sta = conn.prepareCall(UPDATE_USER_PROCEDURE)) {

            sta.setInt(1, userId);
            sta.setString(2, username);
            sta.setFloat(3, personalId);
            sta.setFloat(4, userNumber);
            sta.setString(5, userPassword);

            sta.execute();

        }
        catch (SQLException ex) {
            System.out.println("Error while updating user with personalId: " + personalId);
        }
    }


    public static void getUser(String username, float personalId, float userNumber) {

        try (Connection conn = DriverManager.getConnection(connectionUrl);
             CallableStatement sta = conn.prepareCall(GET_USER_PROCEDURE)) {

            sta.setString(1, username);
            sta.setFloat(2, personalId);
            sta.setFloat(3, userNumber);

            sta.execute();

        }
        catch (SQLException ex) {
            System.out.println("Error while getting user with personalId: " + personalId);
        }
    }

}
