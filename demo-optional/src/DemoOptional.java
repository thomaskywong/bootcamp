import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;

public class DemoOptional {
    public static void main(String[] args) {

        // Cat; age ,name
        // Cat.class, Cat is the name of a class. Can be named anything such as Box
        // can be treated as a class that contains the attributes
        // Use business domain to name the class for easy understanding

        Account account = DemoOptional.setup(1, 0.0d);
        account.credit(10.0d);

        Account account2 = DemoOptional.setup(0, 0.0d);
        // account2.credit(200.0d); // NullPointerException, since account2 points to null. Setup method return null to account 2
        // Optional<Account> oa2 = Optional.of(account2); // NullPointerException
        Optional<Account> oa2 = Optional.empty();
        System.out.println(oa2.isPresent()); // false

        // Optional is a class
        // Use Optional holder to handle null

        // Approach 1 to handle Optional return value (Best practise)
        DemoOptional.setup2(0, 0.0d).ifPresent(acct -> acct.credit(1000.0d)); // is not null, then credit 1000

        // Approach 2 to handle Optional return value
        Optional<Account> oa = DemoOptional.setup2(3, 0.0d);
        if (oa.isPresent()) {
            oa.get().credit(1000.0d);
        } else {
            System.out.println("Not action on null object.");
        }

        // Stream on Optional
        Account acc1 = new Account(1, 120.0d);
        Account acc2 = new Account(2, 50.0d);
        Account acc3 = new Account(3, 1000.0d);

        List<Account> accounts = new ArrayList<>(List.of(acc3, acc2, acc1));
        Optional<Account> accA = accounts.stream() //
                .filter(e -> e.getBalance() > 600.0d) //
                .findFirst(); // could be an empty stream. find the first element if exists.Convert to Optional object

        System.out.println("Optional<T> .findFirst()");
        accA.ifPresent(e -> System.out.println(e.getBalance()));

        // Approach 1:
        // accA.ifPresent(e -> e.credit(30.0d));
        accA.ifPresent(e -> System.out.println(e.toString()));

        // Approach 2:
        // if (accA.isPresent())
        // accA.get().credit(30.0d);
        // else
        // System.out.println("No account is found!");
        // System.out.println(accA.get().toString());


        Optional<Account> accB = accounts.stream() //
                .filter(e -> e.getBalance() > 2000.0d) //
                .findAny(); // could be an empty stream. find the any element if exists.Convert to Optional object. Optional.empty() if empty

        System.out.println("Optional<T> .findAny()");
        accB.ifPresent(e -> System.out.println(e.getBalance()));
        accB.ifPresent(e -> System.out.println(e.toString()));
        System.out.println();

        System.out.println("T .orElse( T t)");
        Account acct1 = accA.orElse(new Account(4, 10000.0d));
        System.out.println(acct1);
        Account acct2 = accB.orElse(new Account(4, 10000.0d));
        System.out.println(acct2);
        System.out.println();

        System.out.println("T orElseGet( Supplier <? super T> supplier )");
        Account acct3 = accB.orElseGet(() -> new Account(5, 20000.0d));
        System.out.println(acct3);
        System.out.println();

        System.out.println(
                "T orElseThrow(Supplier <? extends Throwable> exceptionSupplier)");
        Account acct4 = accA.orElseThrow(() -> new NoSuchElementException());
        System.out.println(acct4);
        // Account acct5 = accB.orElseThrow(() -> new NoSuchElementException());
        
        System.out.println();
        System.out.println(accounts);

        // Finds max value
        OptionalDouble MaxBalance =
                accounts.stream().mapToDouble(e -> e.getBalance()).max();
        double max = 0.0d;
        // if MaxBalance is not empty
        if (MaxBalance.isPresent()) {
            max = MaxBalance.getAsDouble(); // convert OptionalDouble to double
        }
        System.out.println(max);

        // Finds min value
        OptionalDouble MinBalance =
                accounts.stream().mapToDouble(e -> e.getBalance()).min();
        double min = 0.0d;
        // if MaxBalance is not empty
        if (MinBalance.isPresent()) {
            min = MinBalance.getAsDouble(); // convert OptionalDouble to double
        }
        System.out.println(min);



    }

    public static Account setup(int accountNo, double balance) {
        if (accountNo <= 0 || balance < 0)
            return null;
        return new Account(accountNo, balance);
    }


    public static Optional<Account> setup2(int accountNo, double balance) {
        if (accountNo <= 0 || balance < 0)
            return Optional.empty();
        return Optional.of(new Account(accountNo, balance));
    }

    // NEVER USE OPTIONAL AS INPUT PARAMETER TYPE
    // requires null pointer check on input argements always! Optional<T> type is meaningless
    // public static Optional<Account> setup3(Optional<Integer> accountNo, Optional<Double> balance) {
    // if (accountNo == null || balance == null)
    // return Optional.empty();
    // return Optional.of(new Account(accountNo.get(), balance.get()));
    // }

}
