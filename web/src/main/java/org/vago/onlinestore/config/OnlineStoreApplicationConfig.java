package org.vago.onlinestore.config;

import com.google.common.collect.Sets;
import org.vago.onlinestore.endpoint.OfferServiceEndPointImpl;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

import static org.vago.onlinestore.Constant.*;

@ApplicationPath(ONLINE_STORE_PATH_APPLICATION)
public class OnlineStoreApplicationConfig extends Application
{
    @Override
    public Set<Class<?>> getClasses()
    {
        return Sets.<Class<?>>newHashSet(OfferServiceEndPointImpl.class);
    }
}
