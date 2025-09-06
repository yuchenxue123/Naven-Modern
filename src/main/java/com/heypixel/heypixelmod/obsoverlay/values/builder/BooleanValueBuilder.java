package com.heypixel.heypixelmod.obsoverlay.values.builder;


import com.heypixel.heypixelmod.obsoverlay.values.HasValue;
import com.heypixel.heypixelmod.obsoverlay.values.Value;
import com.heypixel.heypixelmod.obsoverlay.values.builder.b.BooleanBuilder;
import com.heypixel.heypixelmod.obsoverlay.values.builder.b.BooleanValueStage;
import com.heypixel.heypixelmod.obsoverlay.values.impl.BooleanValue;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class BooleanValueBuilder extends ValueBuilder<Boolean> implements BooleanBuilder, BooleanValueStage, BuildStage<BooleanValue> {

    public BooleanValueBuilder(HasValue hasValue) {
        super(hasValue);
    }

    @Override
    public BooleanValueStage name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public BuildStage<BooleanValue> value(boolean value) {
        this.value = value;
        return this;
    }

    @Override
    public BuildStage<BooleanValue> update(Consumer<Value> update) {
        this.update = update;
        return this;
    }

    @Override
    public BuildStage<BooleanValue> visible(Supplier<Boolean> visible) {
        this.visible = visible;
        return this;
    }

    @Override
    public BooleanValue build() {
        return new BooleanValue(hasValue, name, value, update, visible);
    }
}
