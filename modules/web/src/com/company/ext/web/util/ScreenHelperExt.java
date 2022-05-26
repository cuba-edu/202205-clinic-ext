package com.company.ext.web.util;

import com.company.clinic.web.util.ScreenHelper;
import com.haulmont.cuba.gui.actions.picker.OpenAction;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.screen.OpenMode;

public class ScreenHelperExt extends ScreenHelper {

    @Override
    public void setupPickerField(PickerField<?> field) {
        super.setupPickerField(field);

        ((OpenAction) field.getActionNN(OpenAction.ID)).setOpenMode(OpenMode.DIALOG);
    }
}
