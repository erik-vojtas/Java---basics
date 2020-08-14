# Java Basics
self-study

Theory

#Data Type	#Size	    #Description
byte	    1 byte	    Stores whole numbers from -128 to 127
short	    2 bytes	    Stores whole numbers from -32,768 to 32,767
int 	    4 bytes	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	    8 bytes	    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	    4 bytes	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	  8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	  1 bit 	    Stores true or false values
char	    2 bytes	    Stores a single character/letter or ASCII values


#Scope of Variables
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



#Access Modifiers and Visibility

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
