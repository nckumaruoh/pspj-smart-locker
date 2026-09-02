# Week 12 verification trace

| Check | Result |
| --- | --- |
| Compiler | JDK 21, `--release 17` |
| Compile | `javac --release 17 -d <isolated-run> SmartLocker.java` — exit 0 |
| Run location | Isolated writable run directory |
| Run | `java -cp <isolated-run> SmartLocker` — exit 0 |
| Integration check | Intake, slot allocation, collection, sorted report and local save passed |
| Evidence | [OUTPUT.txt](OUTPUT.txt) |
