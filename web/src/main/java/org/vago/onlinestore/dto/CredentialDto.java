package org.vago.onlinestore.dto;

public class CredentialDto
{
    private final String login;
    private final String password;

    public CredentialDto(final String login,
                         final String password)
    {
        this.login = login;
        this.password = password;
    }

    public String getLogin()
    {
        return login;
    }

    public String getPassword()
    {
        return password;
    }
}
