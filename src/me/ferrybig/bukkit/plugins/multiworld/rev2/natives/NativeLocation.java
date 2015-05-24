/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.ferrybig.bukkit.plugins.multiworld.rev2.natives;

/**
 *
 * @author Fernando
 */
public interface NativeLocation {

    public NativeWorld getWorld();
    
    public double getX();
    
    public double getY();
    
    public double getZ();
    
    public double distance(NativeLocation loc);
    
}