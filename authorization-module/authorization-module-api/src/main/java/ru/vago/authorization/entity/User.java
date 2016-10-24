package ru.vago.authorization.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name = "USERS")
public class User implements Serializable
{
    @Id
    @GeneratedValue
    @Column(name = "USER_ID")
    private BigInteger id;

    @Column(name = "USER_LOGIN", length = 100, nullable = false)
    private String login;

    @Column(name = "USER_PASSWORD", length = 100, nullable = false)
    private String password;

    public BigInteger getId()
    {
        return id;
    }

    public String getLogin()
    {
        return login;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
