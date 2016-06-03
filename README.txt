# TestNG_implement
This is an implementation of TestNG on a sample Java Maven Project with unit tests.

Running:
Run as a maven project. Run tests with <<< mvn clean site >>> this will generate a gui that shows you the full readout of the test coverage

Goals:
- Outline naming standards for building tests.
- Show how we structure tests
- Actually writing the entire test suite isn't needed

Testing Strategies:
- Make sure each function is called
- Make sure each function has base functionaly working
- Make sure each function can take anything as it's imputs and behave correctly
- Make sure tests cover 90% (or so of code);

See full site implementation here after running mvn site
target/site/index.html

Abstract classes:
AnimalImplementation

Method Naming;
void whenThisIsOneThing_thenThisOtherThingHappens();

add classes to test in src/test/resources/testng.xml
- Must include the full class prop name

