@FunctionalInterface
public interface DataTransformer<T> {
    T transform(T t);
}
