package dev.java10x.MagicFriedgeAI.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ChatGptService {

    private final WebClient webClient;

    @Autowired
    private String apiKey = System.getenv("OPENAI_APIKEY");



    public Mono<String> generateRecipe() {
        String prompt = "Você é uma mestre cozinheiro e sua função principal função é me recomendar receiras com os" +
                "ingredientes a seguir.";
        return
    }

}

