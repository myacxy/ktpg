package net.myacxy.ktpg.interop;

import net.myacxy.ktpg.classes.ClassesKt;
import net.myacxy.ktpg.classes.CustomerKotlin;
import net.myacxy.ktpg.classes.Status;

import java.io.IOException;

public class TalkingToKotlin {

    public static void main(String[] args) {
        // notice parameter annotations, e.g. @NotNull
        CustomerKotlin customerKotlin = new CustomerKotlin(1, "Lorem Ipsum");
        // no properties, getters and setters instead
        customerKotlin.setName("Dolor Sit");
        // no field, no setter
        customerKotlin.getSomeProperty();
        // no getter or setter
        String anotherProperty = customerKotlin.anotherProperty;

        customerKotlin.changeStatus(Status.CURRENT);
        // no method with default value
//        customerKotlin.changeStatus();
        customerKotlin.anotherChangeStatus(Status.CURRENT);
        // annotation provides default
        customerKotlin.anotherChangeStatus();

        // annotation changes the name when it is called in java
        customerKotlin.preferential();

        // simply accessible by class and function name
        TopLevelFunctionsKt.prefix("prefix", "value");
        // annotation changes the class name for Java
        PrefixUtil.anotherPrefix("prefix", "value");
        // top level property accessible by getter
        PrefixUtil.getTopLevelProperty();
        // 'const' keyword exposes it as a field to Java
        String anotherTopLevelProperty = PrefixUtil.ANOTHER_TOP_LEVEL_PROPERTY;

        // no concept of extension functions in Java
//        customerKotlin.extension()
        // instead accessible by class name
        ClassesKt.extension(customerKotlin);
    }

    public void loadStats(CustomerKotlin customerKotlin) {
        // cannot catch IOException since there is no concept of checked exceptions in Kotlin
//        try {
//            customerKotlin.loadStatistics("filename");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // annotation forces checked exception
        try {
            customerKotlin.anotherLoadStatistics("filename");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
