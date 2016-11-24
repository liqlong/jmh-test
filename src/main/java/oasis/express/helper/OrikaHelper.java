package oasis.express.helper;

import java.util.List;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * Created by bl05381 on 2016-11-23.
 */
public class OrikaHelper {

    private MapperFacade mapperFacade;

    public OrikaHelper() {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFacade = mapperFactory.getMapperFacade();
    }

    public <V, P> P convert(V base, Class<P> target) {

        return mapperFacade.map(base, target);
    }

    public <V, P> List<P> convertList(List<V> baseList, Class<P> target) {

        return mapperFacade.mapAsList(baseList, target);
    }
}
