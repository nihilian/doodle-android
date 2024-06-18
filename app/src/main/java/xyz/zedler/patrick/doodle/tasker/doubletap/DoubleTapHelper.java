package xyz.zedler.patrick.doodle.tasker.doubletap;

import android.content.Context;

import androidx.annotation.NonNull;

import com.joaomgcd.taskerpluginlibrary.config.TaskerPluginConfig;
import com.joaomgcd.taskerpluginlibrary.config.TaskerPluginConfigHelperEventNoOutputOrInputOrUpdate;
import com.joaomgcd.taskerpluginlibrary.input.TaskerInput;

import kotlin.Unit;
import xyz.zedler.patrick.doodle.R;

public class DoubleTapHelper extends TaskerPluginConfigHelperEventNoOutputOrInputOrUpdate {
    private String description;
    public DoubleTapHelper(@NonNull TaskerPluginConfig<Unit> config, Context context) {
        super(config);
        description = context.getResources().getString(R.string.tasker_doubletap_description);
    }

    @Override
    public void addToStringBlurb(@NonNull TaskerInput<Unit> input, @NonNull StringBuilder blurbBuilder) {
        blurbBuilder.append(description);
    }
}
