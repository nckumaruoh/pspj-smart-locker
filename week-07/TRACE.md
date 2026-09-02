# Week 7 verification trace

| Check | Result |
| --- | --- |
| Compiler | JDK 21, `--release 17` |
| Compile | `javac --release 17 -d <isolated-run> SmartLocker.java` — exit 0 |
| Run | `java -cp <isolated-run> SmartLocker` — exit 0 |
| Object check | `Parcel` receipt contains ID, recipient and size |
| Evidence | [OUTPUT.txt](OUTPUT.txt) |
