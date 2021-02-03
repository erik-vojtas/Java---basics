# Java Basics - Theory
self-study

# Java
The heart of our digital lifestyle. It's the platform for launching careers, exploring human-to-digital interfaces, architecting the world's best applications, and unlocking innovation everywhere—from garages to global organizations.
Object oriented, high-level, compiled, platform independent programming language.
SE, EE, ME


# History of Java
developed by Sun Microsystems (which is now the subsidiary of Oracle) in the year 1995. 
James Gosling is known as the father of Java. 
Before Java, its name was Oak. Since Oak was already a registered company, so James Gosling and his team changed the Oak name to Java.

# Data Types
Primitive Types
#Data Type	#Size	    #Description
byte	      1 byte	    Stores whole numbers from -128 to 127
short	      2 bytes	    Stores whole numbers from -32,768 to 32,767
int 	      4 bytes	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	      8 bytes	    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	      4 bytes	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	    8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	    1 bit 	    Stores true or false values
char	      2 bytes	    Stores a single character/letter or ASCII values


Reference Types
Array - provides a fixed-size data structure that stores data elements of the same type.
Class - designed to provide inheritance, polymorphism, and encapsulation. Usually models something in the real world and consists of a set of values that holds data and a set of methods that operates on the data.
Enumeration - a reference for a set of objects that represents a related set of choices.
Interface - provides a public API and is “implemented” by Java classes.




# Operators
Java supports a rich set of operators that can be classified into categories as below :

Operator Category	Operators
Arithmetic operators	+,-,/,*,%
Relational operators	<, >, <=, >=,==, !=
Logical operators	&& , ||
Assignment operator	=, +=, −=, ×=, ÷=, %=, &=, ^=, |=, <<=, >>=, >>>=
Increment and Decrement operator	++ , - -
Conditional operators	?:
Bitwise operators	^, &, |
Special operators	. (dot operator to access methods of class)


# Interface
An interface is a reference type in Java. It is similar to class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.
Along with abstract methods, an interface may also contain constants, default methods, static methods, and nested types. Method bodies exist only for default methods and static methods.
Writing an interface is similar to writing a class. But a class describes the attributes and behaviors of an object. And an interface contains behaviors that a class implements.
Unless the class that implements the interface is abstract, all the methods of the interface need to be defined in the class.

#An interface is similar to a class in the following ways:
  - An interface can contain any number of methods.
  - An interface is written in a file with a .java extension, with the name of the interface matching the name of the file.
  - The byte code of an interface appears in a .class file.
  - Interfaces appear in packages, and their corresponding bytecode file must be in a directory structure that matches the package name.

#However, an interface is different from a class in several ways, including:
  - You cannot instantiate an interface.
  - An interface does not contain any constructors.
  - All of the methods in an interface are abstract.
  - An interface cannot contain instance fields. The only fields that can appear in an interface must be declared both static and final.
  - An interface is not extended by a class; it is implemented by a class.
  - An interface can extend multiple interfaces.


# Java Inner Classes
Java inner class or nested class is a class which is declared inside the class or interface.
We use inner classes to logically group classes and interfaces in one place so that it can be more readable and maintainable.
Additionally, it can access all the members of outer class including private data members and methods.

Advantage of java inner classes
There are basically three advantages of inner classes in java. They are as follows:
1) Nested classes represent a special type of relationship that is it can access all the members (data members and methods) of outer class including private.
2) Nested classes are used to develop more readable and maintainable code because it logically group classes and interfaces in one place only.
3) Code Optimization: It requires less code to write.

Difference between nested class and inner class in Java
Inner class is a part of nested class. Non-static nested classes are known as inner classes.

Types of Nested classes

There are two types of nested classes non-static and static nested classes.The non-static nested classes are also known as inner classes.

Non-static nested class (inner class)
- Member inner class
- Anonymous inner class
- Local inner class
Static nested class

Type	                      Description
Member Inner Class	        A class created within class and outside method.
Anonymous Inner Class	      A class created for implementing interface or extending class. Its name is decided by the java compiler.
Local Inner Class	          A class created within method.
Static Nested Class	        A static class created within class.
Nested Interface	          An interface created within class or interface.


# Scope of Variables
Local	                                          Instance	                                                  Class/Static

Declared in methods, constructors, or blocks	  
                                                Declared in a class, but outside a method/block	            
                                                                                                            Same as instance, but with static keyword


Created when block is entered, destroyed upon block exit	
                                              Created when an object is created (new). When space is allocated for a block on the heap, a slot for each instance var is created.	                                                                                  
                                                                                                            Created when program starts, destroyed when program ends.


No access modifiers.	                          
                                              Access modifiers OK. Visible to all methods & constructors in class.	
                                                                                                            Access modifiers OK. Visible to all methods & constructors in class.


No default values.	                            Have default values.	                                      Have default values.



# Access Modifiers and Visibility

N/A	                          Public      Protected     Default     Private
Same Class	                    Y	            Y	          Y	          Y
Same Package Subclass	          Y	            Y	          Y         	N
Same Package Non-subclass	      Y	            Y	          Y         	N
Different Package Subclass	    Y	            Y	          N	          N
Different Package Non-subclass	Y	            N	          N	          N

- Top-level Classes & interfaces cannot be private or protected
- Methods declared public in superclass must be public in all subclasses
- Methods declared protected in superclass must be public or protected in subclasses
- Private methods are not inherited



# Maps
10 ways of finding the sum of all of the keys and values of a map:

1. Using iterator and Map.Entry
long i = 0;
Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
while (it.hasNext()) {
    Map.Entry<Integer, Integer> pair = it.next();
    i += pair.getKey() + pair.getValue();
}


2. Using foreach and Map.Entry
long i = 0;
for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
    i += pair.getKey() + pair.getValue();
}


3. Using forEach from Java 8
final long[] i = {0};
map.forEach((k, v) -> i[0] += k + v);


4. Using keySet and foreach
long i = 0;
for (Integer key : map.keySet()) {
    i += key + map.get(key);
}


5. Using keySet and iterator
long i = 0;
Iterator<Integer> itr2 = map.keySet().iterator();
while (itr2.hasNext()) {
    Integer key = itr2.next();
    i += key + map.get(key);
}


6. Using for and Map.Entry
long i = 0;
for (Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator(); entries.hasNext(); ) {
    Map.Entry<Integer, Integer> entry = entries.next();
    i += entry.getKey() + entry.getValue();
}


7. Using the Java 8 Stream API
final long[] i = {0};
map.entrySet().stream().forEach(e -> i[0] += e.getKey() + e.getValue());


8. Using the Java 8 Stream API parallel
final long[] i = {0};
map.entrySet().stream().parallel().forEach(e -> i[0] += e.getKey() + e.getValue());
Using IterableMap of Apache Collections
long i = 0;


9. MapIterator<Integer, Integer> it = iterableMap.mapIterator();
while (it.hasNext()) {
    i += it.next() + it.getValue();
}


10. Using MutableMap of Eclipse (CS) collections
final long[] i = {0};
mutableMap.forEachKeyValue((key, value) -> {
    i[0] += key + value;
});


# HashMap vs TreeMap vs LinkedHashMap
All three classes HashMap, TreeMap and LinkedHashMap implements java.util.Map interface, and represents mapping from unique key to values.

1. HashMap
A HashMap contains values based on the key.
It contains only unique elements.
It may have one null key and multiple null values.
It maintains no order.
public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable


2. LinkedHashMap
A LinkedHashMap contains values based on the key.
It contains only unique elements.
It may have one null key and multiple null values.
It is same as HashMap instead maintains insertion order. //See class deceleration below
public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>


3. TreeMap
A TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
It contains only unique elements.
It cannot have null key but can have multiple null values.
It is same as HashMap instead maintains ascending order(Sorted using the natural order of its key.).
public class TreeMap<K,V> extends AbstractMap<K,V> implements NavigableMap<K,V>, Cloneable, Serializable
Hashtable


4. HashTable 
A Hashtable is an array of list. Each list is known as a bucket. The position of bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
It contains only unique elements.
It may have not have any null key or value.
It is synchronized.
It is a legacy class.






















