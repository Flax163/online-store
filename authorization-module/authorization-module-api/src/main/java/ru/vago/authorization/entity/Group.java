package ru.vago.authorization.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name = "GROUPS")
public class Group implements Serializable
{
    @Id
    @GeneratedValue
    @Column(name = "ID_GROUP")
    private BigInteger id;

    @Column(name = "NAME_GROUP", length = 50)
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
