package autoHouseManager;

import java.sql.*;
import java.util.Scanner;

public class RepairListManager {
    Scanner scanner = new Scanner(System.in);
    private static final String connectionUrl = "jdbc:sqlserver://DESKTOP-9IOR8E5;intedasatedSecurity=false;username=sa;password=Password123!;database=autoHousee2";

    private static final String CREATE_CAR_REPAIR_PROCEDURE = "EXEC CreateUserCarRepair ?, ?";
    //private static final String DELETE_CAR_REPAIR_PROCEDURE = "EXEC DeleteUserCarRepair ?, ?, ?";
    private static final String UPDATE_CAR_REPAIR_PROCEDURE = "EXEC UpdateUserCarRepair ?, ?, ?";
    private static final String GET_CAR_REPAIR_PROCEDURE = "EXEC GetUserCarRepair ?, ?";

    public static void createCarRepair(int repairPrize, float carRegId){

        try (Connection conn = DriverManager.getConnection(connectionUrl);
             CallableStatement sta = conn.prepareCall(CREATE_CAR_REPAIR_PROCEDURE)) {

            sta.setInt(1, repairPrize);
            sta.setFloat(2, carRegId);

            sta.execute();

        }
        catch (SQLException ex) {
            System.out.println("Error while creating user car repair with registration number: " + carRegId);
        }
    }

    public static void updateCarRepair(int repairId, int repairPrize, float carRegId) {

        try (Connection conn = DriverManager.getConnection(connectionUrl);
             CallableStatement sta = conn.prepareCall(UPDATE_CAR_REPAIR_PROCEDURE)) {

            sta.setInt(1, repairId);
            sta.setInt(2, repairPrize);
            sta.setFloat(3, carRegId);

            sta.execute();

        }
        catch (SQLException ex) {
            System.out.println("Error while updating user car repair with registration number: " + carRegId);
        }
    }


    public static void getCarRepair(int repairPrize, float carRegId){

        try (Connection conn = DriverManager.getConnection(connectionUrl);
             CallableStatement sta = conn.prepareCall(GET_CAR_REPAIR_PROCEDURE)) {

            sta.setInt(1, repairPrize);
            sta.setFloat(2, carRegId);

            sta.execute();

        }
        catch (SQLException ex) {
            System.out.println("Error while getting user car repair with registration number: " + carRegId);
        }
    }

//    public static void deleteCarRepair(int repairId, int repairPrize, float carRegId) throws SQLException {
//
//        try (Connection conn = DriverManager.getConnection(connectionUrl);
//             CallableStatement sta = conn.prepareCall(DELETE_CAR_REPAIR_PROCEDURE)) {
//
//            sta.setInt(1, repairId);
//            sta.setInt(2, repairPrize);
//            sta.setFloat(3, carRegId);
//
//            sta.execute();
//
//        }
//    }

}
