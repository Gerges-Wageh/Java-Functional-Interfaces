package functionalInterfeaces;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        // Using Normal Regular Function
        System.out.println(getDBConnectionURL());


        // Using Supplier Functional InterFace
        System.out.println(getDBConnectionURLSupplier.get());
        System.out.println(getDBConnectionURLsSupplier.get());

    }


    // Normal Regular Function
    static String getDBConnectionURL(){
        return "jdbc://localhost:5432/users";
    }

    // Supplier Functional Interface
    static Supplier<String> getDBConnectionURLSupplier =
            () -> "jdbc://localhost:5432/users";

    // Returning a list from the Supplier
    static Supplier<List<String>> getDBConnectionURLsSupplier =
            () -> List.of(
                    "jdbc://localhost:5432/users",
                    "jdbc://localhost:5432/customer"
            );
}
