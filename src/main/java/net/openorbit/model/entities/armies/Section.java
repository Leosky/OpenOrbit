package net.openorbit.model.entities.armies;

import net.openorbit.model.entities.armies.units.UnitModel;

public class Section {

    public UnitModel baseModel;

    public Section(UnitModel _baseModel) {
        assert baseModel != null : "[Section::Section] : Unit model can't be null";
        baseModel = _baseModel;
    }
}
