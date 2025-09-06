package com.heypixel.heypixelmod.obsoverlay.values.builder;

import com.heypixel.heypixelmod.obsoverlay.values.HasValue;
import com.heypixel.heypixelmod.obsoverlay.values.Value;
import com.heypixel.heypixelmod.obsoverlay.values.builder.m.ModeBuilder;
import com.heypixel.heypixelmod.obsoverlay.values.builder.m.ModeStage;
import com.heypixel.heypixelmod.obsoverlay.values.impl.ModeValue;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ModeValueBuilder extends ValueBuilder<String> implements ModeBuilder, ModeStage {

    private final List<String> modes = new ArrayList<>();

    public ModeValueBuilder(HasValue hasValue) {
        super(hasValue);
    }

    @Override
    public ModeStage name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public ModeStage sub(String mode) {
        modes.add(mode);
        return this;
    }

    @Override
    public BuildStage<ModeValue> select(int index) {
        this.value = modes.get(index);
        return this;
    }

    @Override
    public BuildStage<ModeValue> select(String mode) {
        this.select(modes.indexOf(mode));
        return this;
    }

    @Override
    public BuildStage<ModeValue> update(Consumer<Value> update) {
        this.update = update;
        return this;
    }

    @Override
    public BuildStage<ModeValue> visible(Supplier<Boolean> visible) {
        this.visible = visible;
        return this;
    }

    @Override
    public ModeValue build() {
        return new ModeValue(hasValue, name,
                modes.toArray(new String[0]),
                modes.indexOf(value),
                update, visible
        );
    }
}
