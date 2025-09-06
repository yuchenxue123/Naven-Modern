package com.heypixel.heypixelmod.obsoverlay.values.builder;

import com.heypixel.heypixelmod.obsoverlay.values.HasValue;
import com.heypixel.heypixelmod.obsoverlay.values.Value;
import com.heypixel.heypixelmod.obsoverlay.values.builder.f.FloatBuilder;
import com.heypixel.heypixelmod.obsoverlay.values.builder.f.RangeStage;
import com.heypixel.heypixelmod.obsoverlay.values.builder.f.StepStage;
import com.heypixel.heypixelmod.obsoverlay.values.builder.f.FloatValueStage;
import com.heypixel.heypixelmod.obsoverlay.values.impl.FloatValue;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FloatValueBuilder extends ValueBuilder<Float>
        implements FloatBuilder,FloatValueStage, StepStage, RangeStage, BuildStage<FloatValue> {

    private Float step;
    private Float min;
    private Float max;

    public FloatValueBuilder(HasValue hasValue) {
        super(hasValue);
    }

    @Override
    public FloatValueStage name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public RangeStage value(Float value) {
        this.value = value;
        return this;
    }

    @Override
    public StepStage range(Float min, Float max) {

        if (min > max) {
            throw new IllegalArgumentException("FloatValue, min > max");
        }

        this.min = min;
        this.max = max;
        return this;
    }

    @Override
    public BuildStage<FloatValue> step(Float step) {
        this.step = step;
        return this;
    }


    @Override
    public BuildStage<FloatValue> update(Consumer<Value> update) {
        this.update = update;
        return null;
    }

    @Override
    public BuildStage<FloatValue> visible(Supplier<Boolean> visible) {
        this.visible = visible;
        return null;
    }

    @Override
    public FloatValue build() {
        return new FloatValue(hasValue, name, value, min, max, step, update, visible);
    }
}
