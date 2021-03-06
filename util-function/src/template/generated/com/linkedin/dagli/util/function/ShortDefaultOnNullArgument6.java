// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the util/function/DefaultOnNullArgument.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.util.function;

import com.linkedin.dagli.util.named.Named;
import java.util.Objects;


/**
 * A function class implementing ShortFunction6.Serializable<A, B, C, D, E, F> that returns 0 if any of
 * the function's inputs are null.
 */
class ShortDefaultOnNullArgument6<A, B, C, D, E, F> implements ShortFunction6.Serializable<A, B, C, D, E, F>, Named {
  private static final long serialVersionUID = 1;
  private static final int CLASS_HASH = ShortDefaultOnNullArgument6.class.hashCode();
  private final ShortFunction6<A, B, C, D, E, F> _wrapped;

  ShortDefaultOnNullArgument6(ShortFunction6<A, B, C, D, E, F> wrapped) {
    // stacking this wrapper multiple times should be idempotent:
    if (wrapped instanceof ShortDefaultOnNullArgument6) {
      _wrapped = ((ShortDefaultOnNullArgument6) wrapped)._wrapped;
    } else {
      _wrapped = Objects.requireNonNull(wrapped);
    }
  }

  @Override
  public ShortDefaultOnNullArgument6<A, B, C, D, E, F> safelySerializable() {
    return new ShortDefaultOnNullArgument6<>(
        ((ShortFunction6.Serializable<A, B, C, D, E, F>) _wrapped).safelySerializable());
  }

  @Override
  public short apply(A value1, B value2, C value3, D value4, E value5, F value6) {
    if (value1 == null || value2 == null || value3 == null || value4 == null || value5 == null || value6 == null) {
      return 0;
    }
    return _wrapped.apply(value1, value2, value3, value4, value5, value6);
  }

  @Override
  public int hashCode() {
    return CLASS_HASH + _wrapped.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof ShortDefaultOnNullArgument6) {
      return this._wrapped.equals(((ShortDefaultOnNullArgument6) obj)._wrapped);
    }
    return false;
  }

  @Override
  public String toString() {
    return "arg == null ? 0 : " + Named.getName(_wrapped);
  }

  @Override
  public String getShortName() {
    return "arg == null ? 0 : " + Named.getShortName(_wrapped);
  }
}
