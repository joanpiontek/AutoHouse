package autoHouseManager;

import java.sql.*;
import java.util.Scanner;

public class UserCarsManager {
    Scanner scanner = new Scanner(System.in);
    private static final String connectionUrl = "jdbc:sqlserver://DESKTOP-9IOR8E5;intedasatedSecurity=false;username=sa;password=Password123!;database=autoHousee2";

    private static final String CREATE_USER_CAR_PROCEDURE = "EXEC CreateUserCar ?, ?";
    private static final String DELETE_USER_CAR_PROCEDURE = "EXEC DeleteUserCar ?, ?";
    private static final String UPDATE_USER_CAR_PROCEDURE = "EXEC UpdateUserCar ?, ?, ?";
    private static final String GET_USER_CAR_PROCEDURE = "EXEC GetUserCar ?, ?";

    public static void createUserCar(String regNumber, int ownerId){

        try (Connection conn = DriverManager.getConnection(connectionUrl);
             CallableStatement sta = conn.prepareCall(CREATE_USER_CAR_PROCEDURE)) {

            sta.setString(1, regNumber);
            sta.setInt(2, ownerId);

            sta.execute();

        }
        catch (SQLException ex) {
            System.out.println("Error while creating user car with registration number: " + regNumber);
        }
    }

    public static void deleteUserCar(String regNumber, int ownerId) {

        try (Connection conn = DriverManager.getConnection(connectionUrl);
             CallableStatement sta = conn.prepareCall(DELETE_USER_CAR_PROCEDURE)) {

            sta.setString(1, regNumber);
            sta.setInt(2, ownerId);

            sta.execute();

        }
        catch (SQLException ex) {
            System.out.println("Error while deleting user car with registration number: " + regNumber);
        }
    }

    public static void updateUserCar(int carId, String regNumber, int ownerId) {

        try (Connection conn = DriverManager.getConnection(connectionUrl);
             CallableStatement sta = conn.prepareCall(UPDATE_USER_CAR_PROCEDURE)) {

            sta.setInt(1, carId);
            sta.setString(2, regNumber);
            sta.setInt(3, ownerId);

            sta.execute();

        }
        catch (SQLException ex) {
            System.out.println("Error while updating user car with registration number: " + regNumber);
        }
    }


    public static void getUserCar(String regNumber, int ownerId) {

        try (Connection conn = DriverManager.getConnection(connectionUrl);
             CallableStatement sta = conn.prepareCall(GET_USER_CAR_PROCEDURE)) {

            sta.setString(1, regNumber);
            sta.setInt(2, ownerId);

            sta.execute();

        }
        catch (SQLException ex) {
            System.out.println("Error while getting user car with registration number: " + regNumber);
        }
    }


}
