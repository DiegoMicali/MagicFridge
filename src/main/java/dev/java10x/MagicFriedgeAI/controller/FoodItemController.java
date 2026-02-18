package dev.java10x.MagicFriedgeAI.controller;

import dev.java10x.MagicFriedgeAI.model.FoodItem;
import dev.java10x.MagicFriedgeAI.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodItemController {

    @Autowired
    private FoodItemService service;

    //GET
    @GetMapping("/list")
    public ResponseEntity<List<FoodItem>> listAll() {
        List<FoodItem> FoodItens = service.listAll();
        return ResponseEntity.ok(FoodItens);
    }

    //POST
    @PostMapping("/savenew")
    public ResponseEntity<FoodItem> salvar(@RequestBody FoodItem foodItem) {
        FoodItem salvo = service.save(foodItem);
        return ResponseEntity.ok(salvo);
    }

    //UPDATE
    @PutMapping("/update/{id}")
    public ResponseEntity<FoodItem> update(@RequestBody FoodItem foodItem, @PathVariable Long id) {
        return service.serchById(id)
                .map(itemExist -> {
                    foodItem.setId(itemExist.getId());
                    FoodItem atualizado = service.update(foodItem);
                    return ResponseEntity.ok(atualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    //DELETE
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
