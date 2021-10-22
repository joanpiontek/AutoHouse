package autoHouseManager;

import java.sql.*;
import java.util.Scanner;

public class BrandModelsManager {
    Scanner scanner = new Scanner(System.in);
    private static final String connectionUrl = "jdbc:sqlserver://DESKTOP-9IOR8E5;intedasatedSecurity=false;username=sa;password=Password123!;database=autoHousee2";

    private static final String CREATE_MODEL_PROCEDURE = "EXEC CreateModelProcedure ?, ?";
    private static final String DELETE_MODEL_PROCEDURE = "EXEC DeleteModelProcedure ?, ?";
    private static final String UPDATE_MODEL_PROCEDURE = "EXEC UpdateModelProcedure ?, ?, ?";
    private static final String GET_MODEL_PROCEDURE = "EXEC GetModelProcedure ?, ?";


    public static void createModel(String name, int brandId) {

        try (Connection conn = DriverManager.getConnection(connectionUrl);
             CallableStatement sta = conn.prepareCall(CREATE_MODEL_PROCEDURE)) {

            sta.setString(1, name);
            sta.setInt(2, brandId);

            sta.execute();

        }
        catch (SQLException ex) {
            System.out.println("Error while creating model with name: " + name);
        }
    }

    public static void deleteModel(String name, int brandId)  {

        try (Connection conn = DriverManager.getConnection(connectionUrl);
             CallableStatement sta = conn.prepareCall(DELETE_MODEL_PROCEDURE)) {

            sta.setString(1, name);
            sta.setInt(2, brandId);

            sta.execute();

        }
        catch (SQLException ex) {
            System.out.println("Error while deleting model with name: " + name);
        }
    }

    public static void updateModel(int modelId, String name, int brandId){

        try (Connection conn = DriverManager.getConnection(connectionUrl);
             CallableStatement sta = conn.prepareCall(UPDATE_MODEL_PROCEDURE)) {

            sta.setInt(1, modelId);
            sta.setString(2, name);
            sta.setInt(3, brandId);

            sta.execute();

        }
        catch (SQLException ex) {
            System.out.println("Error while updating model with name: " + name);
        }
    }


    public static void getModel(String name, int brandId){

        try (Connection conn = DriverManager.getConnection(connectionUrl);
             CallableStatement sta = conn.prepareCall(GET_MODEL_PROCEDURE)) {

            sta.setString(1, name);
            sta.setInt(2, brandId);

            sta.execute();

        }
        catch (SQLException ex) {
            System.out.println("Error while getting model with name: " + name);
        }
    }


}
