import com.sun.org.glassfish.gmbal.Description;
import models.PizzaMenu;
import models.PizzzaMenuItem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("zzz");

        int num = 10;
        int num2 = 5;

        if (num2 == num) {
            System.out.println("num == num2");
        } else if (num< num2) {
            System.out.println("num < num2");
        }
        boolean b1 = false;


        PizzzaMenuItem item1 = new PizzzaMenuItem(150, "Hawai", "desc1");
        PizzzaMenuItem item2 = new PizzzaMenuItem(150, "Hawai", "desc1");

        PizzzaMenuItem item3 = item1;

        item3.setPrice(200);

        System.out.println(item1);

        List<PizzzaMenuItem> pizzaItems = new ArrayList<>();
        pizzaItems.add(item1);
        pizzaItems.add(item2);
        pizzaItems.add(new PizzzaMenuItem(250, "Pole", "desc3"));

        for (PizzzaMenuItem item:
             pizzaItems) {
            System.out.println(item1);
        }

        PizzzaMenuItem itemFromList = pizzaItems.get(2);
        System.out.println(itemFromList);

        System.out.println("_________________");

        PizzaMenu menu1 = new PizzaMenu();
        menu1.addItem(new PizzzaMenuItem(150,"Hawai", "desc"));
        menu1.addItem(new PizzzaMenuItem(150,"Hawai2", "desc"));
        menu1.addItem(new PizzzaMenuItem(150,"Hawai3", "desc"));

        PizzaMenu menu2 = new PizzaMenu();
        menu1.addItem(new PizzzaMenuItem(150,"Hawai", "desc"));
        menu1.addItem(new PizzzaMenuItem(150,"Hawai2", "desc"));
        menu1.addItem(new PizzzaMenuItem(150,"Hawai3", "desc"));

        System.out.println(menu1.getLastUpdate());
        System.out.println("menu Size:", "");
    }
}