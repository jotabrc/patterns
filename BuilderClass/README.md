# Builder Pattern
Allows the creation of an object using a static class, allowing flexibility.

## Method chaining
Each builder method returns the builder object, allowing the chaining of methods until all fields are instantiated.

## build()
After setting all field, the build method will return the building object with its fields values set.

## Immutability
Allows chaining methods to create an immutable object if the built object has final fields.

## Avoid multiple constructors
The builder pattern doesn't require any fields to be set, even when build an object with immutable fields.