package xyz.zedler.patrick.doodle.tasker.doubletap;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.joaomgcd.taskerpluginlibrary.config.TaskerPluginConfigNoInput;
import com.joaomgcd.taskerpluginlibrary.input.TaskerInput;
import com.joaomgcd.taskerpluginlibrary.input.TaskerInputInfos;

import kotlin.Unit;

public class DoubleTapConfigActivity extends AppCompatActivity implements TaskerPluginConfigNoInput {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new DoubleTapHelper(this, getContext()).finishForTasker();
    }

    @NonNull
    @Override
    public Context getContext() {
        return getApplicationContext();
    }

    @NonNull
    @Override
    public TaskerInput<Unit> getInputForTasker() {
        return new TaskerInput(Unit.INSTANCE, new TaskerInputInfos());
    }

    @Override
    public void assignFromInput(@NonNull TaskerInput<Unit> taskerInput) {}
}