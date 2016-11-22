package org.vago.onlinestore.config;

import com.google.common.collect.Sets;
import org.vago.onlinestore.endpoint.AuthorizationEndPointImpl;
import org.vago.onlinestore.endpoint.OfferServiceEndPointImpl;
import ru.vago.authorization.service.filter.AuthorizationRequestFilter;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

import static org.vago.onlinestore.ServerConstants.*;

@ApplicationPath(ONLINE_STORE_PATH_APPLICATION)
public class OnlineStoreApplication extends Application
{
    @Override
    public Set<Class<?>> getClasses()
    {
        return Sets.<Class<?>>newHashSet(
                OfferServiceEndPointImpl.class,
                AuthorizationEndPointImpl.class
        );
    }
}
