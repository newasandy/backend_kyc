package org.acme.dto;

import org.acme.model.RelationType;

public class RelationTypeDTO {

    private Long id;
    private String relation;

    public RelationTypeDTO() {
    }

    public RelationTypeDTO(RelationType relationType) {
        this.id = relationType.getId();
        this.relation = relationType.getRelation();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }
}
