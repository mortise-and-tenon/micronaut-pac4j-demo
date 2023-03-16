package com.example;

import io.micronaut.context.annotation.Import;
import io.micronaut.runtime.Micronaut;

//@Import(packages = {"fun.mortnon.micronaut.pac4j.configuration"}, annotated = "*")
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}