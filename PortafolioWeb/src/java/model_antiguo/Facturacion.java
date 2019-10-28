package model_antiguo;

import java.sql.Date;
import java.util.ArrayList;
/*

Los clientes son empresas de diferentes rubros,
 las cuales contratan el servicio pagando una mensualidad,
todos estos planes de pago se controlan, 
mediante planillas que indican toda la informaciÃ³n de los pagos de los clientes,
 reflejando las morosidades que se puedan producir.
 A los clientes que se atrasan en los pagos, de inmediato se les suspende el servicio.

*/

public class Facturacion {
	private int id;
	private double monto;
	private double montoTotal;
	private Date fechaFacturacion;
	private Date fechaVencimiento;
	private Date fechaPago;
	private ArrayList<CobroExtra> cobroExtras;

    public Facturacion(int id, double monto, double montoTotal, Date fechaFacturacion, Date fechaVencimiento, Date fechaPago, ArrayList<CobroExtra> cobroExtras) {
        this.id = id;
        this.monto = monto;
        this.montoTotal = montoTotal;
        this.fechaFacturacion = fechaFacturacion;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaPago = fechaPago;
        this.cobroExtras = cobroExtras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Date getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(Date fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public ArrayList<CobroExtra> getCobroExtras() {
        return cobroExtras;
    }

    public void setCobroExtras(ArrayList<CobroExtra> cobroExtras) {
        this.cobroExtras = cobroExtras;
    }
        
}