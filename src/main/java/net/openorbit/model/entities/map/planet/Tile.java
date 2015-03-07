package net.openorbit.model.entities.map.planet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kheless
 * @date 06-02-15
 */
public class Tile {
    //fields
    public List<TileDecoration> decorationsList = new ArrayList<>();
    public TileType type;
    private byte movementCost = 0; //this variable is used to avoid multiple computation as this almost never change.
    public Map<RawRessource, Double> rawRessources = new HashMap<>();

    public boolean hasDecoration(TileDecoration _tileDecoration){
        return decorationsList.contains(_tileDecoration);
    }

    //Movement cost logic

    /**
     * This method return the movement cost of this tile considering only it's decorations.
     * @return (byte) Movement cost to access this tile.
     */
    public  byte getMovementCost(){
        if(movementCost == 0) {
            for(TileDecoration decoration : decorationsList){
                movementCost += decoration.movementModifier;
            }
        }

        return movementCost;
    }

    /**
     * This method recalculate following statics attributes :
     * <ul>
     *     <li>Movement cost</li>
     * </ul>
     * It should be called every time one of theses change.
     */
    public void recalc(){
        movementCost = 0;

        for(TileDecoration decoration : decorationsList){
            movementCost += decoration.movementModifier;
        }
    }
}
