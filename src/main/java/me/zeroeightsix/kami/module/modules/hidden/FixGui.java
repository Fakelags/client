package me.zeroeightsix.kami.module.modules.hidden;

import me.zeroeightsix.kami.module.Module;

import static me.zeroeightsix.kami.util.GuiFrameUtil.fixFrames;

/**
 * @author S-B99
 * @see me.zeroeightsix.kami.command.commands.FixGuiCommand
 */
@Module.Info(name = "FixGui", category = Module.Category.RENDER, showOnArray = Module.ShowOnArray.OFF, description = "Moves GUI elements back on screen")
public class FixGui extends Module {
    public void onUpdate() {
        if (mc.player == null) return;
        fixFrames(mc);
        disable();
    }
}
