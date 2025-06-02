package org.acme.dto;

import org.acme.model.LocalLevel;

public class LocalLevelDTO {

    private Long id;
    private String localLevel;

    public LocalLevelDTO() {
    }
    public LocalLevelDTO(LocalLevel localLevel) {
        this.id = localLevel.getId();
        this.localLevel = localLevel.getLocalLevel();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocalLevel() {
        return localLevel;
    }

    public void setLocalLevel(String localLevel) {
        this.localLevel = localLevel;
    }
}
