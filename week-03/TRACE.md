# Week 3 verification trace

| Check | Result |
| --- | --- |
| Compiler | JDK 21, `--release 17` |
| Compile | `javac --release 17 -d <isolated-run> SmartLocker.java` — exit 0 |
| Run | `java -cp <isolated-run> SmartLocker` — exit 0 |
| Branch checks | Choices 1, 2, 3, 4 and invalid 9 executed |
| Evidence | [OUTPUT.txt](OUTPUT.txt) |
