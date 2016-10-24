package ru.vago.authorization.model;

public class Token
{
    private final String value;

    public Token(final String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }
}
