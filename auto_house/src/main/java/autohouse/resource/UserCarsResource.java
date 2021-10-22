package autohouse.resource;

import autoHouseManager.BrandNamesManager;
import autoHouseManager.UserCarsManager;

import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user/car")
@Produces(MediaType.TEXT_PLAIN)
public class UserCarsResource {
    @GET
    @Path("/{regNumber}/{ownerId}")
    public void getUserCar(@PathParam("regNumber") String regNumber, @PathParam("ownerId") int ownerId){
        UserCarsManager.getUserCar(regNumber, ownerId);
    }

    @POST
    @Path("/{regNumber}/{ownerId}")
    public void createUserCar(@PathParam("regNumber") String regNumber, @PathParam("ownerId") int ownerId){
        UserCarsManager.createUserCar(regNumber, ownerId);
    }

    @DELETE
    @Path("/{regNumber}/{ownerId}")
    public void deleteUserCar(@PathParam("regNumber") String regNumber, @PathParam("ownerId") int ownerId){
        UserCarsManager.deleteUserCar(regNumber, ownerId);
    }

    @PUT
    @Path("/{carId}/{regNumber}/{ownerId}")
    public void updateUserCar(@PathParam("carId") int carId, @PathParam("regNumber") String regNumber, @PathParam("ownerId") int ownerId){
        UserCarsManager.updateUserCar(carId, regNumber, ownerId);
    }
}