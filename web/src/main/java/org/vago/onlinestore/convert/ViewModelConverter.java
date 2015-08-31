package org.vago.onlinestore.convert;


public interface ViewModelConverter<Result, Source>
{
    Result convert(Source source);
}
