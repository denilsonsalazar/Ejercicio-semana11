package edu.certus.pe.recurso;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/items")
public class ItemRecurso {
    List<Item> listItems = new ArrayList<Item>();

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Item> getItems() {
        Item item1 = new Item(1,"Diana");
        Item item2 = new Item(2, "Pablo");
        Item item3 = new Item(3, "Dio");

        listItems.add(item1);
        listItems.add(item2);
        listItems.add(item3);

        return  listItems;
    }

    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Item getItem(@PathParam("id") Integer id) {
        Item item1 = new Item(1,"Diana");
        Item item2 = new Item(2, "Pablo");
        Item item3 = new Item(3, "Dio");

        listItems.add(item1);
        listItems.add(item2);
        listItems.add(item3);



        Item itemSearch = null; // Variable para almacenar el elemento encontrado

        for (Item item : listItems) {
            if (item.getIdItem() == id) {
                itemSearch = item;
                break; // Si se encuentra el elemento, se termina el ciclo
            }
        }


       return  itemSearch;
    }
}
