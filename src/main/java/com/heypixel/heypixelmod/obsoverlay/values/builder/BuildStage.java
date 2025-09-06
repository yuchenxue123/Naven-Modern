package com.heypixel.heypixelmod.obsoverlay.values.builder;

import com.heypixel.heypixelmod.obsoverlay.values.Value;

import java.util.function.Consumer;
import java.util.function.Supplier;

public interface BuildStage<V extends Value> {

    BuildStage<V> update(Consumer<Value> update);

    BuildStage<V> visible(Supplier<Boolean> visible);

    V build();

}
