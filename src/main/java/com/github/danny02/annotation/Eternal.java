package com.github.danny02.annotation;

import org.junit.jupiter.api.Tag;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Tag("eternal")
@TimeLimit("eternal")
@Retention(RetentionPolicy.RUNTIME)
public @interface Eternal {
}
