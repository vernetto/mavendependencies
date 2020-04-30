execute from top folder:
mvn enforcer:enforce 

this should fail, because moduleB introduces a dependency on log4j 1.2.17

using <exclusions>exclusion>  <exclusion>exclusions> should fix it
  
  
mvn dependency:tree -Dverbose will display all dependencies

mvn dependency:tree -Dverbose -Dincludes=log4:log4j displays only log4j dependencies
(for syntax see here https://maven.apache.org/plugins/maven-dependency-plugin/examples/filtering-the-dependency-tree.html  )


 
