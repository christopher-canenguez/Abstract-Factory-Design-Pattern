/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_abstractfactorydesignpattern;

/**
 *
 * @author MoaathAlrajab
 */
public class PublicationPaper implements WrittenPiece{

    @Override
    public void typeOfPiece() {
        System.out.println("This is a publication article");
    } // End typeOfPiece.
    
} // End PublicationPaper.
