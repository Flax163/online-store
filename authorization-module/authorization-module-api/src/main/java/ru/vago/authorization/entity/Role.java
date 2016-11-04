package ru.vago.authorization.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

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

    @ManyToMany
    @JoinTable(name = "GROUP_ROLE",
            joinColumns = @JoinColumn(name = "ID_ROLE", referencedColumnName = "ID_ROLE"),
            inverseJoinColumns = @JoinColumn(name = "ID_GROUP", referencedColumnName = "ID_GROUP"))
    private List<Group> groups;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

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

    public List<Group> getGroups()
    {
        return groups;
    }

    public void setGroups(List<Group> groups)
    {
        this.groups = groups;
    }

    public List<User> getUsers()
    {
        return users;
    }

    public void setUsers(List<User> users)
    {
        this.users = users;
    }
}
