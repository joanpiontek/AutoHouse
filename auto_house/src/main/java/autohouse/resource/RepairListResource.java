package autohouse.resource;

import autoHouseManager.RepairListManager;
import autoHouseManager.UserCarsManager;

import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user/car/repair")
@Produces(MediaType.TEXT_PLAIN)
public class RepairListResource {
    @GET
    @Path("/{repairPrize}/{carRegId}")
    public void getCarRepair(@PathParam("repairId") int repairId, @PathParam("repairPrize") int repairPrize, @PathParam("carRegId") float carRegId){
        RepairListManager.getCarRepair(repairPrize, carRegId);
    }

    @POST
    @Path("/{repairPrize}/{carRegId}")
    public void createCarRepair(@PathParam("repairPrize") int repairPrize, @PathParam("carRegId") float carRegId){
        RepairListManager.createCarRepair(repairPrize, carRegId);
    }

    @PUT
    @Path("/{repairId}/{repairPrize}/{carRegId}")
    public void updateCarRepair(@PathParam("repairId") int repairId, @PathParam("repairPrize") int repairPrize, @PathParam("carRegId") float carRegId){
        RepairListManager.updateCarRepair(repairId, repairPrize, carRegId);
    }
}
