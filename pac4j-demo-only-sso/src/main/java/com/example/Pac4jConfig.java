package com.example;

import fun.mortnon.pac4j.oauth.client.GiteeClient;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Singleton;
import org.pac4j.core.config.Config;

/**
 * @author dev2007
 * @date 2023/3/15
 */
@Factory
public class Pac4jConfig {
    @Singleton
    public Config config() {
        GiteeClient giteeClient = new GiteeClient("da28980047eb2c732b8bcee4be567c6a4f38c6459587063f2607084c9c33b957",
                "4cd81eac1dae28b698044ed5b55e2580da94aca7d872e11e5b47d6c8a3b0a26d");
        Config config = new Config("http://localhost:8080/callback", giteeClient);
        return config;
    }
}
