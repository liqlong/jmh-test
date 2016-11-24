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
import oasis.express.entity.ScanArr;
import oasis.express.entity.ScanArrVo;
import oasis.express.helper.MockTestBean;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 20)
@Measurement(iterations = 100)
@OutputTimeUnit(TimeUnit.SECONDS)
@Threads(1)
@Fork(1)
public class ConvertScanArrList {

    private DozerHelper dozerHelper = new DozerHelper();
    private OrikaHelper orikaHelper = new OrikaHelper();
    private List<ScanArr> scanArrList = new ArrayList<>();

    @Setup
    public void setup() {
        MockTestBean mockTestBean = new MockTestBean();
        for (int i = 0; i < 1000; i++) {
            scanArrList.add(mockTestBean.getJavaBean(ScanArr.class));
        }
    }

    @Benchmark
    public void testDozerConvertScanArrList() {
        dozerHelper.convertList(scanArrList, ScanArrVo.class);
    }

    @Benchmark
    public void testOrikaConvertScanArrList() {
        orikaHelper.convertList(scanArrList, ScanArrVo.class);
    }
}
