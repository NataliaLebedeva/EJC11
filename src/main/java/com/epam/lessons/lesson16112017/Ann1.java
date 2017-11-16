package com.epam.lessons.lesson16112017;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Nata on 16.11.2017.
 */
@Retention( RetentionPolicy.RUNTIME)
public @interface Ann1 {
    int x () default 1;
}
