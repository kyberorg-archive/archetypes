Maven Archetypes Collection
===========================

How to use
----------

1. Go to folder with archetype you want to install
	```
	cd simple-app
	```

2. Install it to local system
	``` 
	mvn archetype:create-from-project
	cd target/generated-sources/archetype/
	mvn install 
	```

3. Use it
	```
	mvn archetype:generate -DarchetypeCatalog=local
	```

