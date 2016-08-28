package com.voxelwind.plugin.example;

import com.voxelwind.api.plugin.Plugin;
import com.voxelwind.api.plugin.PluginDescription;
import com.voxelwind.api.server.event.Listener;
import com.voxelwind.api.server.event.server.ServerStartEvent;
import org.slf4j.Logger;

import javax.inject.Inject;

@Plugin(id = "example-plugin", author = "tuxed", version = "0.1")
public class ExamplePlugin {
    private final Logger logger;
    private final PluginDescription description;

    @Inject
    public ExamplePlugin(Logger logger, PluginDescription description) {
        this.logger = logger;
        this.description = description;
    }

    @Listener
    public void onServerStart(ServerStartEvent event) {
        logger.info("Hello world from " + description.getId());
    }
}
