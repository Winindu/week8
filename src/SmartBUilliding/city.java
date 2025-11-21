package SmartBUilliding;

import java.util.ArrayList;
import java.util.List;

public class city {
    private String name;
    private List<smartBuilding> buildings;

    public city(String name){
        this.name=name;
        this.buildings= new ArrayList<>();
    }

    public void addBuilding(smartBuilding building){
        buildings.add(building);
    }
     public List<smartBuilding> getBuildings() {
        return buildings;
     }
     public void setBuildings(List<smartBuilding> buildings) {
        this.buildings = buildings;
     }


}


