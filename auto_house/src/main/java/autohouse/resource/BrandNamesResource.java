package autohouse.resource;

import autoHouseManager.BrandNamesManager;

import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/brand")
@Produces(MediaType.TEXT_PLAIN)
public class BrandNamesResource {
    @GET
    @Path("/{id}/{name}")
    public void getBrandName(@PathParam("id") int id, @PathParam("name") String name){
        BrandNamesManager.getBrand(id ,  name);
    }

    @POST
    @Path("/{name}")
    public void postBrandName(@PathParam("name") String name){
        BrandNamesManager.createBrand(name);
    }

    @DELETE
    @Path("/{name}")
    public void deleteBrandName(@PathParam("name") String name){
        BrandNamesManager.deleteBrand(name);
    }

    @PUT
    @Path("/{id}/{name}")
    public void updateBrandName(@PathParam("id") int id, @PathParam("name") String name){
        BrandNamesManager.updateBrand(id ,  name);
    }
}

