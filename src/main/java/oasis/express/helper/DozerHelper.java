package oasis.express.helper;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;

public class DozerHelper {

    private DozerBeanMapper dozerMapper;

    public DozerHelper() {
        dozerMapper = new DozerBeanMapper();
    }

    @SuppressWarnings("unchecked")
    public <V, P> P convert(V base, Class<P> target) {

        return (P) dozerMapper.map(base, target);

    }

    @SuppressWarnings("unchecked")
    public <V, P> P convert(V base, P target) {

        dozerMapper.map(base, target);
        return target;

    }

    public <V, P> List<P> convertList(List<V> baseList, Class<P> target) {
        List<P> targetList = new ArrayList<P>();
        for (V vo : baseList) {
            targetList.add((P) convert(vo, target));
        }
        return targetList;
    }

}
