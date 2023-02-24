/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metereolgia;

import metereolgia.Medible;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Equipo 1
 */
public class Metereologia implements Medible {

    HashMap<Integer, ArrayList<Double>> Dia_Temperatura = new HashMap<>();

    /**
     * Constructor por defecto
     */
    public Metereologia() {
    }

    /**
     * Metodo para añadir una temperatura a un dira especifico
     *
     * @param dia Int
     * @param dato Double
     */
    @Override
    public void addMedicion(int dia, double dato) {
        ArrayList<Double> arr = null;
        if (Dia_Temperatura.containsKey(dia)) {
            arr = Dia_Temperatura.get(dia);
            arr.add(dato);
        } else {
            arr = new ArrayList<Double>();
            arr.add(dato);
            Dia_Temperatura.put(dia, arr);
        }
    }
    /**
     * Metodo para obtener la media de las temperaturas de un dia
     * @param dia   int
     * @return  double media
     * @throws Exception 
     */
    @Override
    public double getMedia(int dia) throws Exception {
        ArrayList<Double> arr = null;
        double media = 0;
        if (Dia_Temperatura.containsKey(dia)) {
            arr = Dia_Temperatura.get(dia);
            int contador = 0;
            for (Double dato : arr) {
                contador++;
                media += dato;
            }
            media /= contador;
        } else {
            throw new Exception("No hay datos de este dia");
        }
        return media;
    }
    /**
     * Metodo para obtener el maximo de las temperaturas de un dia
     * @param dia   int
     * @return  double media
     * @throws Exception 
     */
    @Override
    public double getMax(int dia) throws Exception {
        ArrayList<Double> arr = null;
        double max = 0;
        if (Dia_Temperatura.containsKey(dia)) {
            arr = Dia_Temperatura.get(dia);
            max = arr.get(0);
            for (Double dato : arr) {
                if (dato > max) {
                    max = dato;
                }
            }
        } else {
            throw new Exception("No hay datos de este dia");
        }
        return max;
    }
     /**
     * Metodo para obtener el minimo de las temperaturas de un dia
     * @param dia   int
     * @return  double media
     * @throws Exception 
     */
    @Override
    public double getMin(int dia) throws Exception {
        ArrayList<Double> arr = null;
        double min = 0;
        if (Dia_Temperatura.containsKey(dia)) {
            arr = Dia_Temperatura.get(dia);
            min = arr.get(0);
            for (Double dato : arr) {
                if (dato > min) {
                    min = dato;
                }
            }
        } else {
            throw new Exception("No hay datos de este dia");
        }
        return min;
    }

}
