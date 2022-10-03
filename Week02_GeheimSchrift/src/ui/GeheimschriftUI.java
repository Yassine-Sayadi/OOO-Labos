package ui;

import domain.CeasarSchrift;
import domain.GeheimSchrift;
import domain.Spiegeling;

import javax.swing.*;

public class GeheimschriftUI {
    public static void main(String[] args) {
        GeheimSchrift geheimSchrift = new GeheimSchrift();
        geheimSchrift.setEncoder(new CeasarSchrift(12));
        System.out.println(geheimSchrift.getEncoder().encode("cockandballtorture"));
        System.out.println(geheimSchrift.getEncoder().decode(geheimSchrift.getEncoder().encode("cockandballtorture")));
    }
}
