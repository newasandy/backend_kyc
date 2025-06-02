package org.acme.api;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.dao.CustomerDao;
import org.acme.dao.CustomerKycDao;
import org.acme.model.Customer;
import org.acme.model.CustomerKyc;

@Path("/customer")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerAPI {
    @Inject
    private CustomerDao customerDao;

    @Inject
    private CustomerKycDao customerKycDao;

    @POST
    @Path("/addPersonalInfo")
    public Response addPersonalInfo(Customer customer) {
        if (customerDao.save(customer)) {
            CustomerKyc customerKyc = new CustomerKyc();
            customerKyc.setCustomerId(customer);
            customerKyc.setStatus(false);
            if (customerKycDao.save(customerKyc)) {
                return Response.status(Response.Status.CREATED).entity(customer).build();
            }
            else{
                return Response.status(Response.Status.NOT_FOUND)
                        .entity("Kyc was not added")
                        .build();
            }
        } else {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Customer was not added")
                    .build();
        }
    }
}
