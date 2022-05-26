package com.company.ext.core.service;

import com.company.clinic.entity.Visit;
import com.company.clinic.service.VisitServiceBean;
import com.company.ext.entity.VisitExt;
import org.apache.commons.lang3.BooleanUtils;

import java.math.BigDecimal;

public class ExtVisitServiceBean extends VisitServiceBean {

    @Override
    public BigDecimal calculateAmount(Visit visit) {
        BigDecimal amount = super.calculateAmount(visit);
        if (BooleanUtils.isTrue(((VisitExt) visit).getUrgent())) {
            amount = amount.add(BigDecimal.valueOf(50));
        }

        return amount;
    }
}
