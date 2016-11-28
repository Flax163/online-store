package ru.vago.onlinestore.converter;

@FunctionalInterface
public interface Converter<Result, Source>
{
    Result convert(Source source);
}
