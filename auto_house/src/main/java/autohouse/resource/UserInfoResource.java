package autohouse.resource;

import autoHouseManager.BrandNamesManager;
import autoHouseManager.UserInfoManager;

import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
@Produces(MediaType.TEXT_PLAIN)
public class UserInfoResource {
    @GET
    @Path("/{username}/{personalId}/{userNumber}")
    public void getUsername(@PathParam("username") String username, @PathParam("personalId") float personalId, @PathParam("userNumber") float userNumber){
        UserInfoManager.getUser(username, personalId, userNumber);
    }

    @POST
    @Path("/{username}/{personalId}/{userNumber}/{userPassword}")
    public void postUsername(@PathParam("username") String username, @PathParam("personalId") float personalId, @PathParam("userNumber") float userNumber, @PathParam("userPassword") String userPassword){
        UserInfoManager.createUser(username, personalId, userNumber, userPassword);
    }

    @DELETE
    @Path("/{personalId}/{userNumber}/{userPassword}")
    public void deleteUsername(@PathParam("personalId") float personalId, @PathParam("userNumber") float userNumber, @PathParam("userPassword") String userPassword){
        UserInfoManager.deleteUser(personalId, userNumber, userPassword);
    }

    @PUT
    @Path("/{userId}/{username}/{personalId}/{userNumber}/{userPassword}")
    public void updateUsername(@PathParam("userId") int userId, @PathParam("username") String username, @PathParam("personalId") float personalId, @PathParam("userNumber") float userNumber, @PathParam("userPassword") String userPassword){
        UserInfoManager.updateUser(userId, username, personalId, userNumber, userPassword);
    }

}