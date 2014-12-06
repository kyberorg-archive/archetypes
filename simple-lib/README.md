Simple Java Library
===================
Template for Java library 

Packaged as JAR file

pom.xml contains attributes and profile needed for publish library
 
How to use?
-----------

Pom created from this archetype has profile for releasing lib

1. To code and test without release use:
   ```
   mvn clean test package
   ```
   This performs unit testing and builds JAR archive

2. To make release do:
    ```
    mvn clean test package -P release
    ```

    This performs unit testing, builds JAR with library, builds JAR with sources and JAR with javadocs
