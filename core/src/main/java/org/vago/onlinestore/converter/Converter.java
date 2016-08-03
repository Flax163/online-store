package org.vago.onlinestore.converter;


public interface Converter<Result, Source>
{
    Result convert(Source source);
}
