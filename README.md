# Example of a Driver Manager in a Cucumber framework
This project is an example for sharing your browser drivers between step definitions in a cucumber framework using PicoContainer, enum, Factory and Strategy design patterns.

* *RunCucumberTest.java* -> Runs in Chrome browser (default)
* *-Dbrowser=BRAVE* -> runs in Brave browser
* *Invalid browser name* -> defaults to Chrome browser
