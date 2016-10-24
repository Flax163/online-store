package ru.vago.authorization.model;

public class AuthorizationData
{
    private final String login;
    private final String password;

    public AuthorizationData(final String login,
                             final String password)
    {
        this.login = login;
        this.password = password;
    }

    public String getPassword()
    {
        return password;
    }

    public String getLogin()
    {
        return login;
    }
}
