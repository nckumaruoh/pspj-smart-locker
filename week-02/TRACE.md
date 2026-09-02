# Week 2 verification trace

| Check | Result |
| --- | --- |
| Compiler | JDK 21, `--release 17` |
| Compile | `javac --release 17 -d <isolated-run> SmartLocker.java` — exit 0 |
| Run | `java -cp <isolated-run> SmartLocker` — exit 0 |
| Boundary check | `PKG-1001` accepted; malformed `1001` rejected |
| Evidence | [OUTPUT.txt](OUTPUT.txt) |

No clock or external data source is used; the receipt timestamp is a fixed test fixture.
