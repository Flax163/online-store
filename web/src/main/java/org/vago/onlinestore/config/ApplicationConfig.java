package org.vago.onlinestore.config;

import org.vago.onlinestore.endpoint.OfferServiceEndPointRestJson;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class ApplicationConfig extends Application
{
    public Set<Class<?>> getClasses()
    {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(OfferServiceEndPointRestJson.class);
        return resources;
    }
}
