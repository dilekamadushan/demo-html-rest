/*
package org.madushan.demo.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.madushan.demo.domain.Item;
import org.madushan.demo.services.ItemService;
import org.madushan.demo.services.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
@Api(value="onlinestore", description="Operations pertaining to items in Online Store")
public class ItemController {

    private ItemServiceImpl itemService;

    @Autowired
    public void setItemService(ItemServiceImpl itemService) {
        this.itemService = itemService;
    }

    @ApiOperation(value = "View a list of available items",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @RequestMapping(value = "/list", method= RequestMethod.GET, produces = "application/json")
    public Iterable<Item> list(Model model){
        Iterable<Item> itemList = itemService.listAllItems();
        return itemList;
    }
    @ApiOperation(value = "Search a item with an ID",response = Item.class)
    @RequestMapping(value = "/show/{id}", method= RequestMethod.GET, produces = "application/json")
    public Item showItem(@PathVariable Integer id, Model model){
       Item item = itemService.getItemById(id);
        return item;
    }

    @ApiOperation(value = "Add a item")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity saveItem(@RequestBody Item item){
        itemService.saveItem(item);
        return new ResponseEntity("Item saved successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Update a item")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity updateItem(@PathVariable Integer id, @RequestBody Item item){
        Item storedItem = itemService.getItemById(id);
        storedItem.setDescription(item.getDescription());
        storedItem.setImageUrl(item.getImageUrl());
        storedItem.setPrice(item.getPrice());
        itemService.saveItem(storedItem);
        return new ResponseEntity("Item updated successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Delete a item")
    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity delete(@PathVariable Integer id){
        itemService.deleteItem(id);
        return new ResponseEntity("Item deleted successfully", HttpStatus.OK);

    }

}
*/
