package com.voxelwind.plugin.example;

import com.voxelwind.api.plugin.Plugin;
import com.voxelwind.api.server.event.Listener;
import com.voxelwind.api.server.event.server.ServerStartEvent;

@Plugin(id = "example-plugin", author = "tuxed", version = "0.1")
public class ExamplePlugin {
    @Listener
    public void onServerStart(ServerStartEvent event) {
        System.out.println("Hello world!");
    }
}
