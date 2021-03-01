package com.gg.spring5jokesappv2.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChuckConfiguration {

    //Method name doesn't matter, notice the double s
    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotess(){
        return new ChuckNorrisQuotes();
    }
}
