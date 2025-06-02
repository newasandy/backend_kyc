package org.acme.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "relation_type")
public class RelationType extends BaseEntity {

    @Column(name = "relation", nullable = false, length = 100)
    private String relation;

    @OneToMany(mappedBy = "relationTypeId", cascade = CascadeType.ALL)
    private List<FamilyDetails> familyDetails;

    public RelationType() {
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public List<FamilyDetails> getFamilyDetails() {
        return familyDetails;
    }

    public void setFamilyDetails(List<FamilyDetails> familyDetails) {
        this.familyDetails = familyDetails;
    }
}
