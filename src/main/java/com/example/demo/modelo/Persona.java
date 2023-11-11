package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="personas")

public class Persona {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private int id;
 private String nombre;
 private int precio;
 private int cantidad;
 private int Ventas;

  public Persona() {
	  
  }

public Persona(int id, String nombre, int precio, int cantidad, int ventas) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.precio = precio;
	this.cantidad = cantidad;
	this.Ventas = ventas;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getPrecio() {
	return precio;
}

public void setPrecio(int precio) {
	this.precio = precio;
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

public int getVentas() {
	return Ventas;
}

public void setVentas(int ventas) {
	this.Ventas = ventas;
}


}
