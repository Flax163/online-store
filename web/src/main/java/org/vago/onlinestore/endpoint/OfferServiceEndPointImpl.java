package org.vago.onlinestore.endpoint;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import org.vago.onlinestore.convert.OfferViewModelConverter;
import org.vago.onlinestore.dto.OfferVO;
import org.vago.onlinestore.model.Offer;
import org.vago.onlinestore.service.LoadingOfferService;

import javax.inject.Inject;
import java.math.BigInteger;
import java.util.Collection;

public class OfferServiceEndPointImpl implements OfferServiceEndPoint
{
    LoadingOfferService loadingOfferService;
    OfferViewModelConverter offerViewModelConverter;

    public OfferServiceEndPointImpl() {}

    @Inject
    public OfferServiceEndPointImpl(LoadingOfferService loadingOfferService, OfferViewModelConverter offerViewModelConverter)
    {
        this.loadingOfferService = loadingOfferService;
        this.offerViewModelConverter = offerViewModelConverter;
    }

    @Override
    public OfferVO loadOffer(BigInteger id)
    {
        return offerViewModelConverter.convert(loadingOfferService.loadOffer(id));
    }

    @Override
    public Collection<OfferVO> loadOffers()
    {
        return Collections2.transform(loadingOfferService.loadAllOffers(), new Function<Offer, OfferVO>()
        {
            @Override
            public OfferVO apply(Offer input)
            {
                return offerViewModelConverter.convert(input);
            }
        });
    }
}
