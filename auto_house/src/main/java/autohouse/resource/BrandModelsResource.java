package autohouse.resource;

import autoHouseManager.BrandModelsManager;

import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/model")
@Produces(MediaType.TEXT_PLAIN)
public class BrandModelsResource {

    @GET
    @Path("/{name}/{brandId}")
    public void getBrandName(@PathParam("name") String name, @PathParam("brandId") int brandId){
        BrandModelsManager.getModel(name, brandId);
    }

    @POST
    @Path("/{name}/{brandId}")
    public void postBrandName(@PathParam("name") String name, @PathParam("brandId") int brandId){
        BrandModelsManager.createModel(name, brandId);
    }

    @DELETE
    @Path("/{name}/{brandId}")
    public void deleteBrandName(@PathParam("name") String name, @PathParam("brandId") int brandId){
        BrandModelsManager.deleteModel(name, brandId);
    }

    @PUT
    @Path("/{modelId}/{name}/{brandId}")
    public void updateBrandName(@PathParam("modelId") int modelId, @PathParam("name") String name, @PathParam("brandId") int brandId){
        BrandModelsManager.updateModel(modelId, name, brandId);
    }

}
