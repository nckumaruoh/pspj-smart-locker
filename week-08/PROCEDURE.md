# Week 8 procedure — exception handling

1. Create `$run = Join-Path $env:TEMP "pspj-smart-locker-week-08"`.
2. Compile `javac --release 17 -d $run .\week-08\SmartLocker.java`.
3. Run `java -cp $run SmartLocker`.
4. Confirm one successful allocation and the safely handled no-locker condition.
5. Compare with [OUTPUT.txt](OUTPUT.txt).
