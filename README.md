# Test-Assignment-2
Made by Amalie Landt

## 1 REFLECTIONS
### 1.1 COMPUTER MOUSE
<i>Identify the types of testing you would perform on a computer mouse, to make sure that it is of the highest quality.</i>

#### Functional Testing
* Clicking all the buttons on the mouse to test weather it does what i is intended to do, and if it does not do what it is not intended to
* This could be tests such as:
  * Verify if the right clicking on the mouse opens context window.
  * Verify if the left clicking with the mouse opens the application or selects the regions on screen.
  * Verify if the left click allows drag and drop of desktop objects like file, folder and media.
  * Verify if the left click allows the selection of the desktop session objects.
  * Verify if the double clicking the file, folder and media files opens or does the operation as intended.
  * Verify if the scroll works in the files with multi-page content.
  * Verify the scroll-bar operation for up, down, left and right direction.
  * Check if the mouse properties are possible to change using system operations.

#### Performance Testing
* Testing the mouse responsiveness and reliability given different loads
  * When the load is increased beyond the maximum “normal load,” load testing turns into stress testing. 
  * A special type of stress testing is spike testing, where the maximum normal load is exceeded very rapidly, as if there were a spike in the load.

* This type of testing could be done be making excessive movement with the mouse, clicking on multiple buttons rapidly or scrolling excessively

#### Regression Testing
* The purpose of regression testing is to establish whether changes to the system have broken existing functionality or caused old defects to resurface
* Traditionally, regression testing has been performed by rerunning a number of, or all, test cases on a system after changes have been made.

* For a computer mouse this would mean doing all of the above tests everytime new functionality is added to the mouse 

### 1.2 CATASTROPHIC FAILURE
<i>Find a story where a software system defect had a bad outcome. Describe what happened. Can you identify a test that would have prevented it?</i>

On June 4th, 1996, the very first Ariane 5 rocket ignited its engines and began speeding away from the coast of French Guiana. 37 seconds later, the rocket flipped 90 degrees in the wrong direction, and less than two seconds later, aerodynamic forces ripped the boosters apart from the main stage at a height of 4km. This caused the self-destruct mechanism to trigger, and the spacecraft was consumed in a gigantic fireball of liquid hydrogen. The disastrous launch cost approximately $370m, led to a public inquiry, and through the destruction of the rocket’s payload, delayed scientific research into workings of the Earth’s magnetosphere for almost 4 years. The Ariane 5 launch is widely acknowledged as one of the most expensive software failures in history.

The fault was quickly identified as a software bug in the rocket’s Inertial Reference System. The rocket used this system to determine whether it was pointing up or down, which is formally known as the horizontal bias, or informally as a BH value. This value was represented by a 64-bit floating variable, which was perfectly adequate.

However, problems began to occur when the software attempted to stuff this 64-bit variable, which can represent billions of potential values, into a 16-bit integer, which can only represent 65,535 potential values. For the first few seconds of flight, the rocket’s acceleration was low, so the conversion between these two values was successful. However, as the rocket’s velocity increased, the 64-bit variable exceeded 65k, and became too large to fit in a 16-bit variable. It was at this point that the processor encountered an operand error, and populated the BH variable with a diagnostic value.

* This could have been avoided by doing a unit performance test on the algorithm that converted the 64-bit variable to a 16-bit integer, like a stress test were the acceleration would be increased beyond normal, to test how it would respond

## 2 TWO KATAS
<i>Complete the following using TDD. Remember the TDD mantra.</i>

### 2.1 STRING UTILITY
<i>Use TDD to create a string utility with the following methods:</i></br>
<i>Reverse string (aBc -> cBa), Capitalize string (aBc -> ABC), Lowercase string (aBc -> abc)</i>

* The solution for this katas can be found in the files [StringConverter](https://github.com/amalielandt/Test-Assignment-2/blob/main/assignment2/src/main/java/dk/sal/test/assignment2/StringConverter.java) and [ConverterTest](https://github.com/amalielandt/Test-Assignment-2/blob/main/assignment2/src/test/java/dk/sal/test/assignment2/ConverterTest.java)

### 2.2 BOWLING GAME KATA
<i>Complete the Bowling Game Kata using TDD.</i>
* The solution for this kata can be found in the files [Game](https://github.com/amalielandt/Test-Assignment-2/blob/main/assignment2/src/main/java/dk/sal/test/assignment2/bowlinggame/Game.java) and [BowlingGameTest](https://github.com/amalielandt/Test-Assignment-2/blob/main/assignment2/src/test/java/dk/sal/test/assignment2/BowlingGameTest.java)

## 3 INVESTIGATION OF TOOLS
### 3.1 JUNIT 5
<i>Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful.</i>
#### @Tag
* This can be used to filter testcases from test plans. It can help in create multiple different test plans for different environments, different use-cases or any specific requirement. You can execute set of tests by including only those tagged tests in test plan OR by excluding other tests from test plan.

* We can use @IncludeTags or @ExcludeTags annotations in your testplan to filter tests or include tests.

#### @Disabled
* This annotation can be used to disable the test methods from test suite. This annotation can be applied over a test class as well as over individual test methods.

#### @RepeatedTest
* This annotation enable to write repeatable test templates which could be run multiple times. The frequency can be configured as parameter to @RepeatedTest annotation.
* An example @RepeatedTest(5), means that the test will be repeated 5 times.

#### @BeforeEach, @AfterEach
* These are used to signal that the annotated method should be executed either before or after each @Test method in the current class.

#### @BeforeAll, @AfterAll
* These are used to signal that the annotated method should be executed before or after all tests in the current test class.

#### @DisplayName
* This is used to declare a custom display name for the annotated test class or test method.

#### @Nested
* This annotation gives the test writer more capabilities to express the relationship among several groups of tests. Such nested tests make use of Java’s nested classes and facilitate hierarchical thinking about the test structure.
* We should annotate our nested test classes with the @DisplayName annotation because it allows us to replace technical names with a sentence that describes the purpose of the nested test class.

#### assumeFalse, assumeTrue
* Assumptions is a collection of utility methods that support conditional test execution based on assumptions.
* In direct contrast to failed assertions, failed assumptions do not result in a test failure; rather, a failed assumption results in a test being aborted.
* Assumptions are typically used whenever it does not make sense to continue execution of a given test method — for example, if the test depends on something that does not exist in the current runtime environment.

### 3.2 MOCKING FRAMEWORKS
<i>Investigate mocking frameworks for your preferred language.</i>
<i>Choose at least two frameworks, and answer the questions. (One could be Mockito, which we saw in class.)</i>

I have choosen to look at the mocking frameworks Mockito and JMockit.

#### What are their similarities?
* Both Mockito and JMockit are open source Java based software licensed under the MIT License.
* Both are used for Unit testing and uses annotations to create mocks
 
#### What are their differences?
 <table border="0">
 <tr>
    <td><b style="font-size:30px">Mockito</b></td>
    <td><b style="font-size:30px">JMockit</b></td>
 </tr>
 <tr>
    <td>1. We can achieve Static method/constructor mocking by the combination of Mockito with Powermock.</td>
    <td>1. Static method/constructor can be mocked directly in JMockit.</td>
 </tr>
  <tr>
    <td>2. The Mockito API contains several inconsistencies in the syntax used for invocations to mocked methods. In the record phase, we have calls like when(mock.mockedMethod(args))… while in the verify phase this same call will be written as verify(mock).mockedMethod(args). Notice that in the first case the invocation to mocked method is made directly on the mock object, while in the second case it is made on the object returned by verify(mock).
</td>
    <td>2. JMockit has no such inconsistencies because invocations to mocked methods are always made directly on the mocked instances themselves. (With one exception only: to match invocations on the same mocked instance, an onInstance(mock) call is used, resulting in code like onInstance(mock).mockedMethod(args); most tests won’t need to use this, though.</td>
 </tr>
  <tr>
    <td>3. Mockito does not have any built-in code coverage report. We face many conflicts and clashes while using JoCoCo with Mockito+PowerMock. But we can use Cobertura as an explicit tool to have full coverage.</td>
    <td>3. Jmockit has built-in coverage report and full support for JaCoCo.</td>
 </tr>
   <tr>
    <td>4. Mockito has a relatively low learning curve as compared to JMockit.</td>
    <td>4. JMockit Has the steeper learning curve as compared to Mockito.</td>
 </tr>
  <tr>
    <td>5. Custom argument matching is relatively complex as compared to JMockit.</td>
    <td>5. Custom argument matching is easy as compared to Mockito.</td>
 </tr>
  <tr>
    <td>6. Mockito is most known as compared to JMockit, so the community will be bigger as compared to JMockito.</td>
    <td>6. JMockit is less known compared to Mockito, so the community will be not as big as Mockito.</td>
 </tr>
  <tr>
    <td>7. Mockito uses ‘proxy API’ design architecture.</td>
    <td>7. JMockit is based on Java 1.5 instrumentation API framework.</td>
 </tr>
</table>

#### Which one would you prefer, if any, and why?
* Based on the comparison of the differences between the two Mocking Frameworks, it is difficult to choose, since JMockit seems easier to implement, and with better options for code coverage reports - on the other hand Mockito is better known (as the best mocking framework) and has a larger community. I think I would go with JMockit, since it is easier to implement. With my limited knowledge of mocking frameworks I would probably go with Mockito, since it easier to find help. 
