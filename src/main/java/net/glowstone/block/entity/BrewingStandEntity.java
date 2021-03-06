package net.glowstone.block.entity;

import net.glowstone.block.GlowBlock;
import net.glowstone.block.GlowBlockState;
import net.glowstone.block.entity.state.GlowBrewingStand;
import net.glowstone.inventory.GlowBrewerInventory;
import net.glowstone.util.nbt.CompoundTag;

public class BrewingStandEntity extends ContainerEntity {

    private int brewTime;

    public BrewingStandEntity(GlowBlock block) {
        super(block, new GlowBrewerInventory(new GlowBrewingStand(block, 0)));
        setSaveId("minecraft:brewing_stand");
    }

    public int getBrewTime() {
        return brewTime;
    }

    public void setBrewTime(int brewTime) {
        this.brewTime = brewTime;
    }

    @Override
    public void loadNbt(CompoundTag tag) {
        super.loadNbt(tag);
        if (tag.isInt("BrewTime")) {
            brewTime = tag.getInt("BrewTime");
        }
    }

    @Override
    public void saveNbt(CompoundTag tag) {
        super.saveNbt(tag);
        tag.putInt("BrewTime", brewTime);
    }

    @Override
    public GlowBlockState getState() {
        return new GlowBrewingStand(block);
    }
}
