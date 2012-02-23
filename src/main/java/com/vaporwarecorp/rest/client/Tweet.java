package com.vaporwarecorp.rest.client;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

@XmlRootElement
public class Tweet
{
// ------------------------------ FIELDS ------------------------------

    private Date fechaDeCreacion;

    private String nombreDelUsuario;

    private String texto;

// --------------------------- CONSTRUCTORS ---------------------------

    public Tweet()
    {

    }

// --------------------- GETTER / SETTER METHODS ---------------------

    @XmlElement(name = "created_at")
    @XmlJavaTypeAdapter(DateAdapter.class)
    public Date getFechaDeCreacion()
    {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion( Date fechaDeCreacion )
    {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    @XmlElement(name = "from_user_name")
    public String getNombreDelUsuario()
    {
        return nombreDelUsuario;
    }

    public void setNombreDelUsuario( String nombreDelUsuario )
    {
        this.nombreDelUsuario = nombreDelUsuario;
    }

    @XmlElement(name = "text")
    public String getTexto()
    {
        return texto;
    }

    public void setTexto( String texto )
    {
        this.texto = texto;
    }
}
