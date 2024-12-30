package lecture_15;

import java.util.HashMap;
import java.util.Map;

public enum DragonSize {
    SMALL("Small dragon"),
    MEDIUM("Medium dragon"),
    LARGE("Large dragon");

    private final String description;

    private DragonSize (String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public static Map<DragonSize, String> mapEnumValues(){
        Map <DragonSize, String> map = new HashMap<>();
        for (DragonSize value : DragonSize.values()) {
            map.put(value, value.getDescription());
        }
        return map;
    }



}
