package ru.vago.authorization.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name = "ROLES", schema = "AUTHORIZATION_MODULE")
public class Role implements Serializable
{
    @Id
    @GeneratedValue
    @Column(name = "ID_ROLE")
    private BigInteger id;

    @Column(name = "NAME_ROLE")
    private String name;

    public BigInteger getId()
    {
        return id;
    }

    public void setId(BigInteger id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
