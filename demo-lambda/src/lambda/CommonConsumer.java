
public interface CommonConsumer<T> extends SuperConsumer<T, T, T> {

  // void accept(T t, T t, T t);
  
}

// Same as the functional interface below
// @FunctionalInterface
// public interface CommonConsumer<T> {
//   void accept(T t1, T t2, T t3);
// }
