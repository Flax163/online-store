package org.vago.onlinestore.config;

import org.vago.onlinestore.endpoint.OfferServiceEndPointImpl;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class OnlineStoreApplicationConfig extends Application
{
    public Set<Class<?>> getClasses()
    {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(OfferServiceEndPointImpl.class);
        return resources;
    }
}
