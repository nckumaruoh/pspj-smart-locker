# Week 4 verification trace

| Check | Result |
| --- | --- |
| Compiler | JDK 21, `--release 17` |
| Compile | `javac --release 17 -d <isolated-run> SmartLocker.java` — exit 0 |
| Run | `java -cp <isolated-run> SmartLocker` — exit 0 |
| Branch checks | SMALL, MEDIUM/priority, LARGE and unsupported XL |
| Evidence | [OUTPUT.txt](OUTPUT.txt) |
