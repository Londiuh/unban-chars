package me.londiuh.unbanchars.mixin;

import net.minecraft.SharedConstants;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SharedConstants.class)
public class SharedConstantsMixin {
	@Inject(method = "isValidChar(C)Z", at = @At("RETURN"), cancellable = true)
	private static void injected(CallbackInfoReturnable<Boolean> cir) {
		// return true to make all chars valid
		cir.setReturnValue(true);
	}
}
