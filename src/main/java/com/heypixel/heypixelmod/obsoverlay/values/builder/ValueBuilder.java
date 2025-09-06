package com.heypixel.heypixelmod.obsoverlay.values.builder;

import com.heypixel.heypixelmod.obsoverlay.values.HasValue;
import com.heypixel.heypixelmod.obsoverlay.values.Value;

import java.util.function.Consumer;
import java.util.function.Supplier;

public abstract class ValueBuilder<T> {

    protected final HasValue hasValue;

    public ValueBuilder(HasValue hasValue) {
        this.hasValue = hasValue;
    }

    protected String name;
    protected T value;
    protected Consumer<Value> update;
    protected Supplier<Boolean> visible;
}
