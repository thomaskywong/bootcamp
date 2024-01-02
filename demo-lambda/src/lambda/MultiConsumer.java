package lambda;

@FunctionalInterface
public interface MultiConsumer<T, U, V> {

  void accept(T t, U u, V v);
  
}
