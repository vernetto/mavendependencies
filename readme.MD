execute from top folder:
mvn enforcer:enforce 

this should fail, because moduleB introduces a dependency on log4j 1.2.17

using <exclusions>exclusion>  <exclusion>exclusions> should fix it