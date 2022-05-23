package ir.example;

import org.apache.commons.lang3.RandomStringUtils;

public class MavenTest {
    public static void main(String[] args) {
        System.out.println(RandomStringUtils.randomNumeric(10));
        System.out.println(RandomStringUtils.randomAlphanumeric(10));
        System.out.println(RandomStringUtils.randomPrint(20));
    }
}
