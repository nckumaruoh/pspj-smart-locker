# Week 1 verification trace

| Check | Result |
| --- | --- |
| Compiler | JDK 21, compiled with `--release 17` |
| Command | `javac --release 17 -d <isolated-run> SmartLocker.java` |
| Compile exit | 0 |
| Runtime command | `java -cp <isolated-run> SmartLocker` |
| Runtime exit | 0 |
| Evidence | Exact transcript in [OUTPUT.txt](OUTPUT.txt) |

The run has no external services, accounts or persisted data.
