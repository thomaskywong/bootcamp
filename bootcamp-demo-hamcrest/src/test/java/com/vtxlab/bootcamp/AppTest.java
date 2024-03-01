package com.vtxlab.bootcamp;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.junit.jupiter.api.Test;
import static com.vtxlab.bootcamp.model.AmountMatcher.*;
import static com.vtxlab.bootcamp.model.EmailMatcher.*;
import static com.vtxlab.bootcamp.model.UppercaseStringMatcher.*;
import static com.vtxlab.bootcamp.model.PhoneNumberMatcher.*;
import static com.vtxlab.bootcamp.model.CatMatcher.*;



public class AppTest {

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    // Compare int, String
    @Test
    void testIntegerString() {

        // int value
        int actual = 45;

        // Core Matchers
        // equalTo()
        assertThat(actual, equalTo(45));

        // not( )
        assertThat(actual, not(equalTo(44)));

        // is( )
        assertThat(actual, is(45));

        // For numercial values
        // greaterThan( )
        assertThat(actual, greaterThan(44));

        // greaterThanOrEqualTo()
        assertThat(actual, greaterThanOrEqualTo(45));

        // lessThan( )
        assertThat(actual, lessThan(46));

        // lessThanOrEqualTo()
        assertThat(actual, lessThanOrEqualTo(45));

        // closeTo(rounding number, delta))
        // If the given float number close to the given delta
        double f1 = 3.1415d;
        assertThat(f1, closeTo(3.14, 0.01));

        double actualdouble = 10.0;
        assertThat(actualdouble, closeTo(9.9, 0.1));
        assertThat(actualdouble, closeTo(10.1, 0.1));

    }

    @Test
    void strings() {

        // For String
        String actualStr = "hello";
        String actualStr1 = "hello";
        String actualStr2 = null;

        // equalTo( )
        assertThat(actualStr, equalTo("hello"));

        // not(equalTo( ))
        assertThat(actualStr, not(equalTo("helloo")));

        // containsString("xxx")
        assertThat(actualStr, containsString("ell"));
        assertThat(actualStr, not(containsString("world")));

        // nullValue()
        assertThat(actualStr2, nullValue());

        // notNullValue()
        assertThat(actualStr, notNullValue());


        // Object match
        // sameInstance() ( same as assertSame( , ))
        assertThat(actualStr, sameInstance(actualStr1));

        String string1 = "Good";
        String string2 = "Good";
        String string3 = new String("Good");

        assertThat(string1, sameInstance(string2));
        assertThat(string1, not(sameInstance(string3)));
        // Text matchers
        String str = "Thomas";
        String str1 = "Thomas";
        String str2 = "Wong";
        String str3 = "";


        // startsWith(" ")
        assertThat(str, startsWith("Th"));

        // endsWith(" ")
        assertThat(str2, endsWith("ong"));

        // containsString(" ")
        assertThat(str1, containsString("om"));

        // emptyString()
        assertThat(str3, emptyString());

        // hasSize(n)
        assertThat(str, hasLength(5));
    }

    @Test
    void logicalMatchers() {

        // logical matchers
        // allOf() -- see if all conditions are fulfilled
        // assertThat(value, allOf( conditions methods ))
        int actual = 45;
        assertThat(actual, allOf(greaterThan(44), equalTo(45), lessThan(46)));

        // anyOf() -- see if any of the conditions is fulfilled
        actual = 10;
        assertThat(actual, anyOf(lessThan(8), greaterThan(9)));



    }

    @Test
    void collectionMatcher() {

        // Collection matcher
        List<String> names = new ArrayList<>(List.of("Thomas", "Daisy",
                "Kenneth", "Keith", "Cary", "Edgar", "Samuel"));
        List<String> names2 = new ArrayList<>();

        String str4 = "Thomas";
        String str5 = "Emily";
        String str6 = "Tom";

        // hasItem("")
        // has given item in list
        assertThat(names, hasItem("Thomas"));

        // hasItems("xxx", "yyy")
        // has given items in list
        assertThat(names, hasItems("Kenneth", "Daisy"));
        assertThat(names, not(hasItems("Kenneth", "Tom")));

        // hasSize(n)
        // the collection has size of n
        assertThat(names, hasSize(7));
        assertThat(names2, hasSize(0));


        // contains("xxx", "yyy", "zzz")
        // contains ALL ITEMS in the given list in the SAME order
        assertThat(names, contains("Thomas", "Daisy", "Kenneth", "Keith",
                "Cary", "Edgar", "Samuel"));

        // containsInAnyOrder("yyy", "xxx", "zzz")
        // contains ALL ITEMS in the given list in different order
        assertThat(names, containsInAnyOrder("Daisy", "Kenneth", "Thomas",
                "Keith", "Cary", "Edgar", "Samuel"));


        // empty()
        // check if the collection is empty
        assertThat(names2, empty());


        // Array matchers

        String[] myArr = new String[] {"Thomas", "Peter", "Joe"};

        // arrayContaining()
        // check if the array has ALL elements in given expected array in the SAME order
        assertThat(myArr, arrayContaining("Thomas", "Peter", "Joe"));

        // arrayContainingInAnyOrder()
        // check if the array has ALL elements in given expected array in any order
        assertThat(myArr, arrayContainingInAnyOrder("Peter", "Thomas", "Joe"));


        // Datatype matcher
        // instanceof(Classname.class)
        Object obj = String.valueOf("Thomas");
        assertThat(obj, instanceOf(String.class));

        // typeCompatibleWith( )
        // check if the given class is child class of the given class
        assertThat(StringBuilder.class, typeCompatibleWith(CharSequence.class));


    }

    @Test
    void testNullValue() {

        String actual = null;
        assertThat(actual, nullValue());

        String actual2 = "Hello";
        assertThat(actual2, notNullValue());

    }

    @Test
    void testSameObject() {

        String s1 = "hello";
        String s2 = "hello";

        assertThat(s1, sameInstance(s2));

        String s3 = new String("hello");
        assertThat(s3, not(sameInstance(s1)));

    }

    @Test
    void testAllRangeOfResult() {

        int result = 48;

        // allOf() is AND relationship
        assertThat(result, allOf( //
                greaterThan(47), //
                lessThan(50), //
                greaterThanOrEqualTo(48), //
                lessThanOrEqualTo(48)));

        String result2 = "world";

        // anyOf() is OR relationship
        assertThat(result2, anyOf( //
                equalTo("hello"), //
                equalTo("world")));

        Character character = Character.valueOf('D');

        assertThat(character, allOf( //
                not(equalTo('E')), //
                equalTo('D')));
    }

    @Test
    void testIntegerString2() {

        String emptyString = "";

        assertThat(emptyString, emptyString());

        assertThat(null, not(emptyString()));
        assertThat(" ", not(emptyString()));

        String result = "Thomas";

        assertThat(result, allOf(//
                not(emptyString()), //
                startsWith("Th"), endsWith("as"), equalTo("Thomas")));
    }

    // MOST IMPORTANT
    // for comparing result of a Collection
    @Test
    void testCollection() {
        List<String> strings =
                new ArrayList<>(List.of("John", "Peter", "Jenny"));

        List<String> expected =
                new ArrayList<>(List.of("John", "Peter", "Jenny"));

        assertThat(strings, hasItems("John", "Peter"));
        assertThat(strings, hasItems("John", "Jenny"));
        assertThat(strings, not(hasItems("Joe", "Peter")));

        assertThat(strings, hasSize(3));

        assertThat(strings.size(), allOf( //
                greaterThanOrEqualTo(1), //
                lessThanOrEqualTo(5)));

        // Difference between contains() and hasItems()
        // 1. contains() & containsInAnyOrder() -> with all items
        // 2. hasItems() -> with specific items only. No ordering required

        // contains() - has ALL items in the SAME order
        assertThat(strings, contains("John", "Peter", "Jenny"));
        assertThat(strings, not(contains("John", "Peter")));
        assertThat(strings, not(contains("Jenny", "John", "Peter")));


        // containsInAnyOrder() - has ALL items in ANY order
        assertThat(strings, containsInAnyOrder("Peter", "Jenny", "John"));


    }

    @Test
    void testArray() {
        String[] strings = new String[3];
        strings[0] = "John";
        strings[1] = "Ken";
        strings[2] = "Steven";

        assertThat(strings, arrayContaining("John", "Ken", "Steven"));
        assertThat(strings, not(arrayContaining("John", "Ken")));
        assertThat(strings, not(arrayContaining("Steven", "John", "Ken")));

        assertThat(strings, arrayContainingInAnyOrder("Steven", "John", "Ken"));
        assertThat(strings, not(arrayContainingInAnyOrder("Steven", "John")));
    }

    @Test
    void testTolerance() {

        double tolerance = 0.01d;
        double actual = 3.14159d;

        assertThat(actual, closeTo(3.14, tolerance));
        assertThat(actual, closeTo(3.141, tolerance));
        assertThat(actual, closeTo(3.142, tolerance));
        assertThat(actual, closeTo(3.151, tolerance));
        assertThat(actual, closeTo(3.15158, tolerance));
        assertThat(actual, not(closeTo(3.15159, tolerance)));
        assertThat(actual, closeTo(3.13159, tolerance));
        assertThat(actual, not(closeTo(3.13158, tolerance)));

    }

    @Test
    void testObject() {
        Object obj = "hello"; // Polymorphism

        // if (obj instanceof String) {
        // String s = (String) obj;
        // System.out.println(s);
        // }

        // assert instanceOf()
        assertThat(obj, instanceOf(String.class));

        // assert typeCompatibleWith()
        assertThat(obj.getClass(), typeCompatibleWith(CharSequence.class));
        
        Object obj2 = obj;
        // assert sameInstance()
        assertThat(obj, sameInstance(obj2));


    }

    @Test
    void testAnimal() {

        Animal a1 = Animal.get(3);
        assertThat(a1, instanceOf(Dog.class));

        Animal a2 = Animal.get(2);
        assertThat(a2, instanceOf(Cat.class));

    }

    @Test
    void testCompatible() {

        // assertThat(Child.class, typeCompatibleWith(Parent.class))
        // check if the class design is correct.
        assertThat(Cat.class, typeCompatibleWith(Animal.class));
        assertThat(Dog.class, typeCompatibleWith(Animal.class));
        assertThat(Dog.class, typeCompatibleWith(Object.class));

        assertThat(Cat.class, not(typeCompatibleWith(Dog.class)));
        assertThat(Animal.class, not(typeCompatibleWith(Dog.class)));


    }

    @Test
    void testPhoneNumber() {

        assertThat("20000000", validPhoneNumber());
        assertThat("30000000", validPhoneNumber());
        assertThat("50000000", validPhoneNumber());
        assertThat("60000000", validPhoneNumber());
        assertThat("90000000", validPhoneNumber());
        assertThat("23456780", validPhoneNumber());
        assertThat("30123456", validPhoneNumber());
        assertThat("56789012", validPhoneNumber());
        assertThat("67890123", validPhoneNumber());
        assertThat("90123456", validPhoneNumber());

        assertThat("00000000", not(validPhoneNumber()));
        assertThat("00000001", not(validPhoneNumber()));
        assertThat("03456780", not(validPhoneNumber()));
        assertThat("10123456", not(validPhoneNumber()));
        assertThat("47890123", not(validPhoneNumber()));
        assertThat("70123456", not(validPhoneNumber()));
        assertThat("80123456", not(validPhoneNumber()));
        assertThat("47890123", not(validPhoneNumber()));
        assertThat("7012-3456", not(validPhoneNumber()));
        assertThat("8xxxxxxx", not(validPhoneNumber()));

    }
    // Customized matcher
    @Test
    void testCustomMatcher() {

        String result = "HELLO";

        assertThat(result, containsUppercaseOnly());
        assertThat("WONG", containsUppercaseOnly());
        assertThat("Wong", not(containsUppercaseOnly()));
        assertThat("wong", not(containsUppercaseOnly()));
        assertThat("wong", not(containsUppercaseOnly()));

    }

    // email address matcher (customized matcher)
    @Test
    void testEmailAddressMatcher() {

        assertThat("thomas@yahoo.com", validEmailAddress());
        assertThat("thoma_s@yahoo.co", validEmailAddress());
        assertThat("thoma._s@yahoo-.co", validEmailAddress());
        assertThat("thoma._s@yahoo-.Com", validEmailAddress());

    }

    // amount tester
    @Test
    void testAmountMatcher() {

        assertThat("0", validAmount());
        assertThat("3", validAmount());
        assertThat("10", validAmount());
        assertThat("21", validAmount());
        assertThat("303", validAmount());
        assertThat("100", validAmount());
        assertThat("40003", validAmount());
        assertThat("9999", validAmount());


        assertThat("0.00", validAmount());
        assertThat("1.00", validAmount());
        assertThat("1.01", validAmount());
        assertThat("0.150", validAmount());
        assertThat("0.027", validAmount());
        assertThat("0.0350", validAmount());
        assertThat("431.51", validAmount());
        assertThat("431.05", validAmount());
        assertThat("55.550", validAmount());
   
        assertThat("0.", not(validAmount()));
        assertThat("1.", not(validAmount()));
        assertThat("10.", not(validAmount()));
        assertThat("433.", not(validAmount()));   
        assertThat("00", not(validAmount()));
        assertThat("010", not(validAmount()));
        assertThat("001", not(validAmount()));
        assertThat("00.00", not(validAmount()));
        assertThat("1.0.", not(validAmount()));
        assertThat("0.023.0", not(validAmount()));
        assertThat("0..00", not(validAmount()));
    }

    @Test
    void testAnimalMatcher() {

        Cat cat = new Cat();
        Dog dog = new Dog();

        assertThat(cat, validAnimal());
        assertThat(dog, not(validAnimal()));


    }
}
