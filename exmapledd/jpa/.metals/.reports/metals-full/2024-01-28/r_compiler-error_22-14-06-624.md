file://<WORKSPACE>/src/main/java/com/example/jpa/JpaApplication.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

action parameters:
offset: 665
uri: file://<WORKSPACE>/src/main/java/com/example/jpa/JpaApplication.java
text:
```scala
package com.example.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.jpa.entities.Person;
import com.example.jpa.repository.PersonDao;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	@Autowired
	private PersonDao  personDao; 

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		List<Person> pesons = (L@@ist<Person>) personDao.findAll();
		
	}



}

```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:933)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:168)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.HoverProvider$.hover(HoverProvider.scala:34)
	scala.meta.internal.pc.ScalaPresentationCompiler.hover$$anonfun$1(ScalaPresentationCompiler.scala:342)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator