# SpringIoC-HelloWorld
My first experience with Spring DI mechanism

####The @Autowired annotation is auto wire the bean by matching data type.
We will autowired this field.
```java
 @Autowired(required=false)
 private Person person;
```
When Spring can’t find a matching bean to wire, it will throw an exception. To fix it, you can disable this checking feature by setting the “required” attribute of @Autowired to false.

____

To enable @Autowired, you have to register ‘AutowiredAnnotationBeanPostProcessor‘ [conf.xml](https://github.com/Karina-Denisevich/SpringIoC-HelloWorld/blob/master/src/main/resources/conf.xml#L6).
