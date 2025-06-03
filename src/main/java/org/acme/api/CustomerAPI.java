package org.acme.api;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.dao.CustomerDao;
import org.acme.dto.CustomerDTO;
import org.acme.dto.dtoMapper.CustomerKycDTOMapper;
import org.acme.model.Customer;
import org.acme.service.CustomerService;

import java.util.List;

@Path("/customer")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerAPI {
    @Inject
    private CustomerDao customerDao;
    @Inject
    private CustomerService customerService;

    @POST
    @Path("/addCustomer")
    public Response addPersonalInfo(CustomerDTO customerDTO) {
        try{
            if (!customerService.createNewCustomer(customerDTO)){
                return Response.status(Response.Status.UNAUTHORIZED).entity("Create Failed").build();
            }
        }catch (Exception e){
            System.err.println(e);
        }
        return Response.ok("Create customer account successfully").build();
    }

    @POST
    @Path("/allCustomer")
    public Response getAllCustomer(){
        List<Customer> customerList = customerDao.findAll();
        List<CustomerDTO> customerDTOS = CustomerKycDTOMapper.getCustomerList(customerList);

        return Response.ok(customerDTOS).build();
    }
}
