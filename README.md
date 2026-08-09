# validation.example
Projekt mit Beispielen zu Validation Frameworks wie das Bean-Validation oder checkerframework.

[![Maven CI](https://github.com/Huluvu424242/validation.example/actions/workflows/maven.yml/badge.svg)](https://github.com/Huluvu424242/validation.example/actions/workflows/maven.yml)

Das Projekt wird mit Java 17 gebaut. Die drei Module behalten bewusst
unterschiedliche Aufgaben und, wo fachlich notwendig, unterschiedliche
Framework-Generationen:

* `beanvalidation` demonstriert aktuelle Jakarta Bean Validation zur Laufzeit.
* `checkerframework` demonstriert statische Nullness- und Regex-Prüfungen beim
  Kompilieren.
* `jbossvalidation` bewahrt das Hibernate-spezifische `@ScriptAssert`-Beispiel.
  Dafür bleibt dieses Modul auf der letzten `javax.validation`-Generation von
  Hibernate Validator, da die Constraint in der Jakarta-Generation entfernt
  wurde.

Ein vollständiger Semantik-Check läuft mit `mvn clean verify`.


## JBoss Validation

* http://musingsofaprogrammingaddict.blogspot.de/2009/08/script-annotation-for-bean-validation.html


## Checkerframework

* http://2010.geecon.org/materials/presentations/2010_05_14/room_3/2010-geecon-warski.pdf
* http://in.relation.to/2010/05/07/a-validation-stickler/
* http://types.cs.washington.edu/jsr308/
* http://types.cs.washington.edu/checker-framework/current/checker-framework-manual.html
* http://types.cs.washington.edu/checker-framework/current/checker-framework-manual.html#maven
* http://types.cs.washington.edu/checker-framework/current/checker-framework-manual.html#eclipse
* http://types.cs.washington.edu/checker-framework/eclipse/
* http://types.cs.washington.edu/checker-framework/current/checker-framework-manual.html#intellij


## Bean Validation

*


        
        
        
