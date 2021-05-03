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
public class granos 
{
    public String nombre;
    public int cantidad;
    public String medida;
    public String procedencia;
    public granos (String a, int b, String c, String d)
    {
        nombre = a;
        cantidad = b;
        medida = c;
        procedencia = d;
    }
    public void setNombre (String x)
    {
        nombre = x;
    }
    public void setCantidad (int x)
    {
        cantidad = x;
    }
    public void setMedida (String x)
    {
        medida = x;
    }
    public void setProcedencia (String x)
    {
        procedencia = x;
    }
    @Override
    public String toString ()
    {
        return "nombre: "+nombre+" cantidad: "+cantidad+" madida: "+medida+" procedencia: "+procedencia;
    }
}
