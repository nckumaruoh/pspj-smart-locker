# Week 11 verification trace

| Check | Result |
| --- | --- |
| Compiler | JDK 21, `--release 17` |
| Compile | `javac --release 17 -d <isolated-run> SmartLocker.java` — exit 0 |
| Run | `java -cp <isolated-run> SmartLocker` — exit 0 |
| Collection check | READY parcels filtered and sorted by ID |
| Evidence | [OUTPUT.txt](OUTPUT.txt) |
