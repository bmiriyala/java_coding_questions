package com.babu.latestfeatures;

/**
 * Local variable type inference is a feature in Java 10 that allows the developer to skip
 * the type declaration associated with local variables(those defined inside method definitions,
 * initialization blocks, for-loops, and other blocks like if-else), and the type is inferred by the JDK.
 * It will, then, be the job of the compiler to figure out the datatype of the variable.
 *  Ex: From List<Map> data = new ArrayList<>();
 *      To  var data = new ArrayList<>();
 */
public class LocalVariableTypeInference {
    //1) In a static/instance initialization block - using LVTI in Java 10
    static
    {
        var x = "Hi there";
        System.out.println(x);
    }

    //2) As a local variable - Declaration of a local variable in java 10 using LVTI
    void lvti(){
        var x = "Hi there";
        System.out.println(x);
    }

    //3) As iteration variable in enhanced for-loop - Declaring iteration variables in enhanced for loops using LVTI in Java

    void lvtiEnhancedForloop(){
        int[] arr = {1, 2, 3};
        for (var x : arr)
            System.out.println(x + "\n");
    }

    //4) As looping index in for-loop - Declaring index variables in for loops using LVTI in Java
    void lvtiForloop(){
        int[] arr = {1, 2, 3};
        for (var x = 0; x < 3; x++)
            System.out.println(arr[x] + "\n");
    }

    //5) As a return value from another method
    int ret()
    {
        return 1;
    }

    static void lvtiHoldReturnValueFromOtherMethod(){
        var x = new LocalVariableTypeInference().ret();
        System.out.println(x);
    }

    public static void main(String[] args) {
        lvtiHoldReturnValueFromOtherMethod();
    }

    /*Limitations::
        Not permitted in class fields
        Not permitted for uninitialized local variables
        Not allowed as parameter for any methods
        Not permitted in method return type
        Not permitted with variable initialized with ‘NULL’  --> var x = NULL;*/


}
