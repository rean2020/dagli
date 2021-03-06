// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the util/function/ComposedFunction.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.util.function;

import java.util.Objects;
import com.linkedin.dagli.util.named.Named;


/**
 * A function class implementing {@link BooleanFunction2.Serializable} that composes
 * {@link BooleanFunction2} with a {@link Function1}.  The function is only <strong>actually</strong> serializable
 * if its constituent composed functions are serializable, of course.
 */
class BooleanComposedFunction2<A, B, Q> implements BooleanFunction2.Serializable<A, B>, Named {
  private static final long serialVersionUID = 1;

  private final Function2<A, B, Q> _first;
  private final BooleanFunction1<? super Q> _andThen;

  /**
   * Creates a new instance that composes two functions, i.e. {@code andThen(first(inputs))}.
   *
   * @param first the first function to be called in the composition
   * @param andThen the second function to be called in the composition, accepting the {@code first} functions result
   *                as input
   */
  BooleanComposedFunction2(Function2<A, B, Q> first, BooleanFunction1<? super Q> andThen) {
    _first = first;
    _andThen = andThen;
  }

  @Override
  @SuppressWarnings("unchecked")
  public BooleanComposedFunction2<A, B, Q> safelySerializable() {
    return new BooleanComposedFunction2<>(((Function2.Serializable<A, B, Q>) _first).safelySerializable(),
        ((BooleanFunction1.Serializable<? super Q>) _andThen).safelySerializable());
  }

  @Override
  public boolean apply(A value1, B value2) {
    return _andThen.apply(_first.apply(value1, value2));
  }

  @Override
  public int hashCode() {
    return Objects.hash(BooleanComposedFunction2.class, _first, _andThen);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof BooleanComposedFunction2) {
      return this._first.equals(((BooleanComposedFunction2) obj)._first)
          && this._andThen.equals(((BooleanComposedFunction2) obj)._andThen);
    }
    return false;
  }

  @Override
  public String toString() {
    return Named.getShortName(_andThen) + "(" + Named.getShortName(_first) + ")";
  }

  @Override
  public String getShortName() {
    return Named.getShortName(_andThen) + "(...)";
  }
}
