package com.heypixel.heypixelmod.obsoverlay.values.builder.m;

import com.heypixel.heypixelmod.obsoverlay.values.builder.BuildStage;
import com.heypixel.heypixelmod.obsoverlay.values.impl.ModeValue;

public interface ModeStage extends BuildStage<ModeValue> {

    ModeStage sub(String mode);

    BuildStage<ModeValue> select(int index);

    BuildStage<ModeValue> select(String mode);
}
