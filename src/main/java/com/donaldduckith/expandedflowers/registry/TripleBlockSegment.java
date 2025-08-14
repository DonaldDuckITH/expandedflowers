package com.donaldduckith.expandedflowers.registry;

import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;

public enum TripleBlockSegment implements StringRepresentable {
    UPPER("upper"),
    MIDDLE("middle"),
    LOWER("lower");

    private final String name;

    private TripleBlockSegment(String name) {
        this.name = name;
    }

    @Override
    public String getSerializedName(){
        return name;
    }
}
