package sheet.state;

import com.ml.lib.Core;
import com.ml.lib.tensor.Tensor;

public class Summarized extends State {
    public Summarized(TensorWState parent, TensorWState additional){
        super(parent, additional);
    }

    @Override
    public TensorWState get() {
        Tensor sum = Core.sum(parent.getTensor(), additional.getTensor());

        return new TensorWState(sum);
    }
}