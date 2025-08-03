package com.miugrau.atemporal;

import org.bukkit.plugin.java.JavaPlugin;

public class Atemporal extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Atemporal iniciado!");
        // TODO: Implementar a lógica do jogo aqui
    }

    @Override
    public void onDisable() {
        getLogger().info("Atemporal desligado!");
    }
}