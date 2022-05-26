package com.company.ext.entity;

import com.company.clinic.entity.Visit;
import com.haulmont.cuba.core.entity.annotation.Extends;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity(name = "ext_VisitExt")
@Extends(Visit.class)
public class VisitExt extends Visit {
    private static final long serialVersionUID = 4067740273586457701L;

    @NotNull
    @Column(name = "URGENT", nullable = false)
    private Boolean urgent = false;

    public Boolean getUrgent() {
        return urgent;
    }

    public void setUrgent(Boolean urgent) {
        this.urgent = urgent;
    }
}