package com.heypixel.heypixelmod.obsoverlay.values.builder.s;

import com.heypixel.heypixelmod.obsoverlay.values.builder.BuildStage;
import com.heypixel.heypixelmod.obsoverlay.values.impl.StringValue;

public interface TextValueStage {

    BuildStage<StringValue> value(String value);

}
