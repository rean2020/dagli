// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the transformer/internal/TransformerXInternalAPI.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.transformer.internal;

import com.linkedin.dagli.transformer.Transformer10;
import com.linkedin.dagli.producer.Producer;
import com.linkedin.dagli.transformer.Transformer1;
import com.linkedin.dagli.tuple.Tuple10;
import java.util.List;


public interface Transformer10InternalAPI<A, B, C, D, E, F, G, H, I, J, R, S extends Transformer10<A, B, C, D, E, F, G, H, I, J, R>>
    extends TransformerInternalAPI<R, S> {

  @Override
  @SuppressWarnings("unchecked")
  default S withInputsUnsafe(List<? extends Producer<?>> newInputs) {
    return withInputs((Producer<? extends A>) newInputs.get(0), (Producer<? extends B>) newInputs.get(1),
        (Producer<? extends C>) newInputs.get(2), (Producer<? extends D>) newInputs.get(3),
        (Producer<? extends E>) newInputs.get(4), (Producer<? extends F>) newInputs.get(5),
        (Producer<? extends G>) newInputs.get(6), (Producer<? extends H>) newInputs.get(7),
        (Producer<? extends I>) newInputs.get(8), (Producer<? extends J>) newInputs.get(9));
  }

  Producer<? extends A> getInput1();

  Producer<? extends B> getInput2();

  Producer<? extends C> getInput3();

  Producer<? extends D> getInput4();

  Producer<? extends E> getInput5();

  Producer<? extends F> getInput6();

  Producer<? extends G> getInput7();

  Producer<? extends H> getInput8();

  Producer<? extends I> getInput9();

  Producer<? extends J> getInput10();

  S withInputs(Producer<? extends A> input1, Producer<? extends B> input2, Producer<? extends C> input3,
      Producer<? extends D> input4, Producer<? extends E> input5, Producer<? extends F> input6,
      Producer<? extends G> input7, Producer<? extends H> input8, Producer<? extends I> input9,
      Producer<? extends J> input10);

  Transformer1<Tuple10<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends F, ? extends G, ? extends H, ? extends I, ? extends J>, R> withArity1(
      Producer<? extends Tuple10<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends F, ? extends G, ? extends H, ? extends I, ? extends J>> inputTuple);
}
