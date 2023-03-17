import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility(){
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> completed = this.storage.get(unit);
        completed.add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        ArrayList<String> list = new ArrayList<>();
        if(storage.containsKey(storageUnit)){
            list = storage.get(storageUnit);
        }
        return list;
    }

    public void remove(String storageUnit, String item){
        if (storage.containsKey(storageUnit)) {
            for (String itemUnit : storage.get(storageUnit)) {
                if (item.equals(itemUnit)) {
                    storage.get(storageUnit).remove(itemUnit);
                    break;
                }
            }
            if (storage.get(storageUnit).isEmpty()) {
                storage.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> names = new ArrayList<>();
        for(String unit : storage.keySet()){
            names.add(unit);
        }

        return names;
    }
}
