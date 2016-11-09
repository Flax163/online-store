package ru.vago.authorization.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "USERS", schema = "AUTHORIZATION_MODULE")
public class User implements Serializable
{
    @Id
    @GeneratedValue
    @Column(name = "ID_USER")
    private BigInteger id;

    @Column(name = "LOGIN_USER", length = 100, nullable = false)
    private String login;

    @Column(name = "PASSWORD_USER", length = 100, nullable = false)
    private String password;

    @Column(name = "TOKEN_USER", length = 100, nullable = false)
    private String token;

    @ManyToMany
    @JoinTable(name = "USER_GROUP",
    joinColumns = @JoinColumn(name = "ID_USER", referencedColumnName = "ID_USER"),
    inverseJoinColumns = @JoinColumn(name = "ID_GROUP", referencedColumnName = "ID_GROUP"))
    private List<Group> groups;

    @ManyToMany
    @JoinTable(name = "USER_ROLE",
            joinColumns = @JoinColumn(name = "ID_USER", referencedColumnName = "ID_USER"),
            inverseJoinColumns = @JoinColumn(name = "ID_ROLE", referencedColumnName = "ID_ROLE"))
    private List<Role> roles;

    public void setId(BigInteger id)
    {
        this.id = id;
    }

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

    public List<Group> getGroups()
    {
        return groups;
    }

    public void setGroups(List<Group> groups)
    {
        this.groups = groups;
    }

    public String getToken()
    {
        return token;
    }

    public void setToken(String token)
    {
        this.token = token;
    }

    public List<Role> getRoles()
    {
        return roles;
    }

    public void setRoles(List<Role> roles)
    {
        this.roles = roles;
    }
}
