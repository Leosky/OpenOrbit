package net.openorbit.model.entities.armies;

import java.util.ArrayList;
import java.util.List;

public class Army {
    public List<Section> sections;
    public String armyName;
    public Army() {
        sections = new ArrayList<Section>();
    }
}
