/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Chip;
import model.Deck;

/**
 *
 * @author julli
 */
public class controlChip {

    private Deck deck = new Deck();
    
    public controlChip() {
    }

    public void generateChip() {
        deck.drawChip();
    }
}