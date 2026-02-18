package dev.java10x.MagicFriedgeAI.controller;

import dev.java10x.MagicFriedgeAI.service.ChatGptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class RecipeController {

    @Autowired
    private ChatGptService chatGptService;

    @GetMapping
    public Mono<ResponseEntity<String>> generatRecipe() {
        return chatGptService.generateRecipe();
    }
}
