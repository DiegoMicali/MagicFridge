package dev.java10x.MagicFriedgeAI.controller;

import dev.java10x.MagicFriedgeAI.model.FoodItem;
import dev.java10x.MagicFriedgeAI.service.ChatGptService;
import dev.java10x.MagicFriedgeAI.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class RecipeController {

    @Autowired
    private FoodItemService service;

    @Autowired
    private ChatGptService chatGptService;

    @GetMapping("/teste")
    public String ola() {
        return "Olá! O endPoint funciona!";
    }

    @GetMapping("/generate")
    public Mono<ResponseEntity<String>> generatRecipe() {
        List<FoodItem> foodItens = service.listAll();
        return chatGptService.generateRecipe(foodItens)
                .map(recipe -> ResponseEntity.ok(recipe))
                .defaultIfEmpty(ResponseEntity.noContent().build());
    }
}
