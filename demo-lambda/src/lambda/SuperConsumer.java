// T, U V could be the same types or different types
@FunctionalInterface
public interface SuperConsumer<T, U, V> {

  void accept(T t, U u, V v);
  
}
