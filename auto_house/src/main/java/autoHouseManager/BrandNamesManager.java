package autoHouseManager;


import java.sql.*;
import java.util.Scanner;

public class BrandNamesManager {
    Scanner scanner = new Scanner(System.in);
    private static final String connectionUrl = "jdbc:sqlserver://DESKTOP-9IOR8E5;intedasatedSecurity=false;username=sa;password=Password123!;database=autoHousee2";

    private static final String CREATE_BRAND_PROCEDURE = "EXEC CreateBrandProcedure ?";
    private static final String DELETE_BRAND_PROCEDURE = "EXEC DeleteBrandProcedure ?";
    private static final String UPDATE_BRAND_PROCEDURE = "EXEC UpdateBrandProcedure ?, ?";
    private static final String GET_BRAND_PROCEDURE = "EXEC GetBrandProcedure ?, ?";

    public static void createBrand(String name) {

        try (Connection conn = DriverManager.getConnection(connectionUrl);
             CallableStatement sta = conn.prepareCall(CREATE_BRAND_PROCEDURE)) {

            sta.setString(1, name);

            sta.execute();

        } catch (SQLException ex) {
            System.out.println("Error while creating brand with name: " + name);
        }
    }

    public static void deleteBrand(String name) {

        try (Connection conn = DriverManager.getConnection(connectionUrl);
             CallableStatement sta = conn.prepareCall(DELETE_BRAND_PROCEDURE)) {

            sta.setString(1, name);

            sta.execute();

        }
        catch (SQLException ex) {
            System.out.println("Error while deleting brand with name: " + name);
        }
    }

    public static void updateBrand(int brandId, String name){

        try (Connection conn = DriverManager.getConnection(connectionUrl);
             CallableStatement sta = conn.prepareCall(UPDATE_BRAND_PROCEDURE)) {

            sta.setInt(1, brandId);
            sta.setString(2, name);

            sta.execute();

        }
        catch (SQLException ex) {
            System.out.println("Error while updating brand with name: " + name);
        }
    }

    public static void getBrand(int brandId, String name) {

        try (Connection conn = DriverManager.getConnection(connectionUrl);
             CallableStatement sta = conn.prepareCall(GET_BRAND_PROCEDURE)) {

            sta.setInt(1, brandId);
            sta.setString(2, name);

            sta.execute();

        }
        catch (SQLException ex) {
            System.out.println("Error while getting brand with name: " + name);
        }
    }


    private static void getAllBrands() throws SQLException {
        try (Connection conn = DriverManager.getConnection(connectionUrl);
             Statement sta = conn.createStatement()) {
            String Sql = "select * from brandnames";
            ResultSet rs = sta.executeQuery(Sql);
            while (rs.next()) {
                System.out.println(rs.getString("brandname"));
            }
        }
    }


}
