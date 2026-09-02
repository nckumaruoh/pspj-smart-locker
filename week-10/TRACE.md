# Week 10 verification trace

| Check | Result |
| --- | --- |
| Compiler | JDK 21, `--release 17` |
| Compile | `javac --release 17 -d <isolated-run> SmartLocker.java` — exit 0 |
| Run location | Isolated writable run directory |
| Run | `java -cp <isolated-run> SmartLocker` — exit 0 |
| Persistence check | Local `parcel-log.txt` contains the saved fixture line |
| Evidence | [OUTPUT.txt](OUTPUT.txt) |
