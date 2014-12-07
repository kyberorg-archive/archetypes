Executable JAR
==============

Packages as JAR that can be executed as:
	```
	java -jar name.jar
	```
How to use?
-----------

Just do:
	```
	mvn clean package
	```
Adjustments
-----------

Within manifest it has main class directive that should be changed up to yours application main class.

Also adjust java language level by changing target and source values in compile plugin configuration.  

About dependencies support
--------------------------

This archetype supports exec JAR with dependencies.

So if you add compile or runtime scoped maven dependencies, those dependencies will be present at JAR archive as well.

