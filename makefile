JC= javac
JA = java

default : clean compile run

clean:
	rm -f *.class
compile:
	$(JC) *.java
run:
	$(JA) TestRunner
