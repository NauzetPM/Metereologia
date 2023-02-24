/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metereolgia;

/**
 *
 * @author Nauzet Pestano Martin
 */
public interface Medible {
    void addMedicion(int dia,double dato);
    double getMedia(int dia) throws Exception;
    double getMax(int dia) throws Exception;
    double getMin(int dia) throws Exception;
}
