/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi;

/**
 *
 * @author MyBook Hype
 */

	
import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int jenis_kelamin, hasil;
        float berat, tinggi, bmi, meter;
        double broca;
 
        // main Menu
 
        // logic
      
        System.out.print("Masukan Berat Badan: ");
        berat = input.nextFloat();
        System.out.print("Masukan Tinggi Badan: ");
        tinggi = input.nextFloat();
        meter = tinggi / 100;
 
        // rumus BMI (Body Mass Index)
 
        bmi = (berat/(meter * meter));
 
        // cetak Berat Badan BMI
        System.out.print("BMI: " + bmi + " ");
 
        if (bmi < 18.5){
            System.out.println("Kurus");
        } else if (bmi <= 22.9){
            System.out.println("Normal");
        } else if (bmi < 24.9){
            System.out.println("Overweight");
        } else {
            System.out.println("Obesitas");
        }
 
        // perhitungan dengan rumus broca
      
}}