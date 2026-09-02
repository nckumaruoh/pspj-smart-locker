# Week 4 procedure — size-aware routing

1. Create `$run = Join-Path $env:TEMP "pspj-smart-locker-week-04"`.
2. Compile `javac --release 17 -d $run .\week-04\SmartLocker.java`.
3. Run `java -cp $run SmartLocker`.
4. Confirm the standard, priority and unsupported-size branches.
5. Compare with [OUTPUT.txt](OUTPUT.txt).
