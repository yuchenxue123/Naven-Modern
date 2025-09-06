package com.heypixel.heypixelmod.obsoverlay.values.builder.f;

import com.heypixel.heypixelmod.obsoverlay.values.builder.BuildStage;
import com.heypixel.heypixelmod.obsoverlay.values.impl.FloatValue;

public interface StepStage {

    BuildStage<FloatValue> step(Float step);

}
