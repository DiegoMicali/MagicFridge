package dev.java10x.MagicFriedgeAI.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

public class WebClientConfig {

    @Value("${https://api.openai.com/v1/chat/completions}")
    private String chatGptApiUrl;

    @Bean
    public WebClient webClient (WebClient.Builder builder) {
        return builder.baseUrl(chatGptApiUrl).build();
    }
}
