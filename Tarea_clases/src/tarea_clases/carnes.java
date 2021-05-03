/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_clases;

/**
 *
 * @author Rolando
 */
public class carnes 
{
    public String procedencia;
    public int cantidad;
    public String tipo;
    public int precio;
    public carnes (String a, int b, String c, int d)
    {
        procedencia = a;
        cantidad = b;
        tipo = c;
        precio = d;
    }
    public void setProcedencia (String x)
    {
        procedencia = x;
    }
    public void setCantidad (int x)
    {
        cantidad = x;
    }
    public void setTipo (String x)
    {
        tipo = x;
    }
    public void setPrecio (int x)
    {
        precio = x;
    }
    @Override
    public String toString ()
    {
        return "Procedencia: "+procedencia+" Cantidad en inventario: "+cantidad+" Tipo de carne: "+tipo+" precio:LPS."+precio;
    }
}
