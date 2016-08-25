package com.voxelwind.plugin.example;

import com.voxelwind.api.plugin.Plugin;
import com.voxelwind.api.server.Player;
import com.voxelwind.api.server.event.Listener;
import com.voxelwind.api.server.event.server.ServerStartEvent;
import com.voxelwind.api.server.event.player.PlayerSpawnEvent;

@Plugin(id = "example-plugin", author = "tuxed", version = "0.1")
public class ExamplePlugin {
    @Listener
    public void onServerStart(ServerStartEvent event) {
        System.out.println("Hello world!");
    }

    @Listener
    public void onPlayerSpawn(PlayerSpawnEvent event) {
        Player player = event.getPlayer();
        System.out.println(player.getName() + " has spawned in level " + player.getLevel().getName() +
                " in gamemode " + player.getGameMode().name().toLowerCase());
    }
}
