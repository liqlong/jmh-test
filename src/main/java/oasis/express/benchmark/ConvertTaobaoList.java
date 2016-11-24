package oasis.express.benchmark;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;

import oasis.express.helper.DozerHelper;
import oasis.express.helper.OrikaHelper;
import oasis.express.entity.TaoBaoBill;
import oasis.express.entity.TaoBaoBillVo;
import oasis.express.helper.MockTestBean;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 20)
@Measurement(iterations = 100)
@OutputTimeUnit(TimeUnit.SECONDS)
@Threads(1)
@Fork(1)
public class ConvertTaobaoList {

    private DozerHelper dozerHelper = new DozerHelper();
    private OrikaHelper orikaHelper = new OrikaHelper();
    private List<TaoBaoBill> taoBaoBillList = new ArrayList<>();

    @Setup
    public void setup() {
        MockTestBean mockTestBean = new MockTestBean();
        for (int i = 0; i < 1000; i++) {
            taoBaoBillList.add(mockTestBean.getJavaBean(TaoBaoBill.class));
        }
    }

    @Benchmark
    public void testDozerConvertTaobaoList() {
        dozerHelper.convertList(taoBaoBillList, TaoBaoBillVo.class);
    }

    @Benchmark
    public void testOrikaConvertTaobaoList() {
        orikaHelper.convertList(taoBaoBillList, TaoBaoBillVo.class);
    }
}
