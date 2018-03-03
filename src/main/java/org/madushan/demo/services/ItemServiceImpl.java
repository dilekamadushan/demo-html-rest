package org.madushan.demo.services;

import org.madushan.demo.domain.Item;
import org.madushan.demo.repositories.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private ItemRepository itemRepository;

    @Autowired
    public void setItemRepository(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
       Item item = new Item();
       item.setId(1);
       item.setDescription("description");
       item.setImageUrl("url");
       item.setVersion(1);
       item.setPrice(1.0);
       item.setItemId("1");
       itemRepository.save(item);
    }

    @Override
    public Iterable<Item> listAllItems() {
        logger.debug("listAllItems called");
        return itemRepository.findAll();
    }

    @Override
    public Item getItemById(Integer id) {
        logger.debug("getItemById called");
        return itemRepository.findOne(id);
    }

    @Override
    public Item saveItem(Item item) {
        logger.debug("saveItem called");
        return itemRepository.save(item);
    }

    @Override
    public void deleteItem(Integer id) {
        logger.debug("deleteItem called");
        itemRepository.delete(id);
    }
}
