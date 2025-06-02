package org.acme.dto;

import org.acme.model.CustomerKyc;

public class CustomerKycDTO {
    private Long id;
    private Long customerId;
    private boolean status;

    public CustomerKycDTO() {
    }

    public CustomerKycDTO(CustomerKyc customerKyc){
        this.id = customerKyc.getId();
        this.customerId= customerKyc.getCustomerId().getId();
        this.status = customerKyc.isStatus();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
