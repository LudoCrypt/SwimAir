package net.ludocrypt.swimair.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.entity.Entity;
import net.minecraft.fluid.Fluid;
import net.minecraft.tag.Tag;

@Mixin(Entity.class)
public class EntityMixin {

	@Inject(at = @At("TAIL"), method = "isTouchingWater", cancellable = true)
	private void isTouchingWater(CallbackInfoReturnable<Boolean> ci) {
		ci.setReturnValue(true);
	}

	@Inject(at = @At("TAIL"), method = "isSubmergedIn", cancellable = true)
	private void isSubmergedIn(Tag<Fluid> tag, CallbackInfoReturnable<Boolean> ci) {
		ci.setReturnValue(true);
	}

}
