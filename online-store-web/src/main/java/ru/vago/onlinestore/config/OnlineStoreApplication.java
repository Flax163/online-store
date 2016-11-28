package ru.vago.onlinestore.config;

import com.google.common.collect.Sets;
import ru.vago.authorization.filter.AuthorizationFilter;
import ru.vago.onlinestore.ServerConstants;
import ru.vago.onlinestore.endpoint.AuthorizationEndPointImpl;
import ru.vago.onlinestore.endpoint.OfferServiceEndPointImpl;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

@ApplicationPath(ServerConstants.ONLINE_STORE_PATH_APPLICATION)
public class OnlineStoreApplication extends Application
{
    @Override
    public Set<Class<?>> getClasses()
    {
        return Sets.newHashSet(
                OfferServiceEndPointImpl.class,
                AuthorizationEndPointImpl.class,
                AuthorizationFilter.class
        );
    }
}
