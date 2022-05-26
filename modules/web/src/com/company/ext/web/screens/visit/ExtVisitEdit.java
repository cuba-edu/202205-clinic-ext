package com.company.ext.web.screens.visit;

import com.company.clinic.entity.Visit;
import com.company.clinic.service.VisitService;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.Target;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.company.clinic.web.screens.visit.VisitEdit;

import javax.inject.Inject;

@UiController("clinic_Visit.edit")
@UiDescriptor("ext-visit-edit.xml")
public class ExtVisitEdit extends VisitEdit {

    @Subscribe(id = "visitDc", target = Target.DATA_CONTAINER)
    public void onVisitDcItemPropertyChange1(InstanceContainer.ItemPropertyChangeEvent<Visit> event) {
        if ("urgent".equals(event.getProperty())) {
            refreshAmount();
        }
    }
}