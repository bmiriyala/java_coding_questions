package com.babu.latestfeatures;

/**
 * The switch statement:
 * Unlike the if/else if/else statement, a switch statement can have a number of possible execution paths.
 * A switch works with the primitive types, byte, short, char, and int, their respective wrapper
 * types (Byte, Short, Character, and Integer), enumerated types, and the String type1. While an if-else
 * statement is used to test expressions based on ranges of values or conditions, a switch statement is
 * used to test expressions based only on a single value.
 *
 * The switch expression:
 * The switch expression was introduced with Java SE 12. However, it remained as a Preview feature in
 * Java SE 12 and 13 and finally got standardized with Java SE 14. Like any expression, switch expressions
 * evaluate to a single value, and can be used in statements. It also introduced "arrow case" labels
 * eliminating the need for break statements to prevent fall through. As of Java SE 15, there is no change
 * in the supported data types (mentioned in the switch statement section above).
 */
public class SwitchExpression {

    public static void main(String[] args) {
        switchStatement();
        switchExpression();
        switchExpressionWithYield();
    }

    static void switchStatement(){
        String message = "";
        PaymentStatus paymentStatus = PaymentStatus.PARTPAID;

        switch (paymentStatus) {
            case UNPAID:
                message = "The order has not been paid yet. Please make the minimum/full amount to procced.";
                break;
            case PARTPAID:
                message = "The order is partially paid. Some features will not be available. Please check the brochure for details.";
                break;
            case PAID:
                message = "The order is fully paid. Please choose the desired items from the menu.";
                break;
            default:
                throw new IllegalStateException("Invalid payment status: " + paymentStatus);
        }
        System.out.println(message);
    }

    static void switchExpression(){
        PaymentStatus paymentStatus = PaymentStatus.PARTPAID;

        String message = switch (paymentStatus) {
            case UNPAID -> "The order has not been paid yet. Please make the minimum/full amount to procced.";
            case PARTPAID -> "The order is partially paid. Some features will not be available. Please check the brochure for details.";
            case PAID -> "The order is fully paid. Please choose the desired items from the menu.";
            default -> throw new IllegalStateException("Invalid payment status: " + paymentStatus);
        };

        System.out.println(message);
    }

    static void switchExpressionWithYield(){
        PaymentStatus paymentStatus = PaymentStatus.PARTPAID;

        String message = switch (paymentStatus) {
            case UNPAID:
                yield "The order has not been paid yet. Please make the minimum/full amount to procced.";
            case PARTPAID:
                yield "The order is partially paid. Some features will not be available. Please check the brochure for details.";
            case PAID:
                yield "The order is fully paid. Please choose the desired items from the menu.";
            default:
                throw new IllegalStateException("Invalid payment status: " + paymentStatus);
        };

        System.out.println(message);
    }
}

enum PaymentStatus {
    UNPAID, PARTPAID, PAID, DISPUTED, UNKNOWN;
}
