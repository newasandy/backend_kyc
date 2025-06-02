package org.acme.api;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.dao.AddressDetailsDao;
import org.acme.model.AddressDetails;

import java.util.List;

@Path("/address")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AddressAPI {

    @Inject
    private AddressDetailsDao addressDetailsDao;

    @POST
    @Path("/addCustomerAddress")
    public Response addCustomerAddress(List<AddressDetails> addressDetails){
        for (AddressDetails address: addressDetails){
//            System.out.println(address.getAddressType());
//            System.out.println("=====================");
            if (!addressDetailsDao.save(address)){
                return Response.status(Response.Status.UNAUTHORIZED).entity("Address not add").build();
            }
        }
        return Response.status(Response.Status.CREATED).entity("Customer address added").build();
    }
}
