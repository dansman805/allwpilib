package java.util;

import java.util.function.Supplier;

public class Objects {
    public static <T> T requireNonNull​(T obj) {
        if (obj != null) {
            return obj;
        }

        throw new NullPointerException();
    }

    public static <T> T requireNonNull​(T obj, String message) {
        if (obj != null) {
            return obj;
        }
        
        throw new NullPointerException(message);
    }

    public static <T> T requireNonNull​(T obj, 
        Supplier<String> messageSupplier) {
        
        if (obj != null) {
            return obj;
        }
        else {
            throw new NullPointerException(messageSupplier.get());
        }
    }

    public static <T> T requireNonNullElseGet​(T obj,
        Supplier<? extends T> supplier) {
        if (obj == null) {
            if (supplier == null) {
                throw new NullPointerException();
            }
            T value = supplier.get();

            if (value == null) {
                throw new NullPointerException();
            }

            return value;
        }
        return obj;
    }
}