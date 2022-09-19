package models;

import java.time.LocalDateTime;
import java.util.List;

public class PizzaMenu {
    private List<PizzzaMenuItem> menuItems;
    private LocalDateTime lastUpdate;

    public PizzaMenu(List<PizzzaMenuItem> menuItems, LocalDateTime lastUpdate) {
        this.menuItems = menuItems;
        this.lastUpdate = lastUpdate;
    }

    public void addItem(PizzzaMenuItem itemToAdd){
        menuItems.add(itemToAdd);
        lastUpdate = LocalDateTime.now();
    }

    public void removeItem(PizzzaMenuItem itemToRemove){
        menuItems.remove(itemToRemove);
    }

    public void removeItem(String name){
        PizzzaMenuItem toDelete = null;
        for(PizzzaMenuItem item:
        menuItems) {
            if (item.getName().equals(name)) {
                toDelete = item;
                break;
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        return ((PizzaMenu));
    }
}
