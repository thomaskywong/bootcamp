public class DemoSwitchExpression {
    public static void main(String[] args) {

        // use variable to accept the result returned by Switch statement
        Currency currency = Currency.HKD;

        int code = switch(currency) {
            case HKD -> 1;
            case USD -> 2;
            case CNY -> 3;
        };
        
        System.out.println("Currency Code: " + code);

        String dayOfWeek = "Monday";
        int dayCode = switch(dayOfWeek) {
              case "Sunday" -> {
                yield 1;
            }
            case "Monday" -> {
                yield 2;
            }
            case "Tuesday" -> {
                yield 3;
            }
            case "Wednesday" -> {
                yield 4;
            }
            case "Thursday" -> {
                yield 5;
            }
            case "Friday" -> {
                yield 6;
            }
            case "Satuaday" -> {
                yield 7;
            }
            // Shall include default statement
            default -> {
                yield -1;
            }
        };

        System.out.println("DayCode=" + dayCode);

    }

    // Method 1: (less preferred)
    // Normal switch statement
    // no return type
    public static int getCurrencyCode(Currency currency) {
        int code = -1;
        switch (currency) {
            case HKD:
                code = 1;
                break;
            case USD:
                code = 2;
                break;
            case CNY:
                code = 3;
                break;
            default:
        }

        return code;

    }

    // Method 2:
    // Java 14: Switch Expression
    // 1. Contains return Type
    // 2. No "Break" statement
    // 3. Similar to Lambda expression
    // 4. Compiler help ensuring all enum value cases are handled exactly once
    public static int getCurrencyCode2(Currency currency) {
        return switch (currency) {
            case HKD -> 1;
            case USD -> 2;
            case CNY -> 3;
        };

    }

    // Method 3:
    // Java 14: Switch Expression
    // 1. Contains return Type
    // 2. No "Break" statement
    // 3. Similar to Lambda expression
    // 4. Compiler help ensuring all enum value cases are handled exactly once
    // 5. use {} for code block and "yield" as return
    public static int getCurrencyCode3(Currency currency) {
        return switch (currency) {
            case HKD -> {
                String x = "";
                if (x.isEmpty())
                    yield 10;
                else
                    yield 20;
            }
            case USD -> 2;
            case CNY -> 3;
        };

    }

    // For non-enum
    public static int switchMethod(String dayOfWeek) {
        return switch (dayOfWeek) {
            case "Sunday" -> {
                yield 1;
            }
            case "Monday" -> {
                yield 2;
            }
            case "Tuesday" -> {
                yield 3;
            }
            case "Wednesday" -> {
                yield 4;
            }
            case "Thursday" -> {
                yield 5;
            }
            case "Friday" -> {
                yield 6;
            }
            case "Satuaday" -> {
                yield 7;
            }
            // Shall include default statement
            default -> {
                yield -1;
            }
        };

    }
}
