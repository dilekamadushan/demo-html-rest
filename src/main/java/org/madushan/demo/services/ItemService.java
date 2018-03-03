package org.madushan.demo.services;


import org.madushan.demo.domain.Item;

public interface ItemService {
    Iterable<Item> listAllItems();

    Item getItemById(Integer id);

    Item saveItem(Item item);

    void deleteItem(Integer id);
}
