package gg.nodus.gaslight.mixin;

import net.minecraft.client.report.ChatLogImpl;
import net.minecraft.client.report.ReceivedMessage;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ChatLogImpl.class)
public interface AccessorChatLogImplMixin {

    @Accessor("messages")
    ReceivedMessage[] getMessages();

}
