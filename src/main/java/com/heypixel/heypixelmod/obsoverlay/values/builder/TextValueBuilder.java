package com.heypixel.heypixelmod.obsoverlay.values.builder;

import com.heypixel.heypixelmod.obsoverlay.values.HasValue;
import com.heypixel.heypixelmod.obsoverlay.values.Value;
import com.heypixel.heypixelmod.obsoverlay.values.builder.s.TextBuilder;
import com.heypixel.heypixelmod.obsoverlay.values.builder.s.TextValueStage;
import com.heypixel.heypixelmod.obsoverlay.values.impl.StringValue;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class TextValueBuilder extends ValueBuilder<String> implements TextBuilder, TextValueStage, BuildStage<StringValue> {

    public TextValueBuilder(HasValue hasValue) {
        super(hasValue);
    }

    @Override
    public TextValueStage name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public BuildStage<StringValue> value(String value) {
        this.value = value;
        return this;
    }

    @Override
    public BuildStage<StringValue> update(Consumer<Value> update) {
        this.update = update;
        return this;
    }

    @Override
    public BuildStage<StringValue> visible(Supplier<Boolean> visible) {
        this.visible = visible;
        return this;
    }

    @Override
    public StringValue build() {
        return new StringValue(hasValue, name, value, update, visible);
    }
}
